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
    }
}