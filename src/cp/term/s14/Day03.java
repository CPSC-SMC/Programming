/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.s14;

import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day03 {
    public static void main (String [] args) {
        
        // From last time
        System.out.println(10/5); // division
        System.out.println(14/5); // int / int ----> int

        // Change one number to a double
        System.out.println(14/5.);
        int a = 14;
        int b = 5;
        System.out.println(a/b);
        System.out.println((double)a/b);
        System.out.println(a/(double )b);
        
        System.out.println((char) 99);
        
        // String variables
        String name = "Chisom";
        System.out.println(name);
        System.out.println("name");
        
        // a String method
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
        // System.out.println(name.charAt(10));
        
        // Create a Scanner
        Scanner scan = new Scanner(System.in);
        
        // read user input
        System.out.println("What's your name?");
        String response = scan.nextLine();
        System.out.println("Hi " + response);
    }
}
