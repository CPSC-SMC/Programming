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
public class Day11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int count = 1;
        
        while (count < 128)
        {
            System.out.println("Me too! " + count);
            //count++; // count = count + 1;
            count *= 2;
        }
        System.out.println(count);
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? (Enter for quit)");
        String name = scan.nextLine();
        while (name.length() > 0)
        {
            System.out.println("Hi " + name + "!");
            System.out.println("What is YOUR name?");
            name = scan.nextLine();
        }
        
        // ask the user how many iterations
        System.out.println("How many greetings do you want?");
        int iter = scan.nextInt();
        
        for (short i = 0; i < iter; i++)
        {
            System.out.println("Hello" + i);
        }
        
        for (String arg : args)
        {
            System.out.println(arg);
        }
    }
}
