/* 1. El Tren de Carga (Logística Ferroviaria)
Diseña un sistema para gestionar los vagones de un tren de carga internacional.

La Clase Vagon (Nodo): Debe contener contenido(String), pesoToneladas(double), origen(String) y destino(String).
El Problema: El tren sale de una estación y se le van enganchando vagones al final.
Reto: Implementa un método que recorra el tren y calcule el peso total de toda la carga transportada.
package listas_enlazadas_simples.ejer1_El_Tren_de_Carga;

*/

package listas_enlazadas_simples.ejer1_El_Tren_de_Carga;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaEnlazada tren = new ListaEnlazada();

        int opcion;

        do {
            System.out.println("\n--- TREN DE CARGA ---");
            System.out.println("1. Agregar vagón");
            System.out.println("2. Mostrar tren");
            System.out.println("3. Calcular peso total");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Contenido: ");
                    String contenido = sc.nextLine();

                    System.out.print("Peso (toneladas): ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Origen: ");
                    String origen = sc.nextLine();

                    System.out.print("Destino: ");
                    String destino = sc.nextLine();

                    tren.agregarVagon(contenido, peso, origen, destino);
                    break;

                case 2:
                    tren.mostrarTren();
                    break;

                case 3:
                    double total = tren.calcularPesoTotal();
                    System.out.println("Peso total del tren: " + total + " toneladas");
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