package co.edu.uniquindio.poo;

public class DisplayTemperatura implements Observer {
    @Override
    public void actualizacion(int temperatura) {
        System.out.println("Temperatura actual: " + temperatura);
    }
}
