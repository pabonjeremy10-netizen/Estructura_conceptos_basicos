//ejercicio 6
//Turno en un banco
//Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActual y se asigna a turnoEnPantalla.
//Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual (comportamiento por valor).
//Explica en un comentario por qué ocurre esto.

public class Turno_en_un_banco {
    public static void main(String[] args) {

        int turnoActual = 15;
        int turnoEnPantalla = turnoActual;

        turnoEnPantalla = 20;

        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

        /*
         Básicamente lo que pasa aquí es que Java no los conecta ni nada raro.
         Cuando igualamos turnoEnPantalla con turnoActual,
         lo que hace es copiar el número y ya.
         
         Entonces cuando cambiamos turnoEnPantalla a 20,
         eso no afecta al turnoActual porque cada uno tiene su propio número guardado.
         
         O sea, no están pegados, solo fue una copia y listo.
        */
    }
}
