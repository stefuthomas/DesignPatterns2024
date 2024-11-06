package Assignment14;

public class Main {
    public static void main(String[] args) {
        // Constructing a gaming computer
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(gamingComputerBuilder);
        computerDirector.constructComputer();

        // Printing the gaming computer
        Computer computer = gamingComputerBuilder.getComputer();
        System.out.println(computer);

        // Constructing an office computer
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        computerDirector.setComputerBuilder(officeComputerBuilder);
        computerDirector.constructComputer();

        // Printing the office computer
        Computer computer2 = officeComputerBuilder.getComputer();
        System.out.println(computer2);
    }
}
