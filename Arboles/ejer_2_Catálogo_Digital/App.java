package Arboles.ejer_2_Catálogo_Digital;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArbolLibros arbol = new ArbolLibros();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- CATÁLOGO DIGITAL (BST) ---");
            System.out.println("1. Ver catálogo ordenado por ISBN");
            System.out.println("2. Ver árbol en PreOrden");
            System.out.println("3. Registrar libro");
            System.out.println("4. Buscar libro por ISBN");
            System.out.println("5. Verificar existencia de ISBN");
            System.out.println("6. Propiedades del árbol");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    arbol.imprimirCatalogo();

                    break;

                case 2:

                    arbol.preOrden();

                    break;

                case 3:

                    System.out.print("ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Año de publicación: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    arbol.insertar(isbn, titulo, autor, anio);

                    System.out.println("Libro registrado correctamente.");

                    break;

                case 4:

                    System.out.print("ISBN a buscar: ");
                    long isbnBuscar = scanner.nextLong();
                    scanner.nextLine();

                    Libro libro = arbol.buscar(isbnBuscar);

                    if (libro != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println(libro);
                    } else {
                        System.out.println("No existe un libro con ese ISBN.");
                    }

                    break;

                case 5:

                    System.out.print("ISBN a verificar: ");
                    long isbnVerificar = scanner.nextLong();
                    scanner.nextLine();

                    if (arbol.existeISBN(isbnVerificar)) {
                        System.out.println("El ISBN ya está registrado.");
                    } else {
                        System.out.println("El ISBN no existe en el catálogo.");
                    }

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