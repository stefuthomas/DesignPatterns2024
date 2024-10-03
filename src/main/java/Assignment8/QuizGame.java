package Assignment8;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;
import java.io.*;
import java.net.*;

public class QuizGame extends Game {
    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Map<String, Object>> questions = new ArrayList<Map<String, Object>>();
    private int pointsForWin = 5;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void initializeGame(int numberOfPlayers) {
        createPlayers(numberOfPlayers);
        fetchQuestions();
        System.out.println("Quiz game with " + numberOfPlayers + " players initialized.\n");
    }

    public void createPlayers(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Enter name of player " + (i + 1) + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }
    }

    public void fetchQuestions() {
        try {
            URL apiUrl = new URL("https://opentdb.com/api.php?amount=50&category=15&type=multiple");
            StringBuilder content = new StringBuilder();
            try (InputStream inputStream = apiUrl.openStream();
                 InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line);
                }
            }

            JSONObject jsonResponse = new JSONObject(content.toString());
            JSONArray results = jsonResponse.getJSONArray("results");

            for (int i = 0; i < results.length(); i++) {
                JSONObject questionObj = results.getJSONObject(i);
                String question = questionObj.getString("question");
                String correctAnswer = questionObj.getString("correct_answer");
                JSONArray incorrectAnswersArray = questionObj.getJSONArray("incorrect_answers");
                List<String> incorrectAnswers = new ArrayList<>();
                for (int j = 0; j < incorrectAnswersArray.length(); j++) {
                    incorrectAnswers.add(incorrectAnswersArray.getString(j));
                }
                Map<String, Object> questionMap = new HashMap<>();
                questionMap.put("question", question);
                questionMap.put("correctAnswer", correctAnswer);
                questionMap.put("incorrectAnswers", incorrectAnswers);
                questions.add(questionMap);
            }

        } catch (MalformedURLException e) {
            System.err.println("The URL is malformed: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }

    @Override
    public void playSingleTurn(int playerIndex) {
        if (questions.isEmpty()) {
            fetchQuestions();
        }
        Player player = players.get(playerIndex);
        System.out.println(player.getName() + " is playing.");
        Map<String, Object> question = questions.get(0);
        System.out.println("Question: " + question.get("question"));
        List<String> answers = new ArrayList<>();
        answers.add((String) question.get("correctAnswer"));
        answers.addAll((List<String>) question.get("incorrectAnswers"));
        Collections.shuffle(answers);
        for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + ". " + answers.get(i));
        }
        System.out.print("Answer: ");
        int answer = -1;
        try {
            answer = scanner.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } finally {
            if (answer > 0 && answer <= answers.size() && answers.get(answer - 1).equals(question.get("correctAnswer"))) {
                player.increaseScore();
                System.out.println("Correct! " + player.getName() + " has " + player.getScore() + " points.\n");
            } else {
                System.out.println("Incorrect! " + player.getName() + " has " + player.getScore() + " points. Correct answer was: " + question.get("correctAnswer") + "\n");
            }
            player.increasePlayedRounds();
            questions.remove(0);
        }
    }

    @Override
    public boolean endOfGame() {
        int highestPlayedRounds = 0;
        int highestScore = 0;

        for (Player p : players) {
            highestPlayedRounds = Math.max(highestPlayedRounds, p.getPlayedRounds());
            highestScore = Math.max(highestScore, p.getScore());
        }

        boolean allPlayersEqualTurns = true;
        for (Player player : players) {
            if (player.getPlayedRounds() != highestPlayedRounds) {
                allPlayersEqualTurns = false;
                break;
            }
        }

        return allPlayersEqualTurns && highestScore >= pointsForWin;
    }

    @Override
    public void displayWinner() {
        for(Player p : players) {
            if (p.getScore() == pointsForWin) {
                System.out.println("Winner " + p.getName() + "!");
            }
        }
    }
}