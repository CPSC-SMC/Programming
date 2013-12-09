/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.f13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "Monday";
        System.out.println(a.equals("Tuesday"));
        System.out.println(a.equals("monday"));
        System.out.println(a.equals("Monday"));
        System.out.println(a.equalsIgnoreCase("monday"));
        
        System.out.println(5<7);
        boolean piSmall;
        piSmall = Math.PI < 3;
        System.out.println(piSmall);
        int var = 3;
        System.out.println(var==5); //test for equality
        System.out.println(var=5);
        
        // Substring
        String b = "Monday is awesome!";
        System.out.println(b.substring(7,9));
        System.out.println(b.substring(7,10));
        System.out.println(b.substring(7,11));
        
        System.out.println(b.substring(13,18));
        System.out.println(b.substring(13));
        
        System.out.println(Arrays.toString(b.split(" ")));
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your favorite integer?");
        int answer = scan.nextInt();
        
        System.out.println(answer + " isn't my favorite! :P");
        // A new way of printing
        
        // double pi2 = "3.14159";
        double pi = Double.parseDouble("3.14159");
        System.out.println(pi);

        System.out.printf("%s %d isn't my favorite %3.9f\n", a, answer, Math.PI);
        
        // convert int to double
        int myInt = 5;
        double myDouble = myInt;
        System.out.println(myDouble);
        
        
        // convert double to int
        int myOtherInt = (int) pi; // p. 86 rounds down
        System.out.println(myOtherInt);
        
    }
}
