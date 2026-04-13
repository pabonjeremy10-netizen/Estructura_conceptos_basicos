/*3. Torre de Control (Aterrizajes de Emergencia)
Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

La Clase Vuelo (Nodo): Debe contener numeroVuelo(String), aerolinea(String), combustibleRestante(int) y pasajeros(int).
El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 unidades de combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
Reto: Implementar el método reportarEmergencia(String numeroVuelo)que busque un vuelo en la cola y lo mueva al principio.
package listas_enlazadas_simples.ejer3_torre_de_control;
*/
package listas_enlazadas_simples.ejer3_torre_de_control;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaVuelos lista = new ListaVuelos();

        int opcion;

        do {
            System.out.println("\n--- TORRE DE CONTROL ---");
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Ver cola");
            System.out.println("3. Reportar emergencia");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Número de vuelo: ");
                    String num = sc.nextLine();

                    System.out.print("Aerolínea: ");
                    String aero = sc.nextLine();

                    System.out.print("Combustible: ");
                    int comb = sc.nextInt();

                    System.out.print("Pasajeros: ");
                    int pas = sc.nextInt();
                    sc.nextLine();

                    lista.agregarVuelo(num, aero, comb, pas);
                    break;

                case 2:
                    lista.mostrarVuelos();
                    break;

                case 3:
                    System.out.print("Número de vuelo en emergencia: ");
                    String emergencia = sc.nextLine();
                    lista.reportarEmergencia(emergencia);
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