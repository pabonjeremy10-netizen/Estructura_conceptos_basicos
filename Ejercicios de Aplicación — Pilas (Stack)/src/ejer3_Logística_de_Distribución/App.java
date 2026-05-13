package ejer3_Logística_de_Distribución;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaCamiones callejon = new PilaCamiones();

        int opcion;

        do {

            System.out.println("\n========= MENU =========");

            System.out.println("1. Agregar camion");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Calcular carga total");
            System.out.println("4. Ver camion del tope");
            System.out.println("5. Salir");

            System.out.print("\nSeleccione una opcion: ");
            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    String placa;
                    String conductor;
                    double carga;

                    System.out.print("\nPlaca: ");
                    placa = sc.nextLine();

                    System.out.print("Conductor: ");
                    conductor = sc.nextLine();

                    System.out.print("Carga en toneladas: ");
                    carga = sc.nextDouble();

                    callejon.push(
                            placa,
                            conductor,
                            carga
                    );

                    System.out.println("\nCamion agregado.");

                    break;

                case 2:

                    callejon.mostrarPila();

                    break;

                case 3:

                    double total =
                            callejon.calcularCargaTotal();

                    System.out.println(
                            "\nCarga total en el callejon: "
                                    + total
                                    + " toneladas"
                    );

                    break;

                case 4:

                    Camion cima = callejon.peek();

                    if (cima == null) {

                        System.out.println(
                                "\nLa pila esta vacia."
                        );
                    }
                    else {

                        System.out.println(
                                "\nCAMION EN EL TOPE"
                        );

                        System.out.println(
                                "Placa: "
                                        + cima.placa
                        );

                        System.out.println(
                                "Conductor: "
                                        + cima.conductor
                        );

                        System.out.println(
                                "Carga: "
                                        + cima.cargaToneladas
                                        + " toneladas"
                        );
                    }

                    break;

                case 5:

                    System.out.println(
                            "\nPrograma finalizado."
                    );

                    break;

                default:

                    System.out.println(
                            "\nOpcion invalida."
                    );
            }

        } while (opcion != 5);

        sc.close();
    }
}
