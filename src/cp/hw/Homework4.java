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
 * Homework4.java. The main method does not need to be modified. Remove the lines
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
     * then sleep(). Otherwise the animal will eat() then sleep().</li>
     * <li>The lion must forage() for water, then drink(), then sleep() if 
     * energy less than 0.</li>
     * <li>The lion must forage() for food, then eat(), then sleep() if energy 
     * less than 0.</li>
     * <li>Is the lion going to survive? Is the lion's hunger and thirst
     * </ol>
     * 
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
        
        // Examine our test functions with several values of n
        for (int n = 4; n < 10; n++) {
            
            if (isBiggerThanFive(n)) {
                System.out.printf("%d is bigger than 5\n", n);
            }
            else {
                System.out.printf("%d is NOT bigger than 5\n", n);
            }
        }
        
        // Try the bothTrueOrBothFalse method
        System.out.println("true,true=" + bothTrueOrBothFalse(true, true));
        System.out.println("true,false=" + bothTrueOrBothFalse(true, false));
        System.out.println("false,true=" + bothTrueOrBothFalse(false, true));
        System.out.println("false,false=" + bothTrueOrBothFalse(false, false));
        
        // Try the betweenEAndPi method
        for (double x = 2.5; x < 3.5; x+=0.10) {
            if (betweenPiAndE(x)) {
                System.out.printf("%.2f is between e and pi\n", x);
            }
            else {
                System.out.printf("%.2f is NOT between e and pi\n", x);
            }
        }
        
        // Try the goldilocks method
        for (int temp = 90; temp < 130; temp += 5) {
            System.out.println("Goldilocks thinks it's " + goldilocks(temp));
        }
        
        // Try the aliveAtTheEndOfTheDay() method several times
        for (int lion = 1; lion <= 10; lion++) {
            if (aliveAtTheEndOfTheDay()) {
                System.out.printf("Lion %d lived.\n", lion);
            }
            else {
                System.out.printf("Lion %d died.\n", lion);
            }
        }
    }
    
}
