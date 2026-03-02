/*ejercicio 10
Copiando configuración
Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).

Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
Modifica la copia y demuestra que el original no cambia.
Comenta la diferencia con la asignación directa.

*/
public class Copiando_configuracion {

    public static void main(String[] args) {

        int[] configuracion = {1920, 1080, 60};

        int[] copiaConfiguracion = new int[configuracion.length];

        for (int i = 0; i < configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i];
        }
        
        copiaConfiguracion[2] = 120;

        System.out.println("Configuración original:");
        for (int i = 0; i < configuracion.length; i++) {
            System.out.println(configuracion[i]);
        }

        System.out.println("\nCopia modificada:");
        for (int i = 0; i < copiaConfiguracion.length; i++) {
            System.out.println(copiaConfiguracion[i]);
        }

        /*
         Aquí sí hicimos una copia real.
         
         Primero creamos un arreglo nuevo con "new".
         Luego copiamos cada valor uno por uno.
         
         Eso significa que ahora existen DOS arreglos diferentes en memoria.
         
         Cuando cambiamos la copia a 120 FPS,
         el original sigue en 60 porque no están conectados.
         
         Diferencia con esto:
         
         int[] copia = configuracion;
         
         En ese caso NO se crea arreglo nuevo,
         solo apuntan al mismo lugar y cualquier cambio afecta a ambos.
        */
    }
}
