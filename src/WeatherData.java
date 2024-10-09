import java.util.ArrayList;
import java.util.List;

public class WeatherData {


    public static void main(String[] args) {
        Subject subject = new Subject();
        MobileApp mobileApp = new MobileApp();
        WeatherObserver weatherObserver = new WeatherStation();
        AdScreen adScreen = new AdScreen();


        subject.addObserver(mobileApp);
        subject.addObserver(weatherObserver);
        subject.addObserver(adScreen);
        subject.setObservers(0.7f,0.9f,0.8f);
        subject.removeObserver(mobileApp);
        subject.removeObserver(weatherObserver);
        subject.removeObserver(adScreen);
        subject.addObserver(mobileApp);
        subject.addObserver(weatherObserver);
        subject.addObserver(adScreen);
        subject.setObservers(0.74f,0.93f,0.81f);
    }
}
