package pnunu.chapter02.t01;

import pnunu.chapter02.t01.impl.CurrentConditionsDisplay;
import pnunu.chapter02.t01.impl.StatisicsDisplay;
import pnunu.chapter02.t01.impl.WeatherData;

/**
 * Created by nunu on 2017/8/20
 */
public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        StatisicsDisplay statisicsDisplay = new StatisicsDisplay(weatherData);
        /////////////

        weatherData.setMeausurements(80, 65, 30.4f);
        weatherData.setMeausurements(180, 165, 130.4f);
    }
}
