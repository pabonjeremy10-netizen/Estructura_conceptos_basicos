package ordenamiento;
import java.util.Scanner;

public class ejer1_podio_de_la_competencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de corredores (5 a 10): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Se necesitan al menos 3 corredores para completar el podio.");
            return;
        }

        double[] tiempos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el tiempo del corredor " + (i + 1) + " (segundos): ");
            tiempos[i] = sc.nextDouble();
        }

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i; 

            for (int j = i + 1; j < n; j++) {
                if (tiempos[j] < tiempos[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            double temp = tiempos[indiceMinimo];
            tiempos[indiceMinimo] = tiempos[i];
            tiempos[i] = temp;
        }

        System.out.println("\n=======================================");
        System.out.println("   RESULTADOS FINALES (Ordenados) ");
        System.out.println("=======================================");
        
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println((i + 1) + ". " + tiempos[i] + " segundos");
        }

        System.out.println("\n----------- MEDALLERO -----------");
        System.out.println("ORO:    " + tiempos[0] + " s");
        System.out.println("PLATA:  " + tiempos[1] + " s");
        System.out.println("BRONCE: " + tiempos[2] + " s");
        System.out.println("---------------------------------");
        
        sc.close();
    }
}