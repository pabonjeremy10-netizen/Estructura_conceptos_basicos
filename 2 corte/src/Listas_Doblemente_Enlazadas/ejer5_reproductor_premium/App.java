/* 5. Reproductor de Música Premium
Mejora el ejercicio de Spotify de la semana pasada usando listas dobles.

La Clase Cancion (Nodo): Debe contener titulo(String), artista(String) y duracion(int).
El Problema: El reproductor ahora permite la función "Canción Anterior" de manera eficiente sin tener que recorrer toda la lista desde el principio.
Reto: Implementa un método saltarAtras()que retrocede una posición y saltarAdelante()que avanza una. Si se intenta saltar hacia atrás desde la primera canción, debe mostrar un mensaje de error.
*/
package Listas_Doblemente_Enlazadas.ejer5_reproductor_premium;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaCanciones lista = new ListaCanciones();

        int opcion;

        do {
            System.out.println("\n--- REPRODUCTOR PREMIUM ---");
            System.out.println("1. Agregar canción");
            System.out.println("2. Siguiente");
            System.out.println("3. Anterior");
            System.out.println("4. Ver actual");
            System.out.println("5. Ver lista");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    lista.agregarCancion(titulo, artista, duracion);
                    break;

                case 2:
                    lista.saltarAdelante();
                    break;

                case 3:
                    lista.saltarAtras();
                    break;

                case 4:
                    lista.mostrarActual();
                    break;

                case 5:
                    lista.mostrarLista();
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