package ordenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class ejer5_Inspector_de_Eficiencia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- EL INSPECTOR DE EFICIENCIA ---");
        int[] datosOriginales = new int[6];
        
        System.out.println("Por favor, ingrese 6 números enteros desordenados:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            datosOriginales[i] = sc.nextInt();
        }

        int[] datosSelection = Arrays.copyOf(datosOriginales, 6);
        int[] datosInsertion = Arrays.copyOf(datosOriginales, 6);

        int intercambiosSelection = 0;
        for (int i = 0; i < datosSelection.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < datosSelection.length; j++) {
                if (datosSelection[j] < datosSelection[minIdx]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int temp = datosSelection[minIdx];
                datosSelection[minIdx] = datosSelection[i];
                datosSelection[i] = temp;
                intercambiosSelection++;
            }
        }

        int movimientosInsertion = 0;
        for (int i = 1; i < datosInsertion.length; i++) {
            int actual = datosInsertion[i];
            int j = i - 1;
            
            while (j >= 0 && datosInsertion[j] > actual) {
                datosInsertion[j + 1] = datosInsertion[j];
                j--;
                movimientosInsertion++;
            }
            datosInsertion[j + 1] = actual;
        }

        System.out.println("\n=======================================");
        System.out.println("   RESULTADOS DEL DUELO DE MÉTODOS");
        System.out.println("=======================================");
        System.out.println("Arreglo original: " + Arrays.toString(datosOriginales));
        System.out.println("Arreglo ordenado: " + Arrays.toString(datosSelection));
        System.out.println("---------------------------------------");
        System.out.println("SELECCIÓN hizo: " + intercambiosSelection + " intercambios físicos.");
        System.out.println(" INSERCIÓN hizo: " + movimientosInsertion + " movimientos de elementos.");
        System.out.println("---------------------------------------");

/* MI CONCLUSIÓN:
 Después de correr ambos métodos con los mismos números,
 me di cuenta de que la eficiencia depende totalmente de qué tan desordenada esté la lista al principio.
 Por un lado, Selección es como un trabajador 'lento pero seguro'.
 No importa si los números están súper mezclados o casi en su sitio, 
 él siempre revisa todo y solo hace un intercambio (swap) por cada vuelta.
 Es muy eficiente si lo que queremos es no estar moviendo datos a cada rato en la memoria del switch o la PC.
 Por otro lado, Inserción es mucho más 'sensible'. Si los números que metimos ya estaban medio ordenados, 
 Inserción termina rapidísimo porque casi no tiene que mover nada. Pero si le metemos los números al revés (del más grande al más pequeño), 
 el pobre tiene que estar empujando cada número muchas veces hacia la izquierda, y ahí es cuando Selección le gana por mucho.
 En resumen: Selección es mejor cuando la lista es un caos total porque hace menos cambios físicos, 
 pero Inserción es el ganador si la lista ya está casi lista porque se ahorra mucho trabajo.
 */
    }
}