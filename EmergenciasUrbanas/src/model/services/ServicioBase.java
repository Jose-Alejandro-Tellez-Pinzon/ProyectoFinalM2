package model.services;

import model.Emergencia;
import model.interfaces.IServicioEmergencia;

public abstract class ServicioBase implements IServicioEmergencia {

    private int id;
    private int personalDisponible;
    private int combustible;

    public ServicioBase(int id, int personalDisponible, int combustible) {
        this.id = id;
        this.personalDisponible = personalDisponible;
        this.combustible = combustible;
    }

    @Override
    public int getid() {
        return id;
    }

    @Override
    public int getPesonalDisponible() {
        return personalDisponible;
    }

    @Override
    public int getCombustible() {
        return combustible;
    }

    @Override
    public boolean estaDisponible() {
        return personalDisponible > 0 && combustible > 0;
    }

    @Override
    public void asignarPersonal(int cantidad) {
        if (cantidad <= personalDisponible) {
            personalDisponible -= cantidad;
        }else{
            System.out.println( "No hay personal Disponible en el servicio" + id);
        }
    }

    @Override
    public void liberarPersonal(int cantidad) {
        personalDisponible += cantidad;
    }

    @Override
    public void gastarcombustible(int cantidad) {
       
        
        combustible = Math.max(0, combustible - cantidad);
    }

    @Override
    public void tanquearcombustible(int cantidad) {
        combustible += cantidad;
    }

    public abstract void atenderEmergencia(Emergencia emergencia);

    @Override
    public String toString() {
        return "ServicioBase [id=" + id + ", personalDisponible=" + personalDisponible + ", combustible=" + combustible
                + "]";
    } 

    
    
}
