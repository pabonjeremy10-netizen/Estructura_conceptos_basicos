/*2. Inventario de Alimentos (Control de Caducidad)
Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.

La Clase Producto (Nodo): Debe contener nombre(String), cantidad(int) y diasParaVencer(int).
El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
Reto: Crea un método que imprime solo los productos que tienen menos de 5 días para vencer.
 */

package listas_enlazadas_simples.ejer2_Inventario_de_Alimentos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaProductos lista = new ListaProductos();

        int opcion;

        do {
            System.out.println("\n--- INVENTARIO DE ALIMENTOS ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver todos");
            System.out.println("3. Ver próximos a vencer (<5 días)");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    lista.agregarProducto(nombre, cantidad, dias);
                    break;

                case 2:
                    lista.mostrarProductos();
                    break;

                case 3:
                    lista.mostrarProximosAVencer();
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