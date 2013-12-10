/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.f13;

/**
 *
 * @author sbroad
 */
public class Day02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variable for number of sccops
        int scoops; // scoops of ice cream
        
        // initialize scoops
        scoops = 3;
        
        // print out a message about scoops
        System.out.print("Number of scoops: ");
        System.out.println(scoops);
        
        System.out.print("Would you like to upgrade to ");
        System.out.println(scoops + 1);
        
        // declare a variable for the price
        double price;
        price = 1.60*scoops;
        
        System.out.println("Your total is "+price);
    }
}
