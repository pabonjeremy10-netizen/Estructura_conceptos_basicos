/*Control de Acceso (Gimnasio)
Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.

El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día". Si no está, se le niega la entrada.
Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada. */ 

import java.util.Scanner;

public class ejer4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] codigos = {1001, 1020, 1050, 1100, 1200, 1300, 1500};

        System.out.print("Ingrese su código de acceso: ");
        int codigoIngresado = sc.nextInt();

        int inicio = 0;
        int fin = codigos.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {

            int mitad = (inicio + fin) / 2;

            if (codigos[mitad] == codigoIngresado) {
                encontrado = true;
                break;
            }

            if (codigoIngresado < codigos[mitad]) {
                fin = mitad - 1; 
            } else {
                inicio = mitad + 1; 
            }
        }

        if (encontrado) {
            System.out.println("Acceso permitido. Bienvenido al gym.");
        } else {
            System.out.println("Acceso denegado. Mensualidad pendiente.");
        }

        sc.close();
    }
}