package Arboles.ejer_2_Catálogo_Digital;

public class ArbolLibros {

    private Libro raiz;

    public ArbolLibros() {

        this.raiz = null;
    }

    public boolean isEmpty() {

        return raiz == null;
    }

    private Libro insertar(Libro nodo, long isbn, String titulo, String autor, int anioPublicacion) {

        if (nodo == null) {
            return new Libro(isbn, titulo, autor, anioPublicacion);
        }

        if (isbn < nodo.isbn) {
            nodo.izquierdo = insertar(nodo.izquierdo, isbn, titulo, autor, anioPublicacion);
        } else if (isbn > nodo.isbn) {
            nodo.derecho = insertar(nodo.derecho, isbn, titulo, autor, anioPublicacion);
        } else {
            System.out.println("El ISBN ya existe en el catálogo.");
        }

        return nodo;
    }

    public void insertar(long isbn, String titulo, String autor, int anioPublicacion) {

        raiz = insertar(raiz, isbn, titulo, autor, anioPublicacion);
    }

    private Libro buscar(Libro nodo, long isbn) {

        if (nodo == null) {
            return null;
        }

        if (isbn == nodo.isbn) {
            return nodo;
        }

        if (isbn < nodo.isbn) {
            return buscar(nodo.izquierdo, isbn);
        }

        return buscar(nodo.derecho, isbn);
    }

    public Libro buscar(long isbn) {

        return buscar(raiz, isbn);
    }

    public boolean existeISBN(long isbn) {

        return buscar(isbn) != null;
    }

    private void inOrden(Libro nodo) {

        if (nodo != null) {

            inOrden(nodo.izquierdo);
            System.out.println(nodo);
            inOrden(nodo.derecho);
        }
    }

    public void imprimirCatalogo() {

        if (isEmpty()) {

            System.out.println("[ Árbol vacío ]");
            return;
        }

        System.out.println("Catálogo ordenado por ISBN:");
        inOrden(raiz);
    }

    private void preOrden(Libro nodo) {

        if (nodo != null) {

            System.out.println(nodo);
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }

    public void preOrden() {

        if (isEmpty()) {

            System.out.println("[ Árbol vacío ]");
            return;
        }

        preOrden(raiz);
    }

    private int altura(Libro nodo) {

        if (nodo == null) {
            return -1;
        }

        return 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    public int altura() {

        return altura(raiz);
    }

    private int contarHojas(Libro nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierdo == null && nodo.derecho == null) {
            return 1;
        }

        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    public int contarHojas() {

        return contarHojas(raiz);
    }
}