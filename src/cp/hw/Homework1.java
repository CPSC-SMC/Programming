/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.hw;

import cp.HomeworkException;

/**
 * <p>CPSC 207: Computer Programming<br/>
 * Homework 1: Variables, methods, expressions, data conversion</p>
 * 
 * <p>Complete each of the methods in Homework1 below. Each method describes what
 * it is supposed to do. Use the <code>return</code> statement to return the
 * required information.</p>
 * 
 * <p>Create a project called Homework1. Copy this file over the contents of
 * Homework1.java. The main method does not need to be modified. Remove the lines
 * marked <code>throw new HomeworkException();</code>.</p>
 * 
 * <p>Submit your project in the usual way. See Lab01 for details.</p>
 * 
 * @author sbroad
 */
public class Homework1 {

    /**
     * Here is an example. It adds two integers.
     * @param a an addend
     * @param b another addend
     * @return a+b
     */
    public static int example(int a, int b) {
        return a + b;
    }

    /**
     * Return the quotient of a and b expressed in decimal form.
     * @param a
     * @param b
     * @return a/b, as a <code>double</code>
     */
    public static double divide(int a, int b) {
        throw new HomeworkException();
    }

    /**
     * Given a certain number of inches, return the equivalent number of
     * centimeters. There are roughly 2.54 centimeters per inch.
     * @param inches the number of inches
     * @return the corresponding number of centimeters
     */
    public static double inchesToCentimeters(double inches) {
        throw new HomeworkException();
    }

    /**
     * Multiply two very small integer variables together.
     * @param a one small integer
     * @param b another small integer
     * @return a times b, as an integer
     */
    public static int multiply(byte a, byte b) {
        throw new HomeworkException();
    }
    
    /**
     * Return a string that wishes someone a Happy _____ Birthday. For example,
     * Happy 19th Birthday. Don't worry about whether ending should be st, nd, rd,
     * or th. So Happy 21th birthday is okay.
     * @param age
     * @return
     */
    public static String birthday(int age) {
        throw new HomeworkException();
    }
    
    /**
     * Prompt the user for her name. Scan in her name. Acknowledge the user's
     * response by printing Hello, ______! to the console. For example, if the
     * user responds with Elmo, it should print Hello, Elmo!
     */
    public static void promptRespondAcknowledge() {
        
    }
    
    /**
     * This main method uses the methods that you have implemented above. Please
     * do not modify it.
     * @param args
     */
    public static void main(String [] args) {
        System.out.printf("%d + %d = %d\n", 5, -3, example(5,-3));
        System.out.printf("%d / %d = %.4f\n", 5, -3, divide(5,-3));
        System.out.printf("%.2f inches is %.2f cm\n", 4.0, inchesToCentimeters(4.0));
        System.out.printf("%d * %d = %d", 100, 100, multiply((byte)100,(byte)100));
        System.out.println(birthday(18));
        
    }
}
