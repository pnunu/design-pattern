package pnunu.chapter0201.impl;

import pnunu.chapter0201.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 布告板
 * Created by nunu on 2017/8/20
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions Display: " + temperature
                + " F degrees and " + humidity + " %");
    }
    public void update(Observable obs, Object arg) {
        if (obs instanceof pnunu.chapter0201.impl.WeatherData) {
            pnunu.chapter0201.impl.WeatherData weatherData = (pnunu.chapter0201.impl.WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    /*public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }*/
}
