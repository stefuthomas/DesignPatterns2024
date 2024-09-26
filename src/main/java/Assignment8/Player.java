package Assignment8;

public class Player {
    private String name;
    private int score;
    private int playedRounds;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.playedRounds = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getPlayedRounds() {
        return playedRounds;
    }

    public void increasePlayedRounds() {
        playedRounds++;
    }

    public void increaseScore() {
        score++;
    }
}
