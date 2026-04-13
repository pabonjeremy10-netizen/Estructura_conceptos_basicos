/*4. Monitoreo Industrial (Sensores en Tiempo Real)
Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

La Clase Lectura (Nodo): Debe contener idSensor(int), temperatura(double), presion(double) y hora(String).
El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
Reto: Implemente un método que busque y muestre la lectura con la temperatura más alta registrada en el historial.
package listas_enlazadas_simples.ejer4_monitoreo_industrial;
*/
package listas_enlazadas_simples.ejer4_monitoreo_industrial;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaLecturas lista = new ListaLecturas();

        int opcion;

        do {
            System.out.println("\n--- MONITOREO INDUSTRIAL ---");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Ver lecturas");
            System.out.println("3. Ver temperatura máxima");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("ID Sensor: ");
                    int id = sc.nextInt();

                    System.out.print("Temperatura: ");
                    double temp = sc.nextDouble();

                    System.out.print("Presión: ");
                    double pres = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    lista.agregarLectura(id, temp, pres, hora);
                    break;

                case 2:
                    lista.mostrarLecturas();
                    break;

                case 3:
                    lista.mostrarTemperaturaMaxima();
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