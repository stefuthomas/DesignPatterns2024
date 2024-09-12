package Assignment7;

import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);
    private String name;
    private int health;
    private int experience;
    private State level;
    private boolean gameOver = false;

    public Character (String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.level = new Novice(this);
    }

    public State getLevel() {
        return level;
    }

    public void setLevel(State level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (health <= 0) {
            gameOver = true;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void play() {
        while (!gameOver) {
            level.action();
        }
        System.out.println("Game Over");
        printStats();
    }

    public void printStats() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + getLevel().getClass().getSimpleName());
        System.out.println("Health: " + health);
        System.out.println("Experience: " + experience);
    }

    public int printChoices(String[] choices) {
        System.out.println("\nChoose an action:");
        for (int i = 0; i < choices.length; i++) {
            System.out.println(i + 1 + ". " + choices[i]);
        }
        return scanner.nextInt();
    }
}