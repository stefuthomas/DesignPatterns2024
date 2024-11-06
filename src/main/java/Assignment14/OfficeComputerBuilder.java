package Assignment14;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    public void addProcessor() {
        computer.addComponent(new Component("Intel Core i5-12600KF"));
    }

    public void addRam() {
        computer.addComponent(new Component("Corsair Vengeance 16GB"));
    }

    public void addHardDrive() {
        computer.addComponent(new Component("Samsung 970 EVO Plus 500GB"));
    }

    public void addGraphicsCard() {
        computer.addComponent(new Component("NVIDIA GeForce RTX 3060"));
    }

    public void addOperatingSystem() {
        computer.addComponent(new Component("Windows 10"));
    }

    public Computer getComputer() {
        return computer;
    }
}
