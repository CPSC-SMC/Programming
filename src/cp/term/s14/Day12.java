/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import edu.saintmarys.SimpleZip;
import java.util.Scanner;

/**
 * <h1>Program 0: Counting pennies</h1>
 * 
 * <h2>Program Description</h2>
 * Many of us have large collections of pennies in various containers in our 
 * homes.  If we could turn these into dollars, quarters, dimes, etc., the money 
 * would be more usable.  This program allows a user to enter (from the 
 * keyboard) the number of pennies in her favorite container.  It then computes 
 * and prints the number of dollars, quarters, dimes, nickels, and pennies that 
 * it should changed into that totals the same amount.
 * 
 * <h2>User Requirements</h2>
 * <ol type="A">
 * <li>The user must be able to enter a number of pennies in the console.</li>
 * <li>The user must be prompted to enter the number of pennies with a clear
 * label.</li>
 * <li>Once the user enters the number of pennies, the program must print the 
 * appropriate number of dollars, quarters, dimes, nickels and pennies in that 
 * order.</li>
 * <li>The results must be printed one denomination per line (i.e. one line 
 * labeled "Dollars", one line labeled "Quarters", etc.).</li>
 * <li>The pennies should be converted into the largest denominations first with 
 * the remainder converted into smaller denominations (i.e. 125 pennies is 1 
 * dollar and 1 quarter, not 0 dollars and 5 quarters).</li>
 * </ol>
 * 
 * <h2>Design – Imports</h2>
 * This program uses the java.util.Scanner class.
 * 
 * <h2>User Documentation</h2>
 * Open the command window in Windows or the terminal window in MacOS X/Linux. 
 * Navigate to the directory or folder where the compiled java program is stored 
 * using the cd command. (For example, 
 * <p><code>> H:<br/>> cd My Documents/Program1/dist</code></p>
 * 
 * To run the program, the user should type 
 * <p><code>> java -jar Program1.jar </code></p>
 * in the command/terminal window.
 * 
 * <h2>User Instructions</h2>
 * The program will prompt the user to enter a number of pennies. The user should
 * enter a whole number of pennies. The program will then produce a report
 * indicating the number of dollars, quarters, dimes, nickels and remaining
 * pennies into which the initial number of pennies can be exchanged.
 * 
 * <h2>System Requirements</h2>
 * The system may be Windows XP or later, MacOS X 10.6 (Snow Leopard) or later 
 * or a recent Linux distribution. The Java 2 Standard Edition (J2SE) version 6 
 * or later must be installed on the system, with a minimum of 1GHz CPU, 1GB of 
 * RAM.
 * 
 * <h2>Testing</h2>
 * See TESTS.txt
 * 
 * @author Steven
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
