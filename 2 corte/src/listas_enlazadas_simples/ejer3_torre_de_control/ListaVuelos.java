package listas_enlazadas_simples.ejer3_torre_de_control;

public class ListaVuelos {

    Vuelo cabeza;

    public ListaVuelos() {
        cabeza = null;
    }

    public void agregarVuelo(String numero, String aerolinea, int combustible, int pasajeros) {

        Vuelo nuevo = new Vuelo(numero, aerolinea, combustible, pasajeros);

        if (combustible < 10) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Vuelo aux = cabeza;
                while (aux.siguiente != null) {
                    aux = aux.siguiente;
                }
                aux.siguiente = nuevo;
            }
        }
    }

    public void reportarEmergencia(String numeroVuelo) {

        if (cabeza == null) return;

        if (cabeza.numeroVuelo.equals(numeroVuelo)) {
            System.out.println("El vuelo ya está en prioridad.");
            return;
        }

        Vuelo anterior = null;
        Vuelo actual = cabeza;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Vuelo no encontrado.");
            return;
        }

        anterior.siguiente = actual.siguiente;

        actual.siguiente = cabeza;
        cabeza = actual;

        System.out.println("Vuelo movido a prioridad.");
    }

    public void mostrarVuelos() {

        Vuelo aux = cabeza;

        while (aux != null) {
            System.out.println("Vuelo: " + aux.numeroVuelo +
                               " | Aerolínea: " + aux.aerolinea +
                               " | Combustible: " + aux.combustibleRestante +
                               " | Pasajeros: " + aux.pasajeros);
            aux = aux.siguiente;
        }
    }
}
