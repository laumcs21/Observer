package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

// Clase Observable que mantiene una lista de observadores y notifica cambios de temperatura
public class EstadoTemperatura {
    private int temperatura;
    private List<Observer> observers = new ArrayList<>();

    public EstadoTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperatura(int temperature) {
        this.temperatura = temperature;
        notificarObservers();
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.actualizacion(temperatura);
        }
    }
}
