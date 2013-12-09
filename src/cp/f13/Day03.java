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
public class Day03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String response; // users response typed
        
        // Prompt user for information
        System.out.println("What is your name?");
        
        // Store the name
        response = scan.nextLine();
        
        // prompt
        System.out.println("How old are you?");
        
        // store the response
        int age;
        age = scan.nextInt();
        
        // Acknowledge the users input
        System.out.print("Hello ");
        System.out.print(response);
        System.out.print("! I am ");
        System.out.print(age);
        System.out.println(", too!");
    }
}
