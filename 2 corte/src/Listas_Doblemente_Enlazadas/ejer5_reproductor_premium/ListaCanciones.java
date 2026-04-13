package Listas_Doblemente_Enlazadas.ejer5_reproductor_premium;

public class ListaCanciones {

    Cancion cabeza;
    Cancion cola;
    Cancion actual;

    public ListaCanciones() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    public void agregarCancion(String titulo, String artista, int duracion) {

        Cancion nueva = new Cancion(titulo, artista, duracion);

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

    public void saltarAdelante() {

        if (actual == null) {
            System.out.println("No hay canciones.");
            return;
        }

        if (actual.siguiente != null) {
            actual = actual.siguiente;
            System.out.println("Reproduciendo siguiente canción.");
        } else {
            System.out.println("Ya estás en la última canción.");
        }
    }

    public void saltarAtras() {

        if (actual == null) {
            System.out.println("No hay canciones.");
            return;
        }

        if (actual.anterior != null) {
            actual = actual.anterior;
            System.out.println("Reproduciendo canción anterior.");
        } else {
            System.out.println("No puedes retroceder, estás en la primera canción.");
        }
    }

    public void mostrarActual() {

        if (actual == null) {
            System.out.println("No hay canciones.");
            return;
        }

        System.out.println("[ " + actual.titulo +
                           " | " + actual.artista +
                           " | " + actual.duracion + "s ]");
    }

    public void mostrarLista() {

        Cancion aux = cabeza;

        while (aux != null) {

            if (aux == actual) {
                System.out.print("[ " + aux.titulo + " ] (ACTUAL)");
            } else {
                System.out.print("[ " + aux.titulo + " ]");
            }

            if (aux.siguiente != null) {
                System.out.print(" <-> ");
            }

            aux = aux.siguiente;
        }

        System.out.println();
    }
}
