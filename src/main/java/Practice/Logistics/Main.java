package Practice.Logistics;

public class Main {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        Transport transport = roadLogistics.createTransport();
        transport.deliver();
    }
}
