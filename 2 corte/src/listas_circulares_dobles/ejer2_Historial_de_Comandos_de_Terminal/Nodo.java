package listas_circulares_dobles.ejer2_Historial_de_Comandos_de_Terminal;

public class Nodo {
    String texto;
    boolean exitoso;
    String directorio;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(String texto, boolean exitoso, String directorio) {
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
        this.siguiente = null;
        this.anterior = null;
    }
}