package Assignment1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Type '1' for city map.");
            System.out.println("Type '2' for wilderness map.");

            int mapChoice = scanner.nextInt();

            Map map = game.createMap(mapChoice);
            map.display();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }

    public Map createMap(int mapChoice) {
        if (mapChoice == 1) {
            return new CityMap();
        } else if (mapChoice == 2) {
            return new WildernessMap();
        } else {
            return null;
        }
    }
}