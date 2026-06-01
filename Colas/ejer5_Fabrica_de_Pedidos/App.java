package Colas.ejer5_Fabrica_de_Pedidos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ColaPedido colaPedido = new ColaPedido();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE PEDIDOS E-COMMERCE ---");
            System.out.println("1. Ver cola de pedidos");
            System.out.println("2. Registrar pedido");
            System.out.println("3. Procesar un pedido");
            System.out.println("4. Ver siguiente pedido");
            System.out.println("5. Procesar todos los pedidos");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nEstado actual de la cola:");
                    colaPedido.imprimir();

                    break;

                case 2:

                    System.out.print("Número de pedido: ");
                    String numero = scanner.nextLine();

                    System.out.print("Cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Total a pagar: ");
                    double total = scanner.nextDouble();

                    System.out.print("¿Pedido cancelado? (true/false): ");
                    boolean cancelado = scanner.nextBoolean();
                    scanner.nextLine();

                    colaPedido.enqueue(
                        new Pedido(numero, cliente, total, cancelado)
                    );

                    System.out.println("Pedido registrado correctamente.");

                    break;

                case 3:

                    Pedido procesado = colaPedido.dequeue();

                    if (procesado != null) {

                        System.out.println("\nPedido procesado:");
                        System.out.println("Pedido: " + procesado.numeroPedido);
                        System.out.println("Cliente: " + procesado.cliente);
                    }

                    break;

                case 4:

                    Pedido siguiente = colaPedido.peek();

                    if (siguiente != null) {

                        System.out.println("\nSiguiente pedido:");
                        System.out.println("Pedido: " + siguiente.numeroPedido);
                        System.out.println("Cliente: " + siguiente.cliente);
                    }

                    break;

                case 5:

                    colaPedido.procesarPedidos();

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