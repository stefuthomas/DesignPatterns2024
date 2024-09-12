package Assignment7;

public class Expert extends State {
    private final int POINTSFORMASTER = 500;
    private String[] options = {"Train", "Meditate", "Fight"};

    public Expert(Character character) {
        super(character);
    }

    public void action() {
        if (getCharacter().getExperience() > POINTSFORMASTER) {
            getCharacter().setLevel(new Master(getCharacter()));
        } else {
            getCharacter().printStats();
            switch (getCharacter().printChoices(options)) {
                case 1:
                    characterTrain();
                    break;
                case 2:
                    characterMeditate();
                    break;
                case 3:
                    characterFight();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
