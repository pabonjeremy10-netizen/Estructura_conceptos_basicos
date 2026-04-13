package listas_enlazadas_simples.ejer5_spotify_lite;

public class Cancion {

    String titulo;
    String artista;
    int duracionSegundos;
    String genero;

    Cancion siguiente;

    public Cancion(String titulo, String artista, int duracionSegundos, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
        this.siguiente = null;
    }
}