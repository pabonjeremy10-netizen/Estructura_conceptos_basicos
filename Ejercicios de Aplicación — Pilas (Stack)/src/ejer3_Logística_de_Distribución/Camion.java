package ejer3_Logística_de_Distribución;

class Camion {

    String placa;
    String conductor;
    double cargaToneladas;

    Camion siguiente;

    public Camion(String placa,
                   String conductor,
                   double cargaToneladas) {

        this.placa = placa;
        this.conductor = conductor;
        this.cargaToneladas = cargaToneladas;

        this.siguiente = null;
    }
}