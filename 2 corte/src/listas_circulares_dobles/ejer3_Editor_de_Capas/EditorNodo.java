package listas_circulares_dobles.ejer3_Editor_de_Capas;

public class EditorNodo {
    Nodo cabeza;
    Nodo cola;
    Nodo capaActiva;

    public EditorNodo() {
        cabeza = null;
        cola = null;
        capaActiva = null;
    }

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void agregarCapa(String nombre, boolean visible, String tipo) {
        Nodo nueva = new Nodo(nombre, visible, tipo);

        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = cola = capaActiva = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }

    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.visible = !capaActiva.visible;
        }
    }

    public void eliminarActiva() {
        if (capaActiva == null) return;

        if (capaActiva == cabeza && capaActiva == cola) {
            cabeza = cola = capaActiva = null;
            return;
        }

        capaActiva.anterior.siguiente = capaActiva.siguiente;
        capaActiva.siguiente.anterior = capaActiva.anterior;

        if (capaActiva == cabeza) cabeza = capaActiva.siguiente;
        if (capaActiva == cola) cola = capaActiva.anterior;

        capaActiva = capaActiva.siguiente;
    }

    public void mostrarCapas() {
        if (estaVacio()) {
            System.out.println("No hay capas.");
            return;
        }

        Nodo actual = cabeza;
        int i = 1;

        System.out.println("\n=== Capas ===");

        do {
            String activa = (actual == capaActiva) ? "[✓]" : "[ ]";
            String vis = actual.visible ? "Visible" : "Oculta";

            System.out.println(i + ". " + activa + " " + actual.nombre +
                    " (" + actual.tipo + ") - " + vis);

            actual = actual.siguiente;
            i++;
        } while (actual != cabeza);
    }
}