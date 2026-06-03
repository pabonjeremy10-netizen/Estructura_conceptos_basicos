package Arboles.ejer3_Sistema_de_Nómina;

public class ArbolEmpleados {

    private Empleado raiz;

    public ArbolEmpleados() {

        this.raiz = null;
    }

    public boolean isEmpty() {

        return raiz == null;
    }

    private Empleado insertar(Empleado nodo, long cedula, String nombreCompleto, String cargo, double salario) {

        if (nodo == null) {
            return new Empleado(cedula, nombreCompleto, cargo, salario);
        }

        if (cedula < nodo.cedula) {
            nodo.izquierdo = insertar(nodo.izquierdo, cedula, nombreCompleto, cargo, salario);
        } else if (cedula > nodo.cedula) {
            nodo.derecho = insertar(nodo.derecho, cedula, nombreCompleto, cargo, salario);
        } else {
            System.out.println("La cédula ya existe.");
        }

        return nodo;
    }

    public void insertar(long cedula, String nombreCompleto, String cargo, double salario) {

        raiz = insertar(raiz, cedula, nombreCompleto, cargo, salario);
    }

    private Empleado buscar(Empleado nodo, long cedula) {

        if (nodo == null) {
            return null;
        }

        if (cedula == nodo.cedula) {
            return nodo;
        }

        if (cedula < nodo.cedula) {
            return buscar(nodo.izquierdo, cedula);
        }

        return buscar(nodo.derecho, cedula);
    }

    public Empleado buscar(long cedula) {

        return buscar(raiz, cedula);
    }

    private void inOrden(Empleado nodo) {

        if (nodo != null) {

            inOrden(nodo.izquierdo);
            System.out.println(nodo);
            inOrden(nodo.derecho);
        }
    }

    public void inOrden() {

        if (isEmpty()) {
            System.out.println("[ Árbol vacío ]");
            return;
        }

        inOrden(raiz);
    }

    private void preOrden(Empleado nodo) {

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

    private int altura(Empleado nodo) {

        if (nodo == null) {
            return -1;
        }

        return 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    public int altura() {

        return altura(raiz);
    }

    private int contarHojas(Empleado nodo) {

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

    public Empleado buscarMinimo() {

        if (isEmpty()) {
            return null;
        }

        Empleado actual = raiz;

        while (actual.izquierdo != null) {
            actual = actual.izquierdo;
        }

        return actual;
    }

    public Empleado buscarMaximo() {

        if (isEmpty()) {
            return null;
        }

        Empleado actual = raiz;

        while (actual.derecho != null) {
            actual = actual.derecho;
        }

        return actual;
    }

    public void reporteEficiencia() {

        System.out.println("Altura del árbol: " + altura());
        System.out.println("Número de hojas: " + contarHojas());
    }
}
