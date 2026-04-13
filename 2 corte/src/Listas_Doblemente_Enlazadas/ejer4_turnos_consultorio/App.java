/* 4. Turnos de Consultorio Médico (Prioridad de Emergencia)
Gestiona una fila de pacientes donde algunos pueden tener emergencias.

La Clase Paciente (Nodo): Debe contener nombre(String), edad(int) y nivelUrgencia(1 al 5).
El Problema: Los pacientes normalmente se agregan al final. Pero si un paciente tiene nivelUrgencia == 5, debe ser movido justo después de la Cabeza.
Reto: Implementa un método que recorra la lista desde la Cola hacia la Cabeza para encontrar al paciente de mayor edad y mostrar sus datos.
*/
package Listas_Doblemente_Enlazadas.ejer4_turnos_consultorio;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaPacientes lista = new ListaPacientes();

        int opcion;

        do {
            System.out.println("\n--- CONSULTORIO ---");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Ver lista");
            System.out.println("3. Paciente mayor edad");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    System.out.print("Nivel urgencia (1-5): ");
                    int urgencia = sc.nextInt();
                    sc.nextLine();

                    lista.agregarPaciente(nombre, edad, urgencia);
                    break;

                case 2:
                    lista.mostrarPacientes();
                    break;

                case 3:
                    lista.mostrarMayorEdad();
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