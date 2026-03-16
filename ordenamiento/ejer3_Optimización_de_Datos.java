package ordenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class ejer3_Optimización_de_Datos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SISTEMA DE LOGÍSTICA (SHELL SORT) ---");
        System.out.print("Ingrese la cantidad de paquetes a procesar: ");
        int n = sc.nextInt();

        double[] pesos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Peso del paquete " + (i + 1) + " (kg): ");
            pesos[i] = sc.nextDouble();
        }

        System.out.println("\n Pesos originales: " + Arrays.toString(pesos));

        /* El método Shell es más rápido que la inserción simple porque permite que 
          los elementos den "saltos" hacia sus posiciones finales. 
          En la inserción simple, un elemento pequeño al final del arreglo debe 
          compararse y moverse una por una todas las posiciones. Shell Sort, 
          al usar un 'gap', mueve esos elementos grandes distancias en las 
          primeras pasadas, reduciendo drásticamente el desorden total antes 
          de hacer la inserción final.
         */

        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            for (int i = gap; i < n; i++) {
                double temp = pesos[i];
                int j;
                
                for (j = i; j >= gap && pesos[j - gap] > temp; j -= gap) {
                    pesos[j] = pesos[j - gap];
                }
                
                pesos[j] = temp;
            }
            System.out.println("Salto (gap) " + gap + ": " + Arrays.toString(pesos));
        }

        System.out.println("\n-------------------------------------------");
        System.out.println(" LOGÍSTICA: Paquetes ordenados eficientemente");
        System.out.println("Lista final: " + Arrays.toString(pesos));
        System.out.println("-------------------------------------------");

        sc.close();
    }
}