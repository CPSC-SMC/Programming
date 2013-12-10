/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.f13;

import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] myStrings = new String[10];
        Scanner scan = new Scanner(System.in);
        // nothing in it yet
        int count = 0;
        
        while (count < 5)
        {
            System.out.print("Enter a pony name: ");
            // INSERT the word "why?"
            myStrings[count] = scan.nextLine();
            count++;
        
        }    
        
        // DELETE the word why?
        myStrings[0] = myStrings[count - 1];
        count--;
        
        System.out.println("Your remaining ponies are");
        for (int index = 0; index < count; index++)
        {
            System.out.println(myStrings[index]);
        }
        
        System.out.println("Which position should we change?");
        int pos = scan.nextInt();
        scan.nextLine();
        
        System.out.println("What should we change it to?");
        String newname = scan.nextLine();
        
        // UPDATE 
        myStrings[pos] = newname;
        
        System.out.println("Your remaining ponies are");
        for (int index = 0; index < count; index++)
        {
            System.out.println(myStrings[index]);
        }
        
        
    }
}
