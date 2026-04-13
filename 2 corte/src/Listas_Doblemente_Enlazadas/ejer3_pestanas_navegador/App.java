/*3. Navegación de Pestañas de Navegador
Imagina un navegador donde puedes moverte entre pestañas abiertas.

La Clase Pestana (Nodo): Debe contener tituloPagina(String), url(String) y horaApertura(String).
El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual y el foco debe pasar a la pestaña anterior .
Reto: Implementar el método cerrarPestanaActual(String url)que busque la pestaña por URL, la eliminación de la lista y reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con la Cabeza y la Cola!).
*/

package Listas_Doblemente_Enlazadas.ejer3_pestanas_navegador;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaPestanas lista = new ListaPestanas();

        int opcion;

        do {
            System.out.println("\n--- NAVEGADOR ---");
            System.out.println("1. Abrir pestaña");
            System.out.println("2. Cerrar pestaña por URL");
            System.out.println("3. Ver pestañas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("URL: ");
                    String url = sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    lista.agregarPestana(titulo, url, hora);
                    break;

                case 2:
                    System.out.print("URL a cerrar: ");
                    String cerrar = sc.nextLine();
                    lista.cerrarPestanaActual(cerrar);
                    break;

                case 3:
                    lista.mostrarPestanas();
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