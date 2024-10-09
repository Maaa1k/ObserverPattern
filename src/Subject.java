import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<WeatherObserver> observers = new ArrayList<>();
    private double temperature;
    private double humidity;
    private double pressure;

    public void addObserver(WeatherObserver observer){
        observers.add(observer);
    }
    public void removeAllObserver(){
        observers.clear();
    }
    public void removeObserver(WeatherObserver observer){
        observers.remove(observer);
    }
    public void setObservers(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();

    }
    public void notifyObserver(){
        for (WeatherObserver wObserver : observers){
            wObserver.update(temperature, humidity, pressure);
        }
    }
}
