package Assignment1;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Game {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type '1' for city map.");
            System.out.print("Type '2' for wilderness map.");

            int mapChoice = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }

    public abstract Map createMap();
}