package listas_enlazadas_simples.ejer5_spotify_lite;
public class ListaCanciones {

    Cancion cabeza;
    Cancion actual;

    public ListaCanciones() {
        cabeza = null;
        actual = null;
    }

    // Agregar al final
    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {

        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Cancion aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nueva;
        }
    }

    // Agregar después de la actual
    public void agregarSiguiente(String titulo, String artista, int duracion, String genero) {

        if (actual == null) {
            System.out.println("No hay canción actual.");
            return;
        }

        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        nueva.siguiente = actual.siguiente;
        actual.siguiente = nueva;
    }

    // 🔥 Visualización estilo profe
    public void mostrarLista() {

        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Cancion aux = cabeza;

        while (aux != null) {
            System.out.print("[" + aux.titulo + " | " +
                             aux.artista + " | " +
                             aux.duracionSegundos + "s | " +
                             aux.genero + "]");

            if (aux.siguiente != null) {
                System.out.print(" -> ");
            }

            aux = aux.siguiente;
        }

        System.out.println(); // salto final
    }

    // 🔥 Reto mejor explicado
    public void mostrarDuracionTotal() {

        int totalTiempo = 0; // variable acumuladora

        Cancion aux = cabeza;

        while (aux != null) {
            totalTiempo += aux.duracionSegundos;
            aux = aux.siguiente;
        }

        int minutos = totalTiempo / 60;
        int segundos = totalTiempo % 60;

        System.out.println("Duración total: " + minutos + ":" +
                (segundos < 10 ? "0" + segundos : segundos));
    }
}