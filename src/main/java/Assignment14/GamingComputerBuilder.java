package Assignment14;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void addProcessor() {
        computer.addComponent(new Component("Intel Core i9-14900KF"));
    }

    @Override
    public void addRam() {
        computer.addComponent(new Component("Corsair Vengeance 32GB"));
    }

    @Override
    public void addHardDrive() {
        computer.addComponent(new Component("Samsung 970 EVO Plus 1TB"));
    }

    @Override
    public void addGraphicsCard() {
        computer.addComponent(new Component("NVIDIA GeForce RTX 4090"));
    }

    @Override
    public void addOperatingSystem() {
        computer.addComponent(new Component("Windows 11"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
