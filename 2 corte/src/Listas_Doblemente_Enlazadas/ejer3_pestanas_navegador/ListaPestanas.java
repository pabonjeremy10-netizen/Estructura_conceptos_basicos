package Listas_Doblemente_Enlazadas.ejer3_pestanas_navegador;
public class ListaPestanas {

    Pestana cabeza;
    Pestana cola;
    Pestana actual;

    public ListaPestanas() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    
    public void agregarPestana(String titulo, String url, String hora) {

        Pestana nueva = new Pestana(titulo, url, hora);

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
            actual = nueva;
        }
    }

    public void cerrarPestanaActual(String url) {

        if (cabeza == null) {
            System.out.println("No hay pestañas.");
            return;
        }

        Pestana aux = cabeza;

        while (aux != null && !aux.url.equals(url)) {
            aux = aux.siguiente;
        }

        if (aux == null) {
            System.out.println("Pestaña no encontrada.");
            return;
        }

        if (cabeza == cola) {
            cabeza = null;
            cola = null;
            actual = null;
        }

        else if (aux == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
        }

        else if (aux == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            actual = cola;
        }

        else {
            aux.anterior.siguiente = aux.siguiente;
            aux.siguiente.anterior = aux.anterior;

            actual = aux.anterior;
        }

        System.out.println("Pestaña cerrada correctamente.");
    }

    public void mostrarPestanas() {

        Pestana aux = cabeza;

        while (aux != null) {

            if (aux == actual) {
                System.out.print("[ " + aux.tituloPagina + " ] (ACTUAL)");
            } else {
                System.out.print("[ " + aux.tituloPagina + " ]");
            }

            if (aux.siguiente != null) {
                System.out.print(" <-> ");
            }

            aux = aux.siguiente;
        }

        System.out.println();
    }
}
