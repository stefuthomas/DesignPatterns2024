package Assignment14;

public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.addProcessor();
        computerBuilder.addRam();
        computerBuilder.addHardDrive();
        computerBuilder.addGraphicsCard();
        computerBuilder.addOperatingSystem();
    }

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
}
