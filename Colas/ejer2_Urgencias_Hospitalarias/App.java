package Colas.ejer2_Urgencias_Hospitalarias;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ColaPaciente colaPacientes = new ColaPaciente();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE URGENCIAS HOSPITALARIAS ---");
            System.out.println("1. Ver pacientes en espera");
            System.out.println("2. Registrar paciente");
            System.out.println("3. Atender paciente");
            System.out.println("4. Ver siguiente paciente");
            System.out.println("5. Atender todos los pacientes");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nEstado actual de la cola:");
                    colaPacientes.imprimir();

                    break;

                case 2:

                    System.out.print("Cedula: ");
                    String cedula = scanner.nextLine();

                    System.out.print("Nombre Completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Sintoma Principal: ");
                    String sintoma = scanner.nextLine();

                    colaPacientes.enqueue(
                        new Paciente(cedula, nombre, edad, sintoma)
                    );

                    System.out.println("Paciente registrado correctamente.");

                    break;

                case 3:

                    Paciente atendido = colaPacientes.dequeue();

                    if (atendido != null) {

                        System.out.println("\nAtendiendo paciente:");
                        System.out.println("Nombre: " + atendido.nombreCompleto);
                        System.out.println("Sintoma: " + atendido.sintomaPrincipal);
                    }

                    break;

                case 4:

                    Paciente siguiente = colaPacientes.peek();

                    if (siguiente != null) {

                        System.out.println("\nSiguiente paciente:");
                        System.out.println("Nombre: " + siguiente.nombreCompleto);
                        System.out.println("Sintoma: " + siguiente.sintomaPrincipal);
                    }

                    break;

                case 5:

                    colaPacientes.atenderTodos();

                    break;

                case 6:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}