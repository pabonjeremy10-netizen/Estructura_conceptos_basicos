package ejer3_Logística_de_Distribución;

public class PilaCamiones {

    private Camion tope;

    public PilaCamiones() {
        tope = null;
    }

    
    public void push(String placa,
                     String conductor,
                     double cargaToneladas) {

        Camion nuevo = new Camion(
                placa,
                conductor,
                cargaToneladas
        );

        nuevo.siguiente = tope;

        tope = nuevo;
    }

    public Camion pop() {

        if (isEmpty()) {
            return null;
        }

        Camion aux = tope;

        tope = tope.siguiente;

        return aux;
    }

    public Camion peek() {

        if (isEmpty()) {
            return null;
        }

        return tope;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void mostrarPila() {

        if (isEmpty()) {

            System.out.println("\nNo hay camiones.");
            return;
        }

        Camion aux = tope;

        System.out.print("\nTOPE -> ");

        while (aux != null) {

            System.out.print("[" + aux.placa + "] -> ");

            aux = aux.siguiente;
        }

        System.out.println("BASE");
    }

    public double calcularCargaTotal() {

        double suma = 0;

        PilaCamiones auxiliar = new PilaCamiones();

        while (!isEmpty()) {

            Camion actual = pop();

            suma += actual.cargaToneladas;

            auxiliar.push(
                    actual.placa,
                    actual.conductor,
                    actual.cargaToneladas
            );
        }

        while (!auxiliar.isEmpty()) {

            Camion actual = auxiliar.pop();

            push(
                    actual.placa,
                    actual.conductor,
                    actual.cargaToneladas
            );
        }

        return suma;
    }
}
