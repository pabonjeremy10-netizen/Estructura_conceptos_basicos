/*Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.

El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.*/ 

public class ejer2 {

    public static void main(String[] args) {
        
        int[] cedulas = new int[1000];

        for (int i = 0; i < 1000; i++) {
            cedulas[i] = 100000 + i; 
        }

        int cedulaBuscada = 100450;
        int inicio = 0;
        int fin = cedulas.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {

            int mitad = (inicio + fin) / 2;

            if (cedulas[mitad] == cedulaBuscada) {
                System.out.println("Cliente encontrado en la posición: " + mitad);
                encontrado = true;
                break;
            }

            if (cedulaBuscada < cedulas[mitad]) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }
    }
}