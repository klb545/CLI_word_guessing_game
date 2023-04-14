package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String word = "hello";

        int numberOfCharacters = word.length();

        String wordAsDisplayedAtStartOfGame = "";
        for(int i = 0; i < numberOfCharacters ; i++) {
            wordAsDisplayedAtStartOfGame = wordAsDisplayedAtStartOfGame.concat("*");
        }

        String wordDisplayedDuringGame = wordAsDisplayedAtStartOfGame;

        while (true) {
            // print message to prompt the user
            System.out.println("Guess a letter in the secret word.");

            // create variable for user input
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            // generate the word as it should be displayed during the game based on the user input so far
            for (int i = 0; i < numberOfCharacters; i++) {
                if (input.equals(word.substring(i, i + 1))) {
                    wordDisplayedDuringGame = wordDisplayedDuringGame.substring(0, i) + input + wordDisplayedDuringGame.substring(i + 1);
                }
            }

            // print hidden word with the letters the user has guessed so far revealed
            System.out.println(wordDisplayedDuringGame);

            // print message if correct final word & break out of while loop
            if(wordDisplayedDuringGame.equals(word)){
                System.out.println("Woohoo! You guessed it!");
                break;
            }

            // print message if correct letter
            if (word.contains(input)) {
                System.out.println("You were right! Try guessing another letter.");
            }
            // print message if incorrect letter
            if (!word.contains(input)) {
                System.out.println("Nope, try again.");
            }

        }


    }
}






