package ejer5_Ruta_de_Rescate;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaEstaciones pila =
                new PilaEstaciones();

        int opcion;

        do {

            System.out.println(
                    "\n========= MENU ========="
            );

            System.out.println(
                    "1. Agregar estacion"
            );

            System.out.println(
                    "2. Mostrar estaciones"
            );

            System.out.println(
                    "3. Retroceder a superficie"
            );

            System.out.println(
                    "4. Ver estacion del tope"
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
                    int profundidad;
                    double oxigeno;

                    System.out.print(
                            "\nNombre del punto: "
                    );

                    nombre = sc.nextLine();

                    System.out.print(
                            "Profundidad: "
                    );

                    profundidad = sc.nextInt();

                    System.out.print(
                            "Nivel de oxigeno (%): "
                    );

                    oxigeno = sc.nextDouble();

                    pila.push(
                            nombre,
                            profundidad,
                            oxigeno
                    );

                    System.out.println(
                            "\nEstacion agregada."
                    );

                    break;

                case 2:

                    pila.mostrarPila();

                    break;

                case 3:

                    pila.retrocederASuperficie();

                    break;

                case 4:

                    Estacion cima =
                            pila.peek();

                    if (cima == null) {

                        System.out.println(
                                "\nLa pila esta vacia."
                        );
                    }
                    else {

                        System.out.println(
                                "\nESTACION EN EL TOPE"
                        );

                        System.out.println(
                                "Nombre: "
                                        + cima.nombrePunto
                        );

                        System.out.println(
                                "Profundidad: "
                                        + cima.profundidad
                        );

                        System.out.println(
                                "Nivel de oxigeno: "
                                        + cima.nivelOxigeno
                                        + "%"
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