/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.prog1.hangman.game;

import java.util.Scanner;
/**
 * This is my final project for Programming 1 at Vanier College.
 * This program is a Hangman program. Enjoy!
 * @author Constantinos Korres
 */
public class FinalProg1HangmanGame {

    /**
     * @param args the command line arguments
     */
   
    // creating the word bank
    private static final String[] words = {"freedom", "dependance", "neighbour", "actually", "minister", "beneath", "drive", "information", "governor", "students", "property", "greek", "internal"};
    // mkaing the program pick out a random word
    private static final String word = words[(int) (Math.random() * words.length)];
    // once word is picked the program displays the letters of the word in asterisk form, ready to be replaced
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    //counter to see how many tries it takes and to create the whole "hangman guess" feeling
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && asterisk.contains("*")) {
            System.out.println();
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);
            String guess = sc.next();
            hang(guess);
        } sc.close();
    }
    
    // replacing the letters and asterisks
    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }
        
        // correct guess output
        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanResult();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println();
            System.out.println("Correct! You win! The word was " + word);
        
            if (count <= 2 && count != 0) {
                System.out.println("You're a champion! ");
                System.out.println("It only took you " + count + " wrong guesses! ");
            } else if (count > 2 && count < 5 ) {
                System.out.println("You're a novice guesser, keep it up! ");
                System.out.println("It only took you " + count + " wrong guesses! ");
            } else if (count >= 5) {
                System.out.println("You're not a very guesser, but practice makes perfect! Don't give up! ");
                System.out.println("It only took you " + count + " wrong guesses! ");
            } else if (count == 0) {
                System.out.println("Flawless! ");
                System.out.println("You guessed perfectly! ");
            }
        }
    }
    
    // false guess output
    public static void hangmanResult() {
        switch (count) {
            case 1:
                System.out.println("Wrong guess, try again");
                System.out.println();
                break;
            case 2:
                System.out.println("Wrong guess, try again");
                System.out.println();
                break;
            case 3:
                System.out.println("Wrong guess, try again");
                System.out.println();
                break;
            case 4:
                System.out.println("Wrong guess, try again");
                System.out.println();
                break;
            case 5:
                System.out.println("Wrong guess, try again");
                System.out.println();
                break;
            case 6:
                System.out.println("Wrong guess, try again");
                System.out.println();
                break;
            case 7:
                System.out.println("GAME OVER!");
                System.out.println("GAME OVER! The word was " + word);
                break;
            default:
                break;
        }
    }
}
