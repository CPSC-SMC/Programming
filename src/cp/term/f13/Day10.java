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
public class Day10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Do you like ice cream?");
        String response = scan.nextLine();
        
        if (response.substring(0,3).equalsIgnoreCase("YES"))
        {
            System.out.println("Me too!");
            System.out.println("Me too!");
            System.out.println("Me too!");
            System.out.println("Me too!");
            System.out.println("Me too!");
            System.out.println("Me too!");
            System.out.println("Me too!");
        }
        else
        {
            System.out.println("What's wrong with you?");
        }
        
        
        System.out.println("What temperature is it?");
        
        int temp = scan.nextInt();
        if (temp > 80 && response.equalsIgnoreCase("YES"))
        {
            System.out.println("Don't you wish you had some ice cream?");
        }
        else if (temp > 80 && !response.equalsIgnoreCase("YES"))
        {
            System.out.println("I'm going water skiing");
        }
        else if (temp > 72)
        {
            System.out.println("cool");
        }
        else if(temp < 68)
        {
            System.out.println("heat");
        }
        
    }
}
