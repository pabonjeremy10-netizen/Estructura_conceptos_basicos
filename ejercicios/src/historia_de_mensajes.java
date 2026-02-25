public class historia_de_mensajes {

    public static void main(String[] args) {

        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;

        copiaTexto = "¿Cómo estás?";

        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia texto: " + copiaTexto);

        /*
         Aquí parece que fuera lo mismo que los arreglos,
         pero los String en Java son inmutables.
         
         Eso significa que no se pueden modificar.
         
         Cuando hicimos:
         copiaTexto = "¿Cómo estás?";
         
         No se cambió el texto original.
         Lo que pasó fue que se creó un nuevo String
         y ahora copiaTexto apunta a ese nuevo texto.
         
         Mientras tanto, ultimoMensaje sigue apuntando al "Hola".
         
         O sea, no es que lo cambió… creó otro aparte y ya.
        */
    }
}