package listas_circulares.ejer3_round_robin;

package listas_circulares.ejer3_round_robin;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaProcesos lista = new ListaProcesos();

        int opcion;

        do {
            System.out.println("\n--- PLANIFICADOR ROUND ROBIN ---");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("PID: ");
                    int pid = sc.nextInt();

                    System.out.print("Tiempo restante: ");
                    int tiempo = sc.nextInt();

                    System.out.print("Prioridad (1-3): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();

                    lista.agregarProceso(nombre, pid, tiempo, prioridad);
                    break;

                case 2:
                    if (lista.cabeza == null) {
                        System.out.println("No hay procesos para ejecutar.");
                        break;
                    }

                    System.out.print("Ingrese el quantum: ");
                    int quantum = sc.nextInt();

                    lista.ejecutar(quantum);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}
