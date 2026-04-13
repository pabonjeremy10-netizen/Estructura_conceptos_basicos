/*1.Sistema de Control de Versiones (Deshacer/Rehacer)
Diseña un editor de texto muy sencillo que guarda el historial de cambios.

La Clase Cambio (Nodo): Debe contener texto(String) y tipoOperacion(String - ej: "Escribir", "Borrar").
El Problema: Cada vez que el usuario escribe algo, se agrega un nodo al final. El usuario puede deshacer (retroceder al nodo anterior) y rehacer (avanzar al nodo siguiente).
Reto: Implementa métodos deshacer()y rehacer()que muevan un puntero actuala través de la lista doble.
*/

package Listas_Doblemente_Enlazadas.ejer1_control_versiones;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaCambios lista = new ListaCambios();

        int opcion;

        do {
            System.out.println("\n--- CONTROL DE VERSIONES ---");
            System.out.println("1. Agregar cambio");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Ver historial");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Texto: ");
                    String texto = sc.nextLine();

                    System.out.print("Tipo (Escribir/Borrar): ");
                    String tipo = sc.nextLine();

                    lista.agregarCambio(texto, tipo);
                    break;

                case 2:
                    lista.deshacer();
                    break;

                case 3:
                    lista.rehacer();
                    break;

                case 4:
                    lista.mostrarHistorial();
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
