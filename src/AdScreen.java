public class AdScreen implements  WeatherObserver{
    private double temperature;
    private double humidity;
    private double pressure;

    public void update(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }
    private void display(){
        double checkPressure = pressure * 1000;
        double checkTemperature = temperature * 10;
        if ( checkTemperature > 30 || checkPressure  < 1000){
            System.out.println("|ADD_SCREEN| Temperatura: " + temperature
                    + " Humedad: " + humidity + " Presión: " + pressure + ".");
        }

    }
}
