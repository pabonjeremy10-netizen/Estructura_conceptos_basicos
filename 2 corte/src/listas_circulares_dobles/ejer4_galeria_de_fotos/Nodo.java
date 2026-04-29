package listas_circulares_dobles.ejer4_galeria_de_fotos;

public class Nodo {
    String titulo;
    String fecha;
    boolean esFavorita;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.esFavorita = false;
        this.siguiente = null;
        this.anterior = null;
    }
}
