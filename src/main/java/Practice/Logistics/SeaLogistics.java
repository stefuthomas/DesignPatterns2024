package Practice.Logistics;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Boat();
    }
}
