package Assignment7;

public abstract class State {
    private Character character;

    public State(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    protected void characterTrain() {
        character.setExperience(character.getExperience() + 10);
    }

    protected void characterMeditate() {
        character.setHealth(character.getHealth() + 5);
    }

    protected void characterFight() {
        character.setHealth(character.getHealth() - 20);
        character.setExperience(character.getExperience() + 30);
    }
    abstract void action();
}
