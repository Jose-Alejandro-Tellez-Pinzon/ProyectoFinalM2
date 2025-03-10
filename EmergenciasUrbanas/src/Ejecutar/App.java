package Ejecutar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Emergencias.*;
import UnidadesDeEmergencia.*;

 public class App {
    public static void main(String[] args) {
        Menu();
    }

    static Scanner read = new Scanner(System.in);
    static List<Emergencia> emergenciasAtendidas = new ArrayList<>();
    static int tiempoTotalDeRespuesta = 0;
    static boolean getOut = false;

    static String[] tipoEmergencia = { "Robo", "Incendio", "Accidente vehicular" };
    static String[] gravedad = { "Media", "Baja", "Alta" };
    static String[] ubicacion = {};
    static String[] nuevaEmergencia = {};

    static int seleccionarGravedad;
    static int seleccionarTipoEmergencia;
    static int seleccionarUnidadesDeEmergencia;


    public static void Menu() {
        int opcion;

        do {
            showMenu();
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    nuevaEmergencia();
                  break;
                case 2:
                    verEstadoActualDeLosRecursos();
                  break;
                case 3:
                    atenderUnaEmergencia();
                  break;
                case 4:
                    mostrarEstadisticasDelDia();
                     break;
                 case 5:
                     getOut = true;
                     break;
                 default:
                    System.err.println("Opcion incorrecta");

            }
        } while (!getOut);
        System.out.println();
        System.out.println("--°°°!Gracias por utilizar el programa¡°°°--");
        read.close();
    }
    
    public static void showMenu() {
        System.out.println("   ____________________________________________");
        System.out.println("  /                                           /|");
        System.out.println(" /  -----°°°°°°°°°  Opciones  °°°°°°°°°----- / |");
        System.out.println("/__________________________________________ /__|");
        System.out.println("|                                           |  |");
        System.out.println("|    1. Registrar una nueva emergencia      |  |");
        System.out.println("|    2. Ver estado actual de los recursos   |  |");
        System.out.println("|    3. Atender una emergencia              |  |");
        System.out.println("|    4. Mostrar estadísticas del día        |  |");
        System.out.println("|    5. Finalizar el Programa               |  |");
        System.out.println("|                                           |  |");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println();
        System.out.println(" -----°°°°°°°°° Seleccione una opcion °°°°°°°°°-----");
    }

    public static void showTipoEmergencia() {

        System.out.println("--°°° Selecciona el tipo de emergencia °°°-- ");
        System.out.println("______________________________________");
        System.out.println("|                                     |");
        System.out.println("|         --°°° 1.Robo °°°--          |");
        System.out.println("|       --°°° 2.Incendio °°°--        |");
        System.out.println("|  --°°° 3.Accidente Vehicular °°°--  |");
        System.out.println("|_____________________________________|");

    }

    public static void showGravedad() {
        System.out.println("--°°° Seleccione el nivel de gravedad °°°--");
        System.out.println("________________________");
        System.out.println("|                       |");
        System.out.println("|  --°°° 1.MEDIA °°°--  |");
        System.out.println("|  --°°° 2.BAJA °°°--   |");
        System.out.println("|  --°°° 3.ALTA °°°--   |");
        System.out.println("|_______________________|");
    }

    public static int seleccionarTipoEmergencia() {

        int opcion;
        showTipoEmergencia();
        opcion = read.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(tipoEmergencia[0]);
                break;
            case 2:
                System.out.println();
                System.out.println(tipoEmergencia[1]);
                break;
            case 3:
                System.out.println();
                System.out.println(tipoEmergencia[2]);
                break;

            default:
                System.err.println("Emergencia incorrecta");
                break;
        }
        return opcion;
    }

    public static int seleccionarGravedad() {
        int opcion;
        showGravedad();
        opcion = read.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(gravedad[0]);
                break;
            case 2:
                System.out.println(gravedad[1]);
                break;
            case 3:
                System.out.println(gravedad[2]);
                break;
            default:
                System.out.println("Elección incorrecta");
                break;
        }
        return opcion;
    }

    public static void nuevaEmergencia() {

        System.out.println("--°°° Iniciando registro de una nueva emergencia...°°°--");

        int tipoSeleccionado = seleccionarTipoEmergencia();
        if (tipoSeleccionado < 1 || tipoSeleccionado > tipoEmergencia.length) {
            System.err.println("--°° Tipo de emergencia incorrecto °°--");
            return;
        }
        String tipo = tipoEmergencia[tipoSeleccionado - 1]; // Convertir la selección en texto
        System.out.println("--°° Tipo de emergencia seleccionado  " + tipo + " °°--");

        // Seleccionar el nivel de gravedad
        int gravedadSeleccionada = seleccionarGravedad();
        Gravedad gravedad = (gravedadSeleccionada == 1) ? Gravedad.MEDIA
                : (gravedadSeleccionada == 2) ? Gravedad.BAJA : Gravedad.ALTA;
        System.out.println("--°° Gravedad seleccionada: " + gravedad + " °°--");

        // Ingresar la ubicación
        System.out.println("--°°° Ingrese la ubicación del incidente °°°--");
        read.nextLine(); // Consumir la nueva línea pendiente
        String ubicacion = read.nextLine();
        System.out.println("--°° Ubicación ingresada: " + ubicacion + " °°--");

        // Ingresar el tiempo de respuesta
        System.out.println("--°°° Ingrese el tiempo de respuesta en minutos °°°--");
        int tiempoDeRespuesta = read.nextInt();
        System.out.println("--°° Tiempo de respuesta ingresado: " + tiempoDeRespuesta + " minutos °°--");

        Emergencia nuevaEmergencia;
        if (tipo.equals("Incendio")){
            nuevaEmergencia = new Incendio(ubicacion, tipo, gravedad, tiempoDeRespuesta);
        } else if (tipo.equals("Robo")){
            nuevaEmergencia = new Robo(ubicacion, tipo, gravedad, tiempoDeRespuesta);
        } else {
            nuevaEmergencia = new AccidenteVehicular(ubicacion, tipo, gravedad, tiempoDeRespuesta);
        }

        emergenciasAtendidas.add(nuevaEmergencia); // Agregar la nueva emergencia a la lista
        System.out.println("--°°° Emergencia registrada con éxito °°°--");
        System.out.println(nuevaEmergencia);
  } 
        
       public static void showUnidadesDeEmergencia() {
        System.out.println("--°°° Selecciona el tipo de emergencia °°°-- ");
        System.out.println("___________________________________");
        System.out.println("|                                 |");
        System.out.println("|      --°°° 1.Policia °°°--      |");
        System.out.println("|     --°°° 2.Bomberos °°°--      |");
        System.out.println("|    --°°° 3.Ambulancia °°°--     |");
        System.out.println("|_________________________________|");
       }

       public static int seleccionarUnidadesDeEmergencia() {

        int opcion;
        showUnidadesDeEmergencia();
        opcion = read.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("--°° Estado actual de los recursos de la Policia °°--");
                System.out.println(new Policia(12345, true, "Patrulla de investigación criminal", "Pistola", 2));
                break;
            case 2:
                System.out.println("--°° Estado actual de los recursos de los Bomberos °°--");
                System.out.println(new Bomberos());
                break;
            case 3:
                System.out.println("--°° Estado Actual de los recursos de la Ambulancia °°--");
                System.out.println(new Ambulancia());
                break;

            default:
                System.err.println("--°° Opción incorrecta °°--");
                break;
        }
        return opcion;
    }
    public static void verEstadoActualDeLosRecursos() {

        int tipoSeleccionado = seleccionarUnidadesDeEmergencia();
        if (tipoSeleccionado < 1 || tipoSeleccionado > tipoEmergencia.length) {
            System.out.println("--°° Tipo de emergencia incorrecto °°--");
            return;
        }
    }

    public static void atenderUnaEmergencia() {


        System.out.println("---°°° Atendiendo una emergencia...°°°---");
        if (emergenciasAtendidas.isEmpty()) {
            System.out.println("--°° No hay emergencias registradas para atender.°°--");
        } else {
            Emergencia emergencia = emergenciasAtendidas.remove(0);
            tiempoTotalDeRespuesta += emergencia.getTiempoDeRespuesta();
            System.out.println("--°° Emergencia atendida: " + emergencia + "°°--");
        }
    }
   
    public static void mostrarEstadisticasDelDia() {

        System.out.println("---°°° Mostrando las estadísticas del día °°°---");
        int totalEmergencias = emergenciasAtendidas.size();
        double tiempoPromedio = totalEmergencias > 0 ? (double) tiempoTotalDeRespuesta / totalEmergencias : 0;
        System.out.println("--°° Emergencias atendidas: " + totalEmergencias + " °°--");
        System.out.println("--°° Tiempo promedio de respuesta: " + tiempoPromedio + " minutos °°--");
    }

}




