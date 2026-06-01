package Colas.ejer5_Fabrica_de_Pedidos;

public class ColaPedido {

    private Pedido entrada;
    private Pedido salida;
    private int tamanio;

    public ColaPedido() {

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

    public Pedido peek() {

        if (isEmpty()) {

            System.out.println("La cola está vacía.");
            return null;
        }

        return salida;
    }

    public void enqueue(Pedido pedido) {

        if (isEmpty()) {

            salida = pedido;
            entrada = pedido;

        } else {

            entrada.siguiente = pedido;
            entrada = pedido;
        }

        tamanio++;
    }

    public Pedido dequeue() {

        if (isEmpty()) {

            System.out.println("La cola está vacía.");
            return null;
        }

        Pedido pedido = salida;

        salida = salida.siguiente;

        if (salida == null) {

            entrada = null;
        }

        tamanio--;

        return pedido;
    }

    public void imprimir() {

        if (isEmpty()) {

            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("SALIDA -> ");

        Pedido actual = salida;

        while (actual != null) {

            System.out.print("["
                + actual.numeroPedido
                + " - "
                + actual.cliente
                + " - $"
                + actual.totalPagar
                + "]");

            if (actual.siguiente != null) {

                System.out.print(" -> ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" -> ENTRADA");
    }

    public void procesarPedidos() {

        int totalDespachados = 0;
        int totalCancelados = 0;

        while (!isEmpty()) {

            Pedido pedido = dequeue();

            if (pedido.cancelado) {

                System.out.println("\nPedido cancelado descartado:");
                System.out.println("Pedido: " + pedido.numeroPedido);
                System.out.println("Cliente: " + pedido.cliente);

                totalCancelados++;

            } else {

                System.out.println("\nDespachando pedido:");
                System.out.println("Pedido: " + pedido.numeroPedido);
                System.out.println("Cliente: " + pedido.cliente);
                System.out.println("Total a pagar: $" + pedido.totalPagar);

                totalDespachados++;
            }
        }

        System.out.println("\n===== RESUMEN DEL PROCESO =====");
        System.out.println("Pedidos despachados: " + totalDespachados);
        System.out.println("Pedidos cancelados: " + totalCancelados);
    }
}