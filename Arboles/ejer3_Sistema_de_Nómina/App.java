package Arboles.ejer3_Sistema_de_Nómina;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArbolEmpleados arbol = new ArbolEmpleados();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE NÓMINA (BST) ---");
            System.out.println("1. Ver empleados ordenados por cédula");
            System.out.println("2. Ver árbol en PreOrden");
            System.out.println("3. Registrar empleado");
            System.out.println("4. Buscar empleado por cédula");
            System.out.println("5. Buscar empleado con menor cédula");
            System.out.println("6. Buscar empleado con mayor cédula");
            System.out.println("7. Reporte de eficiencia");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    arbol.inOrden();

                    break;

                case 2:

                    arbol.preOrden();

                    break;

                case 3:

                    System.out.print("Cédula: ");
                    long cedula = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    arbol.insertar(cedula, nombre, cargo, salario);

                    System.out.println("Empleado registrado correctamente.");

                    break;

                case 4:

                    System.out.print("Ingrese la cédula a buscar: ");
                    long cedulaBuscar = scanner.nextLong();
                    scanner.nextLine();

                    Empleado encontrado = arbol.buscar(cedulaBuscar);

                    if (encontrado != null) {
                        System.out.println("Empleado encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }

                    break;

                case 5:

                    Empleado minimo = arbol.buscarMinimo();

                    if (minimo != null) {
                        System.out.println("Empleado con menor cédula:");
                        System.out.println(minimo);
                    } else {
                        System.out.println("El árbol está vacío.");
                    }

                    break;

                case 6:

                    Empleado maximo = arbol.buscarMaximo();

                    if (maximo != null) {
                        System.out.println("Empleado con mayor cédula:");
                        System.out.println(maximo);
                    } else {
                        System.out.println("El árbol está vacío.");
                    }

                    break;

                case 7:

                    arbol.reporteEficiencia();

                    break;

                case 8:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
}