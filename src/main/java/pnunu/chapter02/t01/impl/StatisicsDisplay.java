package pnunu.chapter02.t01.impl;

import pnunu.chapter02.t01.DisplayElement;
import pnunu.chapter02.t01.Observer;
import pnunu.chapter02.t01.Subject;

/**
 * 2号布告板
 * Created by nunu on 2017/8/20
 */
public class StatisicsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisicsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current Conditions Display: " + temperature
                + " F degrees and " + humidity + "...." + pressure);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
