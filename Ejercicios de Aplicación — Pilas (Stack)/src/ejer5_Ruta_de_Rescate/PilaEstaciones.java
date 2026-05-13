package ejer5_Ruta_de_Rescate;

public class PilaEstaciones {

    private Estacion tope;

    public PilaEstaciones() {
        tope = null;
    }

    public void push(String nombrePunto,
                     int profundidad,
                     double nivelOxigeno) {

        Estacion nueva =
                new Estacion(
                        nombrePunto,
                        profundidad,
                        nivelOxigeno
                );

        nueva.siguiente = tope;

        tope = nueva;
    }

    public Estacion pop() {

        if (isEmpty()) {
            return null;
        }

        Estacion aux = tope;

        tope = tope.siguiente;

        return aux;
    }

    public Estacion peek() {

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

            System.out.println(
                    "\nNo hay estaciones."
            );

            return;
        }

        Estacion aux = tope;

        System.out.print("\nTOPE -> ");

        while (aux != null) {

            System.out.print(
                    "[" + aux.nombrePunto + "] -> "
            );

            aux = aux.siguiente;
        }

        System.out.println("BASE");
    }

    public void retrocederASuperficie() {

        if (isEmpty()) {

            System.out.println(
                    "\nNo hay estaciones registradas."
            );

            return;
        }

        System.out.println(
                "\nIniciando retorno a la superficie..."
        );

        while (!isEmpty()) {

            Estacion actual = pop();

            System.out.println(
                    "\nPasando por: "
                            + actual.nombrePunto
            );

            System.out.println(
                    "Profundidad: "
                            + actual.profundidad
                            + " metros"
            );

            System.out.println(
                    "Nivel de oxigeno: "
                            + actual.nivelOxigeno
                            + "%"
            );

            if (actual.nivelOxigeno < 18) {

                System.out.println(
                        "ALERTA: Uso de Tanque de Emergencia Requerido"
                );
            }
        }

        System.out.println(
                "\nEl equipo ha salido de la cueva."
        );
    }
}