package Assignment7;

public class Novice extends State {
    private final int POINTSFORINTERMEDIATE = 100;
    private String[] options = {"Train"};
    public Novice(Character character) {
        super(character);
    }

    public void action() {
        if (getCharacter().getExperience() > POINTSFORINTERMEDIATE) {
            getCharacter().setLevel(new Intermediate(getCharacter()));
        } else {
            getCharacter().printStats();
            if (getCharacter().printChoices(options) == 1) {
                characterTrain();
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}