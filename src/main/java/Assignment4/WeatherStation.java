package Assignment4;

public class WeatherStation extends Observable implements Runnable {
    private double temperature;

    public WeatherStation() {
        this.temperature = -40.0 + 80.0 * Math.random();
    }
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1500);
                double updatedTemperature = -1.0 + 2.0 * Math.random();
                if (temperature + updatedTemperature <= 40 || temperature + updatedTemperature >= -40) {
                    setTemperature(updatedTemperature);
                } else {
                    notifyObservers();
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setTemperature(double temperature) {
        this.temperature += temperature;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }
}
