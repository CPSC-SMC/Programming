/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import java.util.Random;
import java.util.Scanner;

/**
 * On Day 4, we will discuss packages, creating objects from classes, using those
 * objects, how some of the classes work, how to import classes and so forth.
 * 
 * These topics are discussed in the Textbook in Chapter 3, Sections 1-6.
 * 
 * @author sbroad
 */
public class Day04 {
    
    /**
     * This program walks through some examples of how to create and use objects
     * of different types.
     * 
     * @param args
     */
    public static void main(String [] args) {
        
        // String variables are objects!!!
        String place = "The Eiffel Tower";
        
        // charAt method
        System.out.println(place.charAt(0));
        System.out.println(place.charAt(3));        
        System.out.println(place.charAt(4));
        
        // length method
        System.out.println(place.length());
        
        
        // toLowerCase, toUpperCase
        System.out.println(place.toUpperCase());
        System.out.println(place.toLowerCase());
        
        // equals / equalsIgnoreCase
        // talk about boolean variables
        System.out.println(place.equals("The White House"));
        System.out.println(place.equals("the eiffel tower"));
        System.out.println(place.equalsIgnoreCase("the eiffel tower"));

        // substring(______)
        //           start 
        System.out.println(place.substring(4));
        System.out.println(place.substring(10));
        
        // substring(______, _______)
        //           start , end before
        System.out.println(place.substring(4,11));
        
        // Initials?
        String first = "Yvonne";
        String last = "MacGruder";
        System.out.println(first.charAt(0) + "" + last.charAt(0));
        System.out.println(first.substring(0,1) + last.substring(0,1));
        
        // replace(____, ______)
        //         find, replace with
        System.out.println(place.replace("e", "!!!!"));
        System.out.println(place.replace("Tower", "Spa"));
        
        // Packages and imports
        Scanner scan = new Scanner(System.in);
        
        
        // Random numbers
        Random gen = new Random();
        System.out.println(gen.nextInt());
        System.out.println(gen.nextFloat());
        
        // random number from 0 to 9
        System.out.println(gen.nextInt(10));
        
        // random number from 1 to 10
        System.out.println(gen.nextInt(10) + 1);
        
        
        
        
        
    }
    
}
