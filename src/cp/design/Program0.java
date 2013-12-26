package cp.design;

import java.util.Scanner;

/**
 * <h1>Program 0: Counting pennies</h1>
 * 
 * <h2>Program Description</h2>
 * <p>Many of us have large collections of pennies in various containers in our 
 * homes.  If we could turn these into dollars, quarters, dimes, etc., the money 
 * would be more usable.  This program allows a user to enter (from the 
 * keyboard) the number of pennies in her favorite container.  It then computes 
 * and prints the number of dollars, quarters, dimes, nickels, and pennies that 
 * it should changed into that totals the same amount.</p>
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
 * <p>This program uses the java.util.Scanner class.</p>
 * 
 * <h2>User Documentation</h2>
 * Open the command window in Windows or the terminal window in MacOS X/Linux. 
 * Navigate to the directory or folder where the compiled java program is stored 
 * using the cd command. (For example, 
 * <code>&gt; H:<br/>&gt; cd My Documents/Program1/dist<br/></code>
 * 
To run the program, the user should type 
> java -jar Program1.jar 
in the command/terminal window.
System Requirements
The system may be Windows XP or later, MacOS X 10.6 (Snow Leopard) or later or a recent Linux distribution. The Java 2 Standard Edition (J2SE) version 6 or later must be installed on the system, with a minimum of 1GHz CPU, 1GB of RAM.
Testing
Test 1
Run the program.
When prompted, enter 376.
(A) The user is able to enter the number of pennies.   _____
(B) The prompt was appropriate and clear.   _____
Verify that the output is as follows:
Dollars:  3
Quarters: 3
Dimes:    0
Nickels:  0
Pennies:  1
(C) The program prints the appropriate number of each denomination. _____
(D) The results must be printed one denomination per line. _____
(E) The pennies should be converted into the largest denominations first with the remainder converted into smaller denominations. ______

Test 2
Run the program.
When prompted, enter 99.
(A) The user is able to enter the number of pennies.   _____
(B) The prompt was appropriate and clear.   _____
Verify that the output is as follows:
Dollars:  0
Quarters: 3
Dimes:    2
Nickels:  1
Pennies:  4
(C) The program prints the appropriate number of each denomination. _____
(D) The results must be printed one denomination per line. _____
(E) The pennies should be converted into the largest denominations first with the remainder converted into smaller denominations. ______

Test 3
Run the program.
When prompted, enter 206.
(A) The user is able to enter the number of pennies.   _____
(B) The prompt was appropriate and clear.   _____
Verify that the output is as follows:
Dollars:  2
Quarters: 0
Dimes:    0
Nickels:  1
Pennies:  1
(C) The program prints the appropriate number of each denomination. _____
(D) The results must be printed one denomination per line. _____
(E) The pennies should be converted into the largest denominations first with the remainder converted into smaller denominations. ______



 * @author Steven
 */
public class Program0 {

    /**
     * This is the main method of Program0, which converts the user entered 
     * number of pennies into dollars, quarters, dimes, nickels and pennies.
     * <ol><li>Create a Scanner object to read in the number of pennies.</li>
     * <li>Prompt the user to enter a number of pennies.</li>
     * <li>Scan in the number of pennies from the console.</li>
     * <li>Compute the number of dollars in pennies and then the number of pennies left over.</li>
     * <li>Compute the number of quarters in pennies and then the number of pennies left over.</li>
     * <li>Compute the number of dimes in pennies and then the number of pennies left over.</li>
     * <li>Compute the number of nickels in pennies and then the number of pennies left over.</li>
     * <li>Print the number of dollars, quarters, dimes, nickels and pennies.</li>
     * <li>Exit.</li></ol>
     * 
     * @param args
     */
    public static void main(String [] args) {
        
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user for a number of pennies and scan in the reply
        System.out.print("How many pennies do you have? ");
        int pennies = scan.nextInt();
        
        // Reply to the user input
        System.out.printf("%d pennies can be converted to", pennies);
        
        // Convert the pennies to dollars
        System.out.printf("Dollars:  %d\n", pennies/100);
        
        // Convert the pennies to quarters
        System.out.printf("Quarters: %d\n", pennies % 100 / 25);
        
        // Convert the pennies to dimes
        System.out.printf("Dimes:    %d\n", pennies % 25 / 10);
        
        // Convert the pennies to nickels
        System.out.printf("Nickels:  %d\n", pennies % 10 /  5);
        
        // Convert the pennies to remaining pennies
        System.out.printf("Pennies:  %d\n", pennies % 5);
    }
}
