package Colas.ejer3_Impresora_Compartida;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ColaImpresion colaImpresion = new ColaImpresion();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE IMPRESION COMPARTIDA ---");
            System.out.println("1. Ver cola de impresión");
            System.out.println("2. Agregar documento");
            System.out.println("3. Imprimir documento");
            System.out.println("4. Ver siguiente documento");
            System.out.println("5. Calcular páginas totales");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nEstado actual de la cola:");
                    colaImpresion.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre del archivo: ");
                    String nombreArchivo = scanner.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = scanner.nextLine();

                    System.out.print("Número de páginas: ");
                    int paginas = scanner.nextInt();

                    System.out.print("¿Es a color? (true/false): ");
                    boolean color = scanner.nextBoolean();
                    scanner.nextLine();

                    colaImpresion.enqueue(
                        new Documento(nombreArchivo, usuario, paginas, color)
                    );

                    System.out.println("Documento agregado correctamente.");

                    break;

                case 3:

                    Documento impreso = colaImpresion.dequeue();

                    if (impreso != null) {

                        System.out.println("\nImprimiendo documento:");
                        System.out.println("Archivo: " + impreso.nombreArchivo);
                        System.out.println("Usuario: " + impreso.usuario);
                    }

                    break;

                case 4:

                    Documento siguiente = colaImpresion.peek();

                    if (siguiente != null) {

                        System.out.println("\nSiguiente documento:");
                        System.out.println("Archivo: " + siguiente.nombreArchivo);
                        System.out.println("Usuario: " + siguiente.usuario);
                    }

                    break;

                case 5:

                    int total = colaImpresion.calcularPaginasTotales();

                    System.out.println("\nTotal de páginas pendientes: " + total);

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