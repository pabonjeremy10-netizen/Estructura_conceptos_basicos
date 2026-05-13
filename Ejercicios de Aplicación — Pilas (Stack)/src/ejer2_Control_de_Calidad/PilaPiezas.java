package ejer2_Control_de_Calidad;

class PilaPiezas {

    private Pieza tope;

    public PilaPiezas() {
        tope = null;
    }

    // PUSH
    public void push(String nombre, String serie, boolean defectuosa) {

        Pieza nueva = new Pieza(nombre, serie, defectuosa);

        nueva.siguiente = tope;
        tope = nueva;
    }

    // POP
    public Pieza pop() {

        if (isEmpty()) {
            return null;
        }

        Pieza aux = tope;
        tope = tope.siguiente;

        return aux;
    }

    // PEEK
    public Pieza peek() {

        if (isEmpty()) {
            return null;
        }

        return tope;
    }

    // ISEMPTY
    public boolean isEmpty() {
        return tope == null;
    }

    // MOSTRAR PILA
    public void mostrarPila() {

        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return;
        }

        Pieza aux = tope;

        System.out.print("TOPE -> ");

        while (aux != null) {

            System.out.print("[" + aux.nombrePieza + "] -> ");

            aux = aux.siguiente;
        }

        System.out.println("BASE");
    }

    // METODO DEL RETO
    public void limpiarHastaDefecto() {

        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return;
        }

        System.out.println("\nRetirando piezas buenas...");

        while (!isEmpty()) {

            Pieza actual = pop();

            if (actual.esDefectuosa) {

                System.out.println("\n¡PIEZA DEFECTUOSA ENCONTRADA!");
                System.out.println("Pieza: " + actual.nombrePieza);
                System.out.println("Serie: " + actual.numeroSerie);

                break;
            }
            else {

                System.out.println("Retirada y descartada: "
                        + actual.nombrePieza);
            }
        }
    }
}
