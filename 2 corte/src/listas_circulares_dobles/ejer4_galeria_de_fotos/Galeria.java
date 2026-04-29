package listas_circulares_dobles.ejer4_galeria_de_fotos;

public class Galeria {
    Nodo cabeza;
    Nodo cola;
    Nodo actual;

    public Galeria() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarFoto(String titulo, String fecha) {
        Nodo nueva = new Nodo(titulo, fecha);

        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = cola = actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }

    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
        }
    }

    public void toggleFavorita() {
        if (actual != null) {
            actual.esFavorita = !actual.esFavorita;
        }
    }

    public void eliminarActual() {
        if (actual == null) return;

        if (actual == cabeza && actual == cola) {
            cabeza = cola = actual = null;
            return;
        }

        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;

        if (actual == cabeza) cabeza = actual.siguiente;
        if (actual == cola) cola = actual.anterior;

        actual = actual.siguiente;
    }

    public void mostrarGaleria() {
        if (estaVacia()) {
            System.out.println("Galería vacía.");
            return;
        }

        Nodo temp = cabeza;
        int i = 1;

        System.out.println("\n=== Galería ===");

        do {
            String actualMark = (temp == actual) ? "[▶]" : "[ ]";
            String favMark = temp.esFavorita ? "[★]" : "[ ]";

            System.out.println(i + ". " + actualMark + " " + favMark + " "
                    + temp.titulo + " (" + temp.fecha + ")");

            temp = temp.siguiente;
            i++;
        } while (temp != cabeza);
    }
}