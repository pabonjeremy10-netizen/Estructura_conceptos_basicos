package listas_circulares.ejer3_round_robin;

public class App {

    public static void main(String[] args) {

        ListaProcesos lista = new ListaProcesos();

        // Procesos de prueba
        lista.agregarProceso("Proceso A", 1, 10, 1);
        lista.agregarProceso("Proceso B", 2, 6, 2);
        lista.agregarProceso("Proceso C", 3, 8, 1);
        lista.agregarProceso("Proceso D", 4, 4, 3);

        int quantum = 3;

        lista.ejecutar(quantum);
    }
}