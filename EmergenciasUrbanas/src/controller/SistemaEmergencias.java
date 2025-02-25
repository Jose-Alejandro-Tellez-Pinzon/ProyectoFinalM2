package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.AccidenteVehicular;
import model.Emergencia;
import model.Incendio;
import model.Robo;
import model.interfaces.IServicioEmergencia;
import model.observer.ObserverEmergencias;
import model.observer.SujetoEmergencias;
import model.services.Ambulancia;
import model.services.Bomberos;
import model.services.Policia;
import model.strategy.StrategyPrioridad;
import model.strategy.StrategyPrioridadGravedad;

public class SistemaEmergencias implements SujetoEmergencias {

    private static SistemaEmergencias instancia;
    private List<Emergencia> listasEmergencias;
    private List<IServicioEmergencia> listasRecursos;
    private List<ObserverEmergencias> observadores;

    private StrategyPrioridad strategyPrioridad;

    private int emergenciasAtendidas;
    private long tiempoTotalAtencion;

    private SistemaEmergencias() {
        strategyPrioridad = new StrategyPrioridadGravedad();
        listasEmergencias = new ArrayList<>();
        listasRecursos = new ArrayList<>();
        observadores = new ArrayList<>();
        emergenciasAtendidas = 0;
        tiempoTotalAtencion = 0;
    }

    public static SistemaEmergencias getInstancia() {
        if (instancia == null) {
            instancia = new SistemaEmergencias();
        }
        return instancia;
    }

    @Override
    public void agregarObservador(ObserverEmergencias observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(ObserverEmergencias observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarEmergencia(Emergencia emergencia) {
        for (ObserverEmergencias observador : observadores) {
            observador.onNuevasEmergencias(emergencia);
        }
    }

    public void registrarRecurso(IServicioEmergencia recurso) {

        listasRecursos.add(recurso);
    }

    public void mostrarEstadoRecursos() {

        System.out.println("Recursos disponibles: ");
        for (IServicioEmergencia recurso : listasRecursos) {
            System.out.println(recurso.toString());
        }
    }

    public List<IServicioEmergencia> filtrarRecursosDisponibles() {

        return listasRecursos.stream().filter(r -> r.estaDisponible()).collect(Collectors.toList());

    }

    public void registrarEmergencia(Emergencia emergencia) {

        listasEmergencias.add(emergencia);
        notificarEmergencia(emergencia);
    }

    public List<Emergencia> getEmergenciasPendientes() {

        return listasEmergencias.stream().filter(e -> !e.isAtendida()).collect(Collectors.toList());
    }

    public void asignarRecursos(Emergencia emergencia) {

        List<IServicioEmergencia> recursosDisponibles = filtrarRecursosDisponibles();

        if (recursosDisponibles.isEmpty()) {
            System.out.println("No hay recursos disponibles para atender la emergencia");
            return;
        }
        System.out.println("Asignando recurso automaticamente: ");

        if (emergencia instanceof Incendio) {
            for (IServicioEmergencia recurso : recursosDisponibles) {
                if (recurso instanceof Bomberos) {
                    recurso.atenderEmergencia(emergencia);
                    break;
                }
            }
        } else if (emergencia instanceof AccidenteVehicular) {
            for (IServicioEmergencia recurso : recursosDisponibles) {
                if (recurso instanceof Ambulancia) {
                    recurso.atenderEmergencia(emergencia);
                    break;
                }
            }

        } else if (emergencia instanceof Robo) {
            for (IServicioEmergencia recurso : recursosDisponibles) {
                if (recurso instanceof Policia) {
                    recurso.atenderEmergencia(emergencia);
                    break;
                }
            }
        }
    }

    public void atenderEmergencias(Emergencia emergencia) {

        if (emergencia.isAtendida()) {
            System.out.println("Emergencia ya atendida");
            return;
        }emergencia.iniciarAtencion();

    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
    }
    emergencia.finalizarAtencion();
    System.out.println("Emergencia atendida: " + emergencia.getDescripcion());
    emergenciasAtendidas++;
    tiempoTotalAtencion += emergencia.getTiempoDeRespuesta();
    }

    public void mostrarEstadisticas() {
        System.out.println("-------ESTADISTICAS-------");
        System.out.println("Emergencias atendidas: " + emergenciasAtendidas);

        long promedioMs=0;
        if(emergenciasAtendidas>0){
            promedioMs=tiempoTotalAtencion/emergenciasAtendidas;
        }
        double promedioSeg=promedioMs/1000.0;
        System.out.println("Tiempo promedio de respuesta: "+promedioSeg+" segundos");

        long noAtendidas= listasEmergencias.stream().filter(e->!e.isAtendida()).count();
        System.out.println("Emergencias pendientes: "+noAtendidas);
    }

    public void finalizarJornada(){

        mostrarEstadisticas();
        System.out.println("Guardando el registro...");
        System.out.println("El sistema se encutra listo para un nuevo dia.");

    }
        
    public void setStrategyPrioridad(StrategyPrioridad nuevaStrategy){
        strategyPrioridad=nuevaStrategy;
    }

}



    
