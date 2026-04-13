package Listas_Doblemente_Enlazadas.ejer2_carrusel_imagenes;

public class ListaFotos {

    Fotografia cabeza;
    Fotografia cola;
    Fotografia actual;

    public ListaFotos() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    // Agregar al final
    public void agregarFoto(String nombre, double tamano, String resolucion) {

        Fotografia nueva = new Fotografia(nombre, tamano, resolucion);

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola; 
            cola = nueva;
        }
    }

    public void siguiente() {

        if (actual == null) return;

        if (actual.siguiente != null) {
            actual = actual.siguiente;
        } else {
            System.out.println("Ya estás en la última foto.");
        }
    }

    public void anterior() {

        if (actual == null) return;

        if (actual.anterior != null) {
            actual = actual.anterior;
        } else {
            System.out.println("Ya estás en la primera foto.");
        }
    }

    public void mostrarActual() {

        if (actual == null) {
            System.out.println("No hay fotos.");
            return;
        }

        System.out.println("[ " + actual.nombreArchivo +
                           " | " + actual.tamanoMB + "MB | " +
                           actual.resolucion + " ]");
    }

    public void reproducirGaleria() {

        if (cabeza == null) {
            System.out.println("Galería vacía.");
            return;
        }

        System.out.println("\n--- RECORRIDO HACIA ADELANTE ---");

        Fotografia aux = cabeza;

        while (aux != null) {
            System.out.println("[ " + aux.nombreArchivo +
                               " | " + aux.tamanoMB + "MB | " +
                               aux.resolucion + " ]");
            aux = aux.siguiente;
        }

        System.out.println("\n--- RECORRIDO HACIA ATRÁS ---");

        aux = cola; 

        while (aux != null) {
            System.out.println("[ " + aux.nombreArchivo +
                               " | " + aux.tamanoMB + "MB | " +
                               aux.resolucion + " ]");
            aux = aux.anterior;
        }
    }
}
