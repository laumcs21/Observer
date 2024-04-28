package co.edu.uniquindio.poo;

// Clase principal que prueba el patrón Observer
public class App {
    public static void main(String[] args) {
        // Creamos la estación meteorológica
        EstadoTemperatura estadoTemperatura = new EstadoTemperatura(32);

        // Creamos dispositivos para mostrar la temperatura
        DisplayTemperatura display1 = new DisplayTemperatura();
        DisplayTemperatura display2 = new DisplayTemperatura();

        // Registrando los dispositivos para recibir actualizaciones de temperatura
        estadoTemperatura.addObserver(display1);
        estadoTemperatura.addObserver(display2);

        // Simulamos cambios de temperatura
        estadoTemperatura.setTemperatura(25);
        estadoTemperatura.setTemperatura(30);
        estadoTemperatura.setTemperatura(22);

        // Quitamos un dispositivo de visualización
        estadoTemperatura.removeObserver(display1);

        // Simulamos más cambios de temperatura
        estadoTemperatura.setTemperatura(28);
    }
}
