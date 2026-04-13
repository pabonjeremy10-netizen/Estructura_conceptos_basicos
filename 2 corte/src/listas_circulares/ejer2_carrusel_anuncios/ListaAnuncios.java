package listas_circulares.ejer2_carrusel_anuncios;

public class ListaAnuncios {

    Anuncio cabeza;
    Anuncio cola;

    public ListaAnuncios() {
        cabeza = null;
        cola = null;
    }

    public void agregarAnuncio(String titulo, int duracion, String categoria) {

        Anuncio nuevo = new Anuncio(titulo, duracion, categoria);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public void reproducir(int ciclos) {

        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        int tiempoTotal = 0;
        Anuncio actual = cabeza;

        for (int i = 0; i < ciclos; i++) {

            System.out.println("\n--- CICLO " + (i + 1) + " ---");

            do {
                System.out.println("Mostrando: [" + actual.titulo +
                                   " | " + actual.duracionSegundos + "s | " +
                                   actual.categoria + "]");

                actual.vecesRepetido++;
                tiempoTotal += actual.duracionSegundos;

                actual = actual.siguiente;

            } while (actual != cabeza); 
        }

        Anuncio aux = cabeza;
        Anuncio masRepetido = cabeza;

        do {
            if (aux.vecesRepetido > masRepetido.vecesRepetido) {
                masRepetido = aux;
            }
            aux = aux.siguiente;
        } while (aux != cabeza);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Anuncio más repetido: " + masRepetido.titulo +
                           " (" + masRepetido.vecesRepetido + " veces)");

        System.out.println("Tiempo total en pantalla: " + tiempoTotal + " segundos");
    }
}