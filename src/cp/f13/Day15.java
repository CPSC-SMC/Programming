/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.f13;

import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] myArray = {"Alex", "Emily", "Carolina", "Lizzy", 
            "Lauren", "Marissa", "Katie", "Madison", "Ruth Anne"};
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Who do you want to search for?");
        String name = scan.nextLine();
        
        int count = myArray.length;
        boolean found = false;
        int index;
        
        for (index = 0; index < count; index++)
        {
            if(myArray[index].equalsIgnoreCase(name))
            {
                found = true;
                break;
            }
        }
        
        if (found) 
        {
            System.out.println("I found " + name + " in position " + index +".");
            
        }
        else
        {
            System.out.println("I didn't find " + name + ".");
        }
        
    }
}
