package Logistics;

public class Boat implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by sea");
    }
}