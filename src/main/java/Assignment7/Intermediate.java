package Assignment7;

public class Intermediate extends State{
    private final int POINTSFOREXPERT = 250;
    private String[] options = {"Train", "Meditate"};

    public Intermediate(Character character) {
        super(character);
    }

    public void action() {
        if (getCharacter().getExperience() > POINTSFOREXPERT) {
            getCharacter().setLevel(new Expert(getCharacter()));
        } else {
            getCharacter().printStats();
            switch (getCharacter().printChoices(options)) {
                case 1:
                    characterTrain();
                    break;
                case 2:
                    characterMeditate();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
