package com.meghpathak;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mark", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Louise", highScorePosition);

    }

    public static void displayHighScorePosition (String playerName, int highScorePosition){

        System.out.println( playerName + " managed to get into position " + highScorePosition + " on the high score table" );

    }

    public static int calculateHighScorePosition (int playerScore) {

        if (playerScore >= 1000){
            return 1;
        }

        else if (playerScore >= 500 && playerScore < 1000 ) {
            return 2;
        }

        else if (playerScore >= 100 && playerScore < 500 ) {
            return 3;
        }

        else {
            return 4;
        }

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

}
