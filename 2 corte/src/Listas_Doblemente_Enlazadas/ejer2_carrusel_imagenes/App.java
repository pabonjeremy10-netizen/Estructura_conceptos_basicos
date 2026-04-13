/*2. Carrusel de Imágenes (Galería Interactiva)
Simula el comportamiento de una galería de fotos en una aplicación móvil.

La Clase Fotografia (Nodo): Debe contener nombreArchivo(String), tamanoMB(double) y resolucion(String).
El Problema: El usuario puede avanzar a la "Foto Siguiente" o retroceder a la "Foto Anterior". Si llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
Reto: Crea un método reproducirGaleria()que recorra toda la lista hacia adelante y luego toda la lista hacia atrás para mostrar todas las fotos.
*/
package Listas_Doblemente_Enlazadas.ejer2_carrusel_imagenes;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaFotos galeria = new ListaFotos();

        int opcion;

        do {
            System.out.println("\n--- GALERÍA DE FOTOS ---");
            System.out.println("1. Agregar foto");
            System.out.println("2. Siguiente");
            System.out.println("3. Anterior");
            System.out.println("4. Ver actual");
            System.out.println("5. Reproducir galería");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre archivo: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tamaño MB: ");
                    double tamano = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Resolución: ");
                    String res = sc.nextLine();

                    galeria.agregarFoto(nombre, tamano, res);
                    break;

                case 2:
                    galeria.siguiente();
                    break;

                case 3:
                    galeria.anterior();
                    break;

                case 4:
                    galeria.mostrarActual();
                    break;

                case 5:
                    galeria.reproducirGaleria();
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