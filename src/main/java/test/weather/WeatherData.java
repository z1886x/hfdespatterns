package test.weather;

import java.util.ArrayList;

/**
 * Created by hassan.sadek on 25/2/17.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers = new ArrayList();
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void RegisterObserver(Observer O) {
        observers.add(O);

    }

    public void removeObserver(Observer O) {
        observers.remove(O);

    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temp, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
