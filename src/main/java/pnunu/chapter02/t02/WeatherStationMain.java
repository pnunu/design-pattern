package pnunu.chapter0201;

import pnunu.chapter0201.impl.CurrentConditionsDisplay;
import pnunu.chapter0201.impl.StatisticsDisplay;
import pnunu.chapter0201.impl.WeatherData;

/**
 * Created by nunu on 2017/8/20
 */
public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisicsDisplay = new StatisticsDisplay(weatherData);
        /////////////

        weatherData.setMeausurements(80, 65, 30.4f);
        weatherData.setMeausurements(180, 165, 130.4f);
    }
}
