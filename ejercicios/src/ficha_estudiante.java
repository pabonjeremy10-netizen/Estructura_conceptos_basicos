public class ficha_estudiante {

    public static void main(String[] args) {

        String nombre;
        int codigo;
        int semestreActual;
        double promedio;
        boolean matriculado;

        nombre = "Ana Torres";
        codigo = 20241001;
        semestreActual = 3;
        promedio = 3.85;
        matriculado = true;

        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestreActual);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matriculado: " + matriculado);
    }
}
