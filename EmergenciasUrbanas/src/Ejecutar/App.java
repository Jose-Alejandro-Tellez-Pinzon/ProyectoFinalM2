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
    List<Emergencia> emergenciasAtendidas = new ArrayList<>();
    int tiempoTotalDeRespuesta = 0;
    static boolean getOut = false;

    static String[] tipoEmergencia = { "Incendio", "Robo", "Accidente vehicular" };
    static String[] gravedad = { "Baja", "Media", "Alta" };
    static String[] ubicacion = {};
    static String[] nuevaEmergencia = {};

    static int seleccionarGravedad;
    static int seleccionarTipoEmergencia;

    // public static void registrarUnaNuevaEmergencia() {
    // }

    // public static void verEstadoActualDeLosRecursos() {
    // }

    // public static void atenderUnaEmergencia() {
    // }

    // public static void mostrarEstadisticasDelDia() {
    // }

    // public static void finalizarElPrograma() {
    // }

    public static void Menu() {

        int opcion;

    

        do {
            showMenu();
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                nuevaEmergencia();

                    break;
                // case 2:
                // nuevaEmergencia();

                //     break;
                // case 3:
                //     verEstadoActualDeLosRecursos();

                //     break;
                // case 4:
                //     atenderUnaEmergencia();
                //     break;
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
        System.out.println("|  --°°° 1.BAJA °°°--   |");
        System.out.println("|  --°°° 2.MEDIA °°°--  |");
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
        return seleccionarTipoEmergencia;
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
        return seleccionarGravedad;
    }

    public static void nuevaEmergencia() {

        int tipoSeleccionado = seleccionarTipoEmergencia();
        String tipo = tipoEmergencia[tipoSeleccionado - 1]; // Convertir la selección en texto

        // Seleccionar el nivel de gravedad
        int gravedadSeleccionada = seleccionarGravedad();
        Gravedad gravedad = (gravedadSeleccionada == 1) ? Gravedad.BAJA
                : (gravedadSeleccionada == 2) ? Gravedad.MEDIA : Gravedad.ALTA;

        // Ingresar la ubicación
        System.out.print("Ingrese la ubicación del incidente: ");
        String ubicacion = read.nextLine();

        // Crear la emergencia según el tipo seleccionado
        Emergencia nuevaEmergencia;
        if (tipo.equals("Incendio")) {
            nuevaEmergencia = new Incendio(ubicacion, tipo, gravedad, 10);
        } else if (tipo.equals("Robo")) {
            nuevaEmergencia = new Robo(ubicacion, tipo, gravedad, 5);
        } else {
            nuevaEmergencia = new AccidenteVehicular(ubicacion, tipo, gravedad, 8);
        }

        System.out.println("Emergencia registrada con éxito:");
        System.out.println(nuevaEmergencia);
    }

}


/*
 * 
 * Gravedad gravedad = gravedadInput == 1 ? Gravedad.BAJA : gravedadInput == 2 ?
 * Gravedad.MEDIA : Gravedad.ALTA;
 * scanner.nextLine();
 * 
 * Emergencia nuevaEmergencia;
 * 
 * if (tipo.equalsIgnoreCase("Incendio")) {
 * nuevaEmergencia = new Incendio(ubicacion, tipo, gravedad, 10);
 * } else if (tipo.equalsIgnoreCase("Robo")) {
 * nuevaEmergencia = new Robo(ubicacion, tipo, gravedad, 5);
 * } else {
 * nuevaEmergencia = new AccidenteVehicular(ubicacion, tipo, gravedad, 8);
 * }
 * System.out.println("Emergencia registrada: " + nuevaEmergencia);
 * break;
 * case 2:
 * System.out.println("--- Estado Actual de los Recursos ---");
 * System.out.println(new Ambulancia());
 * System.out.println(new Bomberos());
 * System.out.println(new Policia(12345, true, "Policía", "Pistola", 2));
 * break;
 * case 3:
 * System.out.println("Atendiendo una emergencia...");
 * if (emergenciasAtendidas.isEmpty()) {
 * System.out.println("No hay emergencias registradas para atender.");
 * } else {
 * Emergencia emergencia = emergenciasAtendidas.remove(0);
 * tiempoTotalDeRespuesta+= emergencia.getTiempoDeRespuesta();
 * System.out.println("Emergencia atendida: " + emergencia);
 * }
 * break;
 * case 4:
 * System.out.println("--- Estadísticas del Día ---");
 * int totalEmergencias = emergenciasAtendidas.size();
 * double tiempoPromedio = totalEmergencias > 0 ? (double)
 * tiempoTotalDeRespuesta / totalEmergencias : 0;
 * System.out.println("Emergencias atendidas: " + totalEmergencias);
 * System.out.println("Tiempo promedio de respuesta: " + tiempoPromedio +
 * " minutos");
 * break;
 * case 5:
 * System.out.println("Guardando registro del día...");
 * System.out.println("Sistema listo para el siguiente ciclo.");
 * getOut = true;
 * break;
 * default:
 * System.out.println("Opción no válida, intente de nuevo.");
 * }
 * }
 * scanner.close();
 * }
 */


