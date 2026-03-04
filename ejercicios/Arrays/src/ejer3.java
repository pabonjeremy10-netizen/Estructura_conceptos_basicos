/*Sensor de Temperatura (Control de Calidad)
Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos.*/

public class ejer3 {

    public static void main(String[] args) {

        double[] temperaturas = {65.2, 70.5, 68.9, 75.3, 72.1, 80.4, 78.0};

        double max = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {

            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
        }

        System.out.println("La temperatura más alta registrada fue: " + max + "°C");
    }
}