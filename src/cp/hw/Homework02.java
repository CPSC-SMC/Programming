/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.hw;

import java.util.Arrays;

/**
 * <p>Homework 2: Strings, objects, methods, parameters </p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>Complete each of the methods in Homework02 below. Each method describes what
 * it is supposed to do. Use the <code>return</code> statement to return the
 * required information.</p>
 * 
 * <p>Create a project called Homework02. Copy this file over the contents of
 * Homework02.java. The main method does not need to be modified. Delete each
 * throw new cp.HomeworkException(); and replace it with the code you need to
 * accomplish each task.</p>
 * 
 * <p>Submit your project in the usual way. See Lab01 for details.</p>
 * 
 * @author sbroad
 */
public class Homework02 {
    /**
     * Compute the initials for a person with a certain first and last name.
     * Make sure that you make them upper case. Use either the <code>charAt</code>
     * method or the <code>substring</code> method.
     * @param firstName the first name
     * @param lastName the last name
     * @return the upper case initials that go with firstName lastName
     */
    public static String getInitials(String firstName, String lastName) {
        throw new cp.HomeworkException();
    }

    /**
     * Compute the mock piglatin translation for <code>word</code>. This isn't
     * "real" piglatin, which requires a somewhat more complicated translation.
     * 1. move the first letter of the word to the end of the word.
     * 2. add "ay" to the end.
     * @param word a word to translate
     * @return the piglatin translation
     */
    public static String pigLatin(String word) {
        throw new cp.HomeworkException();
    }
    
    /**
     * Using all of the provided information, format the address. Use the
     * <code>String.format</code> method.
     * @param number the house number
     * @param street the street name
     * @param city the city
     * @param state the state
     * @return a nicely formatted address
     */
    public static String mailingAddress(int number, String street, String city, String state) {
        throw new cp.HomeworkException();
    }
    
    /**
     * Simulate rolling a six-sided die. Return a number from 1 to 6. To test
     * this, the main method will roll the die many times and print a list of
     * die rolls. They should be "random" with no values below 1 or above 6.
     * @return a number from 1 to 6.
     */
    public static int rollDie() {
        throw new cp.HomeworkException();
    }
    
    /**
     * Create a date string from the number of milliseconds since Jan 1, 1970.
     * 1. Create the Date object.
     * 2. Return the string.
     * @param ticks the number of milliseconds since Jan 1, 1970 12:00am GMT
     * @return a string representing the date at the specified number of ticks
     */
    public static String getDate(long ticks) {
        throw new cp.HomeworkException();
    }
    
   /**
     * This is a program to test your Homework 2 solutions.
     * @param args command line parameters
     */
    public static void main(String [] args) {
        System.out.printf("%s %s (%s)\n", "ronald", "mcdonald", getInitials("Ronald","McDonald"));
        System.out.printf("%s --> %s", "scram\n", pigLatin("scram"));
        int [] dice = new int[30];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = rollDie();
        }
        System.out.printf("You rolled: %s\n", Arrays.toString(dice));
        System.out.println(getDate(1000*60*60*24*183));
    }
    
    
}
