package ejer2_Control_de_Calidad;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaPiezas pila = new PilaPiezas();

        int opcion;

        do {

            System.out.println("\n========= MENU =========");

            System.out.println("1. Agregar pieza");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Limpiar hasta defecto");
            System.out.println("4. Ver pieza del tope");
            System.out.println("5. Salir");

            System.out.print("\nSeleccione una opcion: ");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    String nombre;
                    String serie;
                    boolean defectuosa;
                    String respuesta;

                    System.out.print("\nNombre de la pieza: ");
                    nombre = sc.nextLine();

                    System.out.print("Numero de serie: ");
                    serie = sc.nextLine();

                    System.out.print("¿Es defectuosa? (si/no): ");
                    respuesta = sc.nextLine();

                    defectuosa = respuesta.equalsIgnoreCase("si");

                    pila.push(nombre, serie, defectuosa);

                    System.out.println("\nPieza agregada correctamente.");

                    break;

                case 2:

                    pila.mostrarPila();

                    break;

                case 3:

                    pila.limpiarHastaDefecto();

                    break;

                case 4:

                    Pieza cima = pila.peek();

                    if (cima == null) {

                        System.out.println("\nLa pila está vacía.");
                    }
                    else {

                        System.out.println("\nPIEZA EN EL TOPE");

                        System.out.println("Nombre: "
                                + cima.nombrePieza);

                        System.out.println("Serie: "
                                + cima.numeroSerie);

                        System.out.println("Defectuosa: "
                                + (cima.esDefectuosa ? "SI" : "NO"));
                    }

                    break;

                case 5:

                    System.out.println("\nPrograma finalizado.");
                    break;

                default:

                    System.out.println("\nOpcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}