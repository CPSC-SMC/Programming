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
        
        // Do you like walnuts in your brownies?
        System.out.print("Do you like walnuts in your brownies? ");
        String walnuts = scan.nextLine();
        
        // if she has big feet and doesn't like walnuts, make fun of her
        // if she has small feet and doesn't like walnuts, exclude her from the club
        // otherwise, ask her to join the club
        
        
        // while loops: are we there yet?
        // while (_______) {
        //  ----->boolean expression
        //  do what is in the {}
        // }
        
        // for loops

    }
}
