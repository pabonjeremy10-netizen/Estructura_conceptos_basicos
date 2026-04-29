package listas_circulares_dobles.ejer3_Editor_de_Capas;

public class Nodo {
    String nombre;
    boolean visible;
    String tipo;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(String nombre, boolean visible, String tipo) {
        this.nombre = nombre;
        this.visible = visible;
        this.tipo = tipo;
        this.siguiente = null;
        this.anterior = null;
    }
}
