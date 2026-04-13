package listas_enlazadas_simples.ejer1_El_Tren_de_Carga;
public class Vagon {

    String contenido;
    double pesoToneladas;
    String origen;
    String destino;

    Vagon siguiente;

    public Vagon(String contenido, double pesoToneladas, String origen, String destino) {
        this.contenido = contenido;
        this.pesoToneladas = pesoToneladas;
        this.origen = origen;
        this.destino = destino;
        this.siguiente = null;
    }
}