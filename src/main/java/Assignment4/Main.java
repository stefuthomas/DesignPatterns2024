package Assignment4;

public class Main {
    public static void main(String[] args) {
        // Create a WeatherStation object and a ForecastingCompany objects
        WeatherStation weatherStation = new WeatherStation();
        ForecastingCompany forecastingCompany1 = new ForecastingCompany("Foreca", weatherStation);
        ForecastingCompany forecastingCompany2 = new ForecastingCompany("Ilmatieteen laitos", weatherStation);
        ForecastingCompany forecastingCompany3 = new ForecastingCompany("Weather.com", weatherStation);

        // Add the ForecastingCompany objects as observers to the WeatherStation object
        weatherStation.addObserver(forecastingCompany1);
        weatherStation.addObserver(forecastingCompany2);
        weatherStation.addObserver(forecastingCompany3);

        // Create and start a thread for the WeatherStation object
        Thread thread = new Thread(weatherStation);
        thread.start();

        // Let the simulation run for 10 seconds
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Remove the third observer
        weatherStation.removeObserver(forecastingCompany2);
        System.out.println("Removed observer: " + forecastingCompany2.getName() + "\n");

        // Let the simulation continue
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Stop the weather station thread
        thread.interrupt();
    }
}

