package ejer4_Farmacia_Automatizada;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaMedicamentos pila =
                new PilaMedicamentos();

        int opcion;

        do {

            System.out.println(
                    "\n========= MENU ========="
            );

            System.out.println(
                    "1. Agregar medicamento"
            );

            System.out.println(
                    "2. Mostrar pila"
            );

            System.out.println(
                    "3. Validar despacho"
            );

            System.out.println(
                    "4. Ver medicamento del tope"
            );

            System.out.println(
                    "5. Salir"
            );

            System.out.print(
                    "\nSeleccione una opcion: "
            );

            opcion = sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    String nombre;
                    String lote;
                    int dias;

                    System.out.print(
                            "\nNombre: "
                    );

                    nombre = sc.nextLine();

                    System.out.print(
                            "Lote: "
                    );

                    lote = sc.nextLine();

                    System.out.print(
                            "Dias para vencer: "
                    );

                    dias = sc.nextInt();

                    pila.push(
                            nombre,
                            lote,
                            dias
                    );

                    System.out.println(
                            "\nMedicamento agregado."
                    );

                    break;

                case 2:

                    pila.mostrarPila();

                    break;

                case 3:

                    pila.validarDespacho();

                    break;

                case 4:

                    Medicamento cima =
                            pila.peek();

                    if (cima == null) {

                        System.out.println(
                                "\nLa pila esta vacia."
                        );
                    }
                    else {

                        System.out.println(
                                "\nMEDICAMENTO EN EL TOPE"
                        );

                        System.out.println(
                                "Nombre: "
                                        + cima.nombre
                        );

                        System.out.println(
                                "Lote: "
                                        + cima.lote
                        );

                        System.out.println(
                                "Dias para vencer: "
                                        + cima.diasParaVencer
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
