/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.hw;

import cp.HomeworkException;

/**
 * <p>Homework 4: Boolean expressions, conditionals, flow control</p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>Complete each of the methods in Homework4 below. Each method describes what
 * it is supposed to do. Use the <code>return</code> statement to return the
 * required information.</p>
 * 
 * <p>Create a project called Homework4. Copy this file over the contents of
 * Homework1.java. The main method does not need to be modified. Remove the lines
 * marked <code>throw new HomeworkException();</code>.</p>
 * 
 * <p>Submit your project in the usual way. See Lab01 for details.</p>
 * 
 * @author sbroad
 */
public class Homework4 {
    
    /**
     * Is the number <code>n</code> bigger than five?
     * @param n a number
     * @return true if n is bigger than five, false otherwise
     */
    public static boolean isBiggerThanFive(int n) {
        throw new HomeworkException();
    }
    
    /**
     * This function determines whether or not the truth values are the same.
     * @param p a truth value
     * @param q another truth value
     * @return true if both are the same, false if they are different
     */
    public static boolean bothTrueOrBothFalse(boolean p, boolean q) {
        throw new HomeworkException();
    }
    
    /**
     * This function determines value is between the values pi and e. The constant
     * pi is approximately 3.141592654. The constant e is approximately 2.718281828.
     * Use Math.E and Math.PI to represent these constants.
     * @param value is this value between e and pi
     * @return true if both are the same, false if they are different
     */
    public static boolean betweenPiAndE(double value) {
        throw new HomeworkException();
    }

    
    /**
     * Goldilocks is particular about her porridge temperature. She prefers it to
     * be between 94 and 102 degrees Fahrenheit. If it is colder than 94, it is
     * too cold. If it is warmer than 102, it is too hot. Otherwise, it is just
     * right.
     * @param temperature
     * @return one of "too hot", "too cold" or "just right"
     */
    public static String goldilocks(int temperature) {
        throw new HomeworkException();
    }

    /**
     * You will create an Animal named "Lion" that begins with 0 hunger, 0 thirst,
     * and 1 energy.<ol>
     * <li>The lion will forage().</li> 
     * <li>After foraging, if the lion's energy is less than 0, the animal must 
     * then sleep(). Otherwise the animal
     * @return true if hunger and thirst are less than 4
     */
    public static boolean aliveAtTheEndOfTheDay() {
        throw new HomeworkException();
    }
    
    /**
     * This is a test program for your homework exercises. Please don't modify it.
     * @param args
     */
    public static void main(String [] args) {
        System.out.printf("%d greater than 5 should be true: %s\n", 7, isBiggerThanFive(7));
    }
    
}
