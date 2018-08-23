package pnunu.chapter0201.impl;

import pnunu.chapter0201.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 布告板
 * Created by nunu on 2017/8/20
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("...................Display: " + temperature
                + " F degrees and " + humidity + " %");
    }
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
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
