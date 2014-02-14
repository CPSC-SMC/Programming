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
        System.out.println("Account number ?");
        //long num = scan.nextLong();
        //scan.nextLine();
        
        // Prompt, respond, acknowledge for account name
        System.out.println("Account name ?");
        //String name = scan.nextLine();
        
        // Prompt, respond, acknowledge for account balance
        System.out.println("Account balance ?");
        // double bal = scan.nextDouble();
        
        // Create account object and print
        //Account myAcct = new Account(num, name, bal);
        //System.out.println(myAcct);
        
        // Begin boolean expressions and conditionals
        System.out.println(5 < 6);
        System.out.println("yes".equalsIgnoreCase("YES"));
        System.out.println("yes".equals("YES"));
        
        // AND, OR, NOT
        System.out.println();
        System.out.println(5<6 && 71 < 70); // AND : both are true
        System.out.println(5<6 || 71<70); // OR : one or both are true
        System.out.println(!(5<6) || 71<70); // ! (bang) : NOT
        
        // equals, not equals
        System.out.println();
        System.out.println(5 == 6); // == -> test for equality
        System.out.println(5 != 6); // test for non-equality
        int val = 5;
        System.out.println( val = 6 );

        
        // Need to change the behavior of a program based on the values
        // of certain variables
        System.out.println("What size do you need?");
        
        int shoeSize = scan.nextInt();
        if (shoeSize > 13) {
            System.out.println("Sorry we don't carry it");
        }
        else {
            System.out.println("Let me go look in the back");
        }
            
        
        // System.out.println("Do you like walnuts in brownies?");
        String response = scan.nextLine();
        
        
    }
}
