package Listas_Doblemente_Enlazadas.ejer1_control_versiones;
public class Cambio {

    String texto;
    String tipoOperacion;

    Cambio siguiente;
    Cambio anterior;

    public Cambio(String texto, String tipoOperacion) {
        this.texto = texto;
        this.tipoOperacion = tipoOperacion;
        this.siguiente = null;
        this.anterior = null;
    }
}