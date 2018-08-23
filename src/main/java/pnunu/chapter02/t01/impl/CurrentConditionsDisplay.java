package pnunu.chapter02.t01.impl;

import pnunu.chapter02.t01.DisplayElement;
import pnunu.chapter02.t01.Observer;
import pnunu.chapter02.t01.Subject;

/**
 * 布告板
 * Created by nunu on 2017/8/20
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions Display: " + temperature
                + " F degrees and " + humidity);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
