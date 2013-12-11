/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.hw;

import cp.HomeworkException;
import java.util.Arrays;

/**
 * <p>Homework 2: Strings, objects, methods, parameters </p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>Complete each of the methods in Homework2 below. Each method describes what
 * it is supposed to do. Use the <code>return</code> statement to return the
 * required information.</p>
 * 
 * <p>Create a project called Homework2. Copy this file over the contents of
 * Homework2.java. The main method does not need to be modified.</p>
 * 
 * <p>Submit your project in the usual way. See Lab01 for details.</p>
 * 
 * @author sbroad
 */
public class Homework2 {
    /**
     * Compute the initials for a person with a certain first and last name.
     * Make sure that you make them upper case. Use either the <code>charAt</code>
     * method or the <code>substring</code> method.
     * @param firstName the first name
     * @param lastName the last name
     * @return the upper case initials that go with firstName lastName
     */
    public static String getInitials(String firstName, String lastName) {
        throw new HomeworkException();
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
        throw new HomeworkException();
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
        throw new HomeworkException();
    }
    
    /**
     * Simulate rolling a six-sided die. Return a number from 1 to 6. To test
     * this, the main method will roll the die many times and print a list of
     * die rolls. They should be "random" with no values below 1 or above 6.
     * @return a number from 1 to 6.
     */
    public static int rollDie() {
        throw new HomeworkException();
    }
    
    /**
     * Create a date string from the number of milliseconds since Jan 1, 1970.
     * 1. Create the Date object.
     * 2. Return the string.
     * @param ticks the number of milliseconds since Jan 1, 1970 12:00am GMT
     * @return a string representing the date at the specified number of ticks
     */
    public static String getDate(long ticks) {
        throw new HomeworkException();
    }
    
    /**
     * Compute the number of days between two dates. 
     * 1. You will need a SimpleDateFormat object. 
     * 2. You will use the <code>SimpleDateFormat.parse</code> method. 
     * 3. You will convert each string to a <code>Date</code> object. 
     * 4. You will obtain the number of ticks corresponding to each <code>Date</code>. 
     * 5. You will compute the difference between these number of ticks. This is 
     * the number of milliseconds between the two dates.
     * 6. You will convert the number of milliseconds to a number of days. (Be
     * careful to convert to <code>double</code> early to avoid rounding.
     * @param start a date in month day year format
     * @param end a date in month day year format
     * @return the (fractional) number of days between start and end
     */
    public static double getDaysBetween(String start, String end) {
        throw new HomeworkException();
    }
    
    /**
     * This is a program to test your Homework 2 solutions.
     * @param args command line parameters
     */
    public static void main(String [] args) {
        System.out.printf("%s %s (%s)\n", "ronald", "mcdonald", getInitials("Ronald","McDonald"));
        System.out.printf("%s --> %s", "scram", pigLatin("scram"));
        int [] dice = new int[30];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = rollDie();
        }
        System.out.printf(Arrays.toString(dice));
        System.out.println(getDate(1000*60*60*24*183));
        System.out.printf("There are %.2f days between %s and %s.\n",
                getDaysBetween("05/20/2012", "05/17/2013"), "05/20/2012", "05/17/2013");
    }
    
    
}
