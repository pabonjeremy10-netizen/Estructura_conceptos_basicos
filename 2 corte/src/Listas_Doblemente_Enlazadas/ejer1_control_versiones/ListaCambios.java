package Listas_Doblemente_Enlazadas.ejer1_control_versiones;

public class ListaCambios {

    Cambio cabeza;
    Cambio cola;
    Cambio actual;

    public ListaCambios() {
        cabeza = null;
        cola = null;
        actual = null;
    }

    // Agregar cambio al final
    public void agregarCambio(String texto, String tipo) {

        Cambio nuevo = new Cambio(texto, tipo);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
            actual = nuevo;
        }
    }

    public void deshacer() {

        if (actual == null) {
            System.out.println("No hay cambios.");
            return;
        }

        if (actual.anterior != null) {
            actual = actual.anterior;
            System.out.println("Se deshizo el cambio.");
        } else {
            System.out.println("No se puede deshacer más.");
        }
    }

    public void rehacer() {

        if (actual == null) {
            System.out.println("No hay cambios.");
            return;
        }

        if (actual.siguiente != null) {
            actual = actual.siguiente;
            System.out.println("Se rehizo el cambio.");
        } else {
            System.out.println("No se puede rehacer más.");
        }
    }

    public void mostrarHistorial() {

        Cambio aux = cabeza;

        while (aux != null) {

            if (aux == actual) {
                System.out.print("[" + aux.tipoOperacion + ": " + aux.texto + "] (ACTUAL)");
            } else {
                System.out.print("[" + aux.tipoOperacion + ": " + aux.texto + "]");
            }

            if (aux.siguiente != null) {
                System.out.print(" <-> ");
            }

            aux = aux.siguiente;
        }

        System.out.println();
    }
}
