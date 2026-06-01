package Colas.ejer3_Impresora_Compartida;

public class ColaImpresion {

    private Documento entrada;
    private Documento salida;
    private int tamanio;

    public ColaImpresion() {

        this.entrada = null;
        this.salida = null;
        this.tamanio = 0;
    }

    public boolean isEmpty() {

        return salida == null;
    }

    public int size() {

        return tamanio;
    }

    public Documento peek() {

        if (isEmpty()) {

            System.out.println("La cola de impresión está vacía.");
            return null;
        }

        return salida;
    }

    public void enqueue(Documento documento) {

        if (isEmpty()) {

            salida = documento;
            entrada = documento;

        } else {

            entrada.siguiente = documento;
            entrada = documento;
        }

        tamanio++;
    }

    public Documento dequeue() {

        if (isEmpty()) {

            System.out.println("La cola de impresión está vacía.");
            return null;
        }

        Documento documento = salida;

        salida = salida.siguiente;

        if (salida == null) {

            entrada = null;
        }

        tamanio--;

        return documento;
    }

    public void imprimir() {

        if (isEmpty()) {

            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("SALIDA -> ");

        Documento actual = salida;

        while (actual != null) {

            System.out.print("[" 
                + actual.nombreArchivo 
                + " - " 
                + actual.usuario 
                + " - "
                + actual.numeroPaginas
                + " paginas]");

            if (actual.siguiente != null) {

                System.out.print(" -> ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" -> ENTRADA");
    }

    public int calcularPaginasTotales() {

        int totalPaginas = 0;

        Documento actual = salida;

        while (actual != null) {

            totalPaginas += actual.numeroPaginas;

            actual = actual.siguiente;
        }

        return totalPaginas;
    }
}