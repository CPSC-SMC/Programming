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
public class Day12 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        // Arrays. Store a list of items of the same type/class.
        
        // Declare an array
        int [] myInts;
        double [] myDoubles;
        
        // Allocate space in the array using new
        // Declare and initialize
        String [] zips = {"10101","20202","30303","46556","90210"};
        System.out.println(zips.length);
        
        
        // Declare and create
        SimpleZip [] simples = new SimpleZip[10];
        
        // Access an item in an array
        System.out.println(zips[2]);
        
        // Change an item in an array
        //zips[3] = "46601";

        // Loop through an array for / for-each
        for (String zip : zips) {
            System.out.println(zip);
        }
        
        // When we create an array, it only saves 
        // space for a certain number of
        // objects. We still have to put them 
        // into the array.
        
        for (SimpleZip simple : simples) {
            System.out.println(simple);
        }
        
        int index;  // position we are currently looking at
        int count = 0; // number of positions filled
                        // in the array

        // INSERT: adding an item to an array
        //      add each zip code to the simplezip array
        simples[count] = new SimpleZip("10101");
        count ++;
        
        simples[count] = new SimpleZip("46556");
        count++;
        
        System.out.println("Below are the filled in positions");
        for (index = 0; index < count; index++) {
            System.out.println(simples[index]);
        }
        

        
        // INSERT: start over... ask user to enter
        // count = 0;
        

        // Loop through this array ; for-each/ for
        // for (SimpleZip simple : simples) {
        //     System.out.println(simple);
        // }
        
        // Loop through the array; only show "used" array positions
//        int index;
//        for (index = 0; index < count; index++) {
//            System.out.println(simples[index]);
//        }
        
        // FIND: Search for an item in an array

        
        // Loop until you find a match or run out of items

        
        // Did you find a match??

        
        
        // FIND: An item in an array of objects, by searching for one attribute

        
        
        // Loop until you find a match or run out of items

        
        
        // Did you find a match??

        
        
        // Print the final array

    
    }
}
