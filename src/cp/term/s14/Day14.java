/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.s14;

import edu.saintmarys.SimpleZip;
import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day14 {
    public static void main(String [] args) {
                // Declare and create
        String [] zipCodes = {"10101", "20202", "30303", "90210", "46556"};
        SimpleZip [] simples = new SimpleZip[10];
                
        // When we create an array, it only saves 
        // space for a certain number of
        // objects. We still have to put them 
        // into the array.
        int index;  // position we are currently looking at
        int count = 0; // number of positions filled
                        // in the array

        // INSERT: adding an item to an array
        //      add each zip code to the simplezip array
        Scanner scan = new Scanner(System.in);
        
        for (String zipCode : zipCodes) {
            // Create a SimpleZip object
            SimpleZip simple = new SimpleZip(zipCode);
            
            // 1. modify the array
            simples[count] = simple;
            
            // 2. increase count by 1
            count++;
            

        }
        
        // Print the zip code
        //System.out.println("Below are the filled in positions");
        //for (index = 0; index < count; index++) {
        //    System.out.println(simples[index]);
        //}
        
        
        // FIND: Search for an item in an array
        System.out.println("What zip code do you want to find?");
        String code = scan.nextLine();
        for (index = 0; index < count; index++) {
            // check for a match
            if (code.equalsIgnoreCase(simples[index].getZip())) {
                // we found  match ... leave loop
                break;
            }
        }
        
        if (index < count) { //we found it !!!
            System.out.println("We found " + simples[index]);
        }
        else
        {
            System.out.println("Not found");
        }
        
        // Search for a matching state
        System.out.println("What state do you want to find?");
        String state = scan.nextLine();
        for (index = 0; index < count; index++) {
            // check for a match
            // change based on what I'm searching for
            if (state.equalsIgnoreCase(simples[index].getState())) {
                // we found  match ... leave loop
                break;
            }
        }
        
        if (index < count) { //we found it !!!
            System.out.println("We found " + simples[index]);
            // DELETE it
            // 1. modify the array
            simples[index] = simples[count-1];
            // 2. subtract one from count
            count--;
        }
        else
        {
            System.out.println("Not found");
        }

        System.out.println("Below are the filled in positions");
        for (index = 0; index < count; index++) {
            System.out.println(simples[index]);
        }

        // Loop until you find a match or run out of items

        
        // Did you find a match??

        
        
        // FIND: An item in an array of objects, by searching for one attribute

        
        
        // Loop until you find a match or run out of items

        
        
        // Did you find a match??

        
        
        // Print the final array

    


    }
}
