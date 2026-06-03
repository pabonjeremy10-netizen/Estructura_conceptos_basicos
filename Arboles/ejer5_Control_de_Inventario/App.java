package Arboles.ejer5_Control_de_Inventario;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArbolRepuestos arbol = new ArbolRepuestos();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- CONTROL DE INVENTARIO (BST) ---");
            System.out.println("1. Ver inventario ordenado");
            System.out.println("2. Registrar repuesto");
            System.out.println("3. Buscar repuesto");
            System.out.println("4. Generar backup PreOrden");
            System.out.println("5. Reporte de repuestos únicos");
            System.out.println("6. Propiedades del árbol");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    arbol.inOrden();

                    break;

                case 2:

                    System.out.print("Código de referencia: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();

                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();

                    arbol.insertar(codigo, descripcion, marca, stock);

                    System.out.println("Repuesto registrado correctamente.");

                    break;

                case 3:

                    System.out.print("Código a buscar: ");
                    int codigoBuscar = scanner.nextInt();
                    scanner.nextLine();

                    Repuesto encontrado = arbol.buscar(codigoBuscar);

                    if (encontrado != null) {
                        System.out.println("Repuesto encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Repuesto no encontrado.");
                    }

                    break;

                case 4:

                    arbol.backupPreOrden();

                    break;

                case 5:

                    arbol.reporteRepuestosUnicos();

                    break;

                case 6:

                    System.out.println("Altura del árbol: " + arbol.altura());
                    System.out.println("Nodos hoja: " + arbol.contarHojas());

                    break;

                case 7:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}