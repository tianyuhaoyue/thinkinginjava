package observerpattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserve(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void removeObserve(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserves() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observ = (Observer) observers.get(i);
            observ.update(temperature, humidity, pressure);
        }
    }


    public void measurementsChanged() {
        notifyObserves();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

    }


}
