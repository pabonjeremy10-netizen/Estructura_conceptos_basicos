package Colas.ejer4_Peaje_Inteligente;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ColaPeaje colaPeaje = new ColaPeaje();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE PEAJE INTELIGENTE ---");
            System.out.println("1. Ver cola de vehículos");
            System.out.println("2. Registrar vehículo");
            System.out.println("3. Procesar vehículo");
            System.out.println("4. Ver siguiente vehículo");
            System.out.println("5. Cerrar turno");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nEstado actual de la cola:");
                    colaPeaje.imprimir();

                    break;

                case 2:

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Tipo de vehículo: ");
                    String tipo = scanner.nextLine();

                    System.out.print("Tarifa: ");
                    double tarifa = scanner.nextDouble();

                    System.out.print("¿Es exento? (true/false): ");
                    boolean exento = scanner.nextBoolean();
                    scanner.nextLine();

                    colaPeaje.enqueue(
                        new Vehiculo(placa, tipo, tarifa, exento)
                    );

                    System.out.println("Vehículo registrado correctamente.");

                    break;

                case 3:

                    Vehiculo procesado = colaPeaje.dequeue();

                    if (procesado != null) {

                        System.out.println("\nProcesando vehículo:");
                        System.out.println("Placa: " + procesado.placa);
                        System.out.println("Tipo: " + procesado.tipoVehiculo);
                    }

                    break;

                case 4:

                    Vehiculo siguiente = colaPeaje.peek();

                    if (siguiente != null) {

                        System.out.println("\nSiguiente vehículo:");
                        System.out.println("Placa: " + siguiente.placa);
                        System.out.println("Tipo: " + siguiente.tipoVehiculo);
                    }

                    break;

                case 5:

                    colaPeaje.cerrarTurno();

                    break;

                case 6:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}