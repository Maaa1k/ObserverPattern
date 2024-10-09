interface WeatherObserver {

    default void update(double temperature, double humidity, double pressure){

    }
}
