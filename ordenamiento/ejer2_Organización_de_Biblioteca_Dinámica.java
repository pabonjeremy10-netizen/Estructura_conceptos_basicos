package ordenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class ejer2_Organización_de_Biblioteca_Dinámica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEMA DE ORGANIZACIÓN DE BIBLIOTECA ---");
        System.out.print("¿Cuántos libros llegaron en la caja?: ");
        int cantidad = sc.nextInt();

        int[] librosISBN = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el código ISBN del libro " + (i + 1) + ": ");
            librosISBN[i] = sc.nextInt();
        }

        System.out.println("\n Estado inicial de la caja: " + Arrays.toString(librosISBN));
        System.out.println("----------------------------------------------");

        for (int i = 1; i < librosISBN.length; i++) {
            int libroActual = librosISBN[i]; 
            int j = i - 1;

            while (j >= 0 && librosISBN[j] > libroActual) {
                librosISBN[j + 1] = librosISBN[j];
                j--;
            }
            
            librosISBN[j + 1] = libroActual;

            System.out.println("Paso " + i + ": Insertando ISBN " + libroActual + " -> " + Arrays.toString(librosISBN));
        }

        System.out.println("----------------------------------------------");
        System.out.println("¡Estante organizado con éxito!");
        System.out.println("Orden final (ISBN): " + Arrays.toString(librosISBN));

        sc.close();
    }
}