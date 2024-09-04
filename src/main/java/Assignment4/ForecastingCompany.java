package Assignment4;

public class ForecastingCompany implements Observer {
    private String name;
    private WeatherStation weatherStation;

    public ForecastingCompany(String name, WeatherStation weatherStation) {
        this.name = name;
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        String formattedTemperature = String.format("%2.2f", weatherStation.getTemperature());
        System.out.println(name + " reports that the temperature is now " + formattedTemperature + "°C");
    }
    public String getName() {
        return name;
    }
}
