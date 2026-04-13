package listas_circulares.ejer3_round_robin;

import java.util.ArrayList;

public class ListaProcesos {

    Proceso cabeza;
    Proceso cola;

    public ListaProcesos() {
        cabeza = null;
        cola = null;
    }

    public void agregarProceso(String nombre, int pid, int tiempo, int prioridad) {

        Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public void ejecutar(int quantum) {

        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }

        ArrayList<String> ordenFinalizacion = new ArrayList<>();

        Proceso actual = cabeza;
        Proceso anterior = cola;

        System.out.println("\n--- INICIO ROUND ROBIN ---");

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.nombre +
                               " (PID: " + actual.pid + ")");

            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante > 0) {

                System.out.println("Tiempo restante: " + actual.tiempoRestante);

                anterior = actual;
                actual = actual.siguiente;

            } else {

                System.out.println("Proceso terminado.");

                ordenFinalizacion.add(actual.nombre);

                if (actual == cabeza && actual == cola) {
                    cabeza = null;
                    cola = null;
                    actual = null;
                }

                else if (actual == cabeza) {
                    cabeza = cabeza.siguiente;
                    cola.siguiente = cabeza;
                    actual = cabeza;
                }

                
                else if (actual == cola) {
                    anterior.siguiente = cabeza;
                    cola = anterior;
                    actual = cabeza;
                }

                else {
                    anterior.siguiente = actual.siguiente;
                    actual = actual.siguiente;
                }
            }
        }

        System.out.println("\n--- ORDEN DE FINALIZACIÓN ---");
        for (String p : ordenFinalizacion) {
            System.out.println(p);
        }
    }
}