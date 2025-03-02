package Ejecutar;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Emergencias.*;
import UnidadesDeEmergencia.* ;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        List<Emergencia> emergenciasAtendidas = new ArrayList<>();
        int tiempoTotalDeRespuesta = 0;
        boolean getOut = false;

        
        while (!getOut) {
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
            
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 0:
                    System.out.println("--°°° Ingrese el tipo de emergencia °°°-- ");
                    System.out.println("____________________________________");
                    System.out.println("|                                   |");
                    System.out.println("|         --°°° Robo °°°--          |");
                    System.out.println("|       --°°° Incendio °°°--        |");
                    System.out.println("|  --°°° Accidente Vehicular °°°--  |");
                    System.out.println("|___________________________________|");
                    String tipo = scanner.nextLine();

                    System.out.println("--°°° Ingrese la ubicación °°°-- ");
                    String ubicacion = scanner.nextLine();

                    System.out.println("--°°° Seleccione el nivel de gravedad °°°--");
                    System.out.println("________________________");
                    System.out.println("|                       |");
                    System.out.println("|  --°°° 1.BAJA °°°--   |");
                    System.out.println("|  --°°° 2.MEDIA °°°--  |");
                    System.out.println("|  --°°° 3.ALTA °°°--   |");
                    System.out.println("|_______________________|");
                    int gravedadInput = scanner.nextInt();

                    Gravedad gravedad = gravedadInput == 1 ? Gravedad.BAJA : gravedadInput == 2 ? Gravedad.MEDIA : Gravedad.ALTA;
                    scanner.nextLine();
                    
                    Emergencia nuevaEmergencia;
                    
                    if (tipo.equalsIgnoreCase("Incendio")) {
                        nuevaEmergencia = new Incendio(ubicacion, tipo, gravedad, 10);
                    } else if (tipo.equalsIgnoreCase("Robo")) {
                        nuevaEmergencia = new Robo(ubicacion, tipo, gravedad, 5);
                    } else {
                        nuevaEmergencia = new AccidenteVehicular(ubicacion, tipo, gravedad, 8);
                    }
                    System.out.println("Emergencia registrada: " + nuevaEmergencia);
                    break;
                 case 1:
                    System.out.println("--- Estado Actual de los Recursos ---");
                    System.out.println(new Ambulancia());
                    System.out.println(new Bomberos());
                    System.out.println(new Policia(12345, true, "Policía", "Pistola", 2));
                    break;
                case 2:
                    System.out.println("Atendiendo una emergencia...");
                    if (emergenciasAtendidas.isEmpty()) {
                        System.out.println("No hay emergencias registradas para atender.");
                    } else {
                        Emergencia emergencia = emergenciasAtendidas.remove(0);
                        tiempoTotalDeRespuesta+= emergencia.getTiempoDeRespuesta();
                        System.out.println("Emergencia atendida: " + emergencia);
                    }
                    break;
                case 3:
                    System.out.println("--- Estadísticas del Día ---");
                    int totalEmergencias = emergenciasAtendidas.size();
                    double tiempoPromedio = totalEmergencias > 0 ? (double) tiempoTotalDeRespuesta / totalEmergencias : 0;
                    System.out.println("Emergencias atendidas: " + totalEmergencias);
                    System.out.println("Tiempo promedio de respuesta: " + tiempoPromedio + " minutos");
                    break;
                case 4:
                    System.out.println("Guardando registro del día...");
                    System.out.println("Sistema listo para el siguiente ciclo.");
                    getOut = true;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        scanner.close();
      }
  }