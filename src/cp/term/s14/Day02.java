/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.s14;

/**
 *
 * @author sbroad
 */
public class Day02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int scoops;
        scoops = 2;
        System.out.print("I'd like ");
        System.out.print(scoops);
        System.out.println(" scoops.");
        
        // Change value of sccops.
        scoops = 1;
        
        // String concatenation
        System.out.println("I'd like " + 
                scoops + " scoops.");
        
        // Arithmetic
        System.out.println(4+5); // addition
        System.out.println("4" + "5"); // concatenation
        System.out.println(4 + "5"); // concatenation
        
        // More arithmetic
        System.out.println(4*5); // multiplication
        System.out.println(10/5); // division
        System.out.println(14/5); // int / int ----> int
        
        
    }
}
