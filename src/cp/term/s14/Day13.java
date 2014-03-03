/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import edu.saintmarys.SimpleZip;
import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day13 {
    public static void main(String []  args) {
        
        // Declare and create
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
        System.out.println("What zip code do you want to add?");
        String zip = scan.nextLine();
        
        while(zip.length() == 5) {
            // Create a SimpleZip object
            SimpleZip simple = new SimpleZip(zip);
            
            // 1. modify the array
            simples[count] = simple;
            
            // 2. increase count by 1
            count++;
            
            // ask user for next zip code
            System.out.println("What zip code do you want to add?");
            zip = scan.nextLine();

        }
        
        // Print the zip code
        System.out.println("Below are the filled in positions");
        for (index = 0; index < count; index++) {
            System.out.println(simples[index]);
        }
        
        
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
        
        // Loop until you find a match or run out of items

        
        // Did you find a match??

        
        
        // FIND: An item in an array of objects, by searching for one attribute

        
        
        // Loop until you find a match or run out of items

        
        
        // Did you find a match??

        
        
        // Print the final array

    


    }
}
