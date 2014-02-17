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
public class Day09 {
    public static void main(String [] args) {
        System.out.print("What size do you need? ");
        Scanner scan = new Scanner(System.in);
        
        int shoeSize = scan.nextInt();
        scan.nextLine(); // clear the enter key
        if (shoeSize > 13) {
            System.out.println("Sorry we don't carry it");
        }
        else {
            System.out.println("Let me go look in the back");
        }
        
        if (shoeSize > 13) {
            System.out.println("Too big.");
        }
        else if (shoeSize < 5) {
            System.out.println("Too small");
        }
        else
        {
            System.out.println("Just right");
        }
            
        // Do you like walnuts in your brownies?
        System.out.print("Do you like walnuts in your brownies (Yes/No)? ");
        String walnuts = scan.nextLine();
        
        // if she has big feet and doesn't like walnuts, make fun of her
        if (shoeSize > 13 && walnuts.toUpperCase().startsWith("NO")) {
            System.out.println("Is that because you don't like to step on them with your big feet?");
        }
        // if she has small feet and doesn't like walnuts, exclude her from the club
        else if (shoeSize <= 13 && walnuts.equalsIgnoreCase("no")) {
            System.out.println("I guess you won't be joining our club then.");
        }
        // otherwise, ask her to join the club
        else {
            System.out.println("Do you want to join our walnut brownie club?");
        }
        
        // while loops: are we there yet?
        // while (_______) {
        //  ----->boolean expression
        //  do what is in the {}
        // }
        String answer = "no";
        boolean keepGoing = answer.equalsIgnoreCase("no");
        while(keepGoing) {
            System.out.print("Are we there yet? ");
            answer = scan.nextLine();
            keepGoing = answer.equalsIgnoreCase("no");
        }
        
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 2; // adds one to count
        }
        
        // for loops

    }
}
