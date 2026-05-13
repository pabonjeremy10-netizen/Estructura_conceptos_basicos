package ejer4_Farmacia_Automatizada;

public class PilaMedicamentos {

    private Medicamento tope;

    public PilaMedicamentos() {
        tope = null;
    }

    public void push(String nombre,
                     String lote,
                     int diasParaVencer) {

        Medicamento nuevo =
                new Medicamento(
                        nombre,
                        lote,
                        diasParaVencer
                );

        nuevo.siguiente = tope;

        tope = nuevo;
    }

    public Medicamento pop() {

        if (isEmpty()) {
            return null;
        }

        Medicamento aux = tope;

        tope = tope.siguiente;

        return aux;
    }

    public Medicamento peek() {

        if (isEmpty()) {
            return null;
        }

        return tope;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void mostrarPila() {

        if (isEmpty()) {

            System.out.println("\nLa pila esta vacia.");
            return;
        }

        Medicamento aux = tope;

        System.out.print("\nTOPE -> ");

        while (aux != null) {

            System.out.print("[" + aux.nombre + "] -> ");

            aux = aux.siguiente;
        }

        System.out.println("BASE");
    }

    public void validarDespacho() {

        if (isEmpty()) {

            System.out.println(
                    "\nNo hay medicamentos."
            );

            return;
        }

        while (!isEmpty()
                && peek().diasParaVencer < 10) {

            Medicamento retirado = pop();

            System.out.println(
                    "\nMedicamento retirado:"
            );

            System.out.println(
                    "Nombre: "
                            + retirado.nombre
            );

            System.out.println(
                    "Dias para vencer: "
                            + retirado.diasParaVencer
            );
        }

        if (isEmpty()) {

            System.out.println(
                    "\nNo quedan medicamentos seguros."
            );
        }
        else {

            Medicamento seguro = peek();

            System.out.println(
                    "\nMedicamento seguro encontrado:"
            );

            System.out.println(
                    "Nombre: "
                            + seguro.nombre
            );

            System.out.println(
                    "Lote: "
                            + seguro.lote
            );

            System.out.println(
                    "Dias para vencer: "
                            + seguro.diasParaVencer
            );
        }
    }
}