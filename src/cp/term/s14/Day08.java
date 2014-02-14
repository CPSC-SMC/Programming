/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day08 {
    public static void main(String [] args) {
        // Last time, we created an Account object
        // Instead of importing Account from an existing package,
        // we defined the account class ourselves
        // See Account.java
        Account acct = new Account(11111, "Saint Mary's", (float) 234.56);
        System.out.println(acct);        

        // Ask the user to input information
        // Create scanner
        Scanner scan = new Scanner(System.in);
        
        // Prompt, respond, acknowledge for account number
        // Prompt, respond, acknowledge for account name
        // Prompt, respond, acknowledge for account balance
        // Create account object and print
        
        
        // Begin boolean expressions and conditionals
        System.out.println(5 < 6);
        System.out.println("yes".equalsIgnoreCase("YES"));
        System.out.println("yes".equals("YES"));
        
        // AND, OR, NOT
        
        
        // equals, not equals
        
        
        
        // Need to change the behavior of a program based on the values
        // of certain variables
        int shoeSize = 14;
        
        
        // System.out.println("Do you like walnuts in brownies?");
        String response = scan.nextLine();
        
        
    }
}
