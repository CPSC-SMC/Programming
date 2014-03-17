/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import edu.saintmarys.SimpleZip;

enum MyEnum {One, Three, Two, Four}
enum IceCreamFlavor {
    Chocolate, 
    CookieDough, 
    Vanilla, 
    Strawberry, 
    Superman 
}
/**
 *
 * @author Steven
 */
public class Day11 {
    
    public static void main(String [] args) {
        
        // Enumeration
        MyEnum val = MyEnum.Three;
        System.out.println(val);
        
        // Switching with enums
        switch (val) {
            case One:
                System.out.println("small");
                break;
            case Two:
            case Three:
                System.out.println("medium");
                break;
            default:
                System.out.println("large");
        }
        
        // for-each loops
        for (MyEnum e : MyEnum.values()) {
            System.out.println(e);
        }
        
        
        // Declare an enumeration for IceCreamFlavors
        // Print all of the halls using a for-each loop
        for (IceCreamFlavor e : IceCreamFlavor.values()) {
            System.out.println(e);
        }
        
        System.out.println("");
        String userInput = "Vanilla";
        IceCreamFlavor flav = IceCreamFlavor.valueOf(userInput);
        System.out.println(flav);
        // Print messages for each of the halls using a switch statement
        
        switch (flav) {
            case Chocolate:
                System.out.println("we're all out");
                break;
            case CookieDough:
                System.out.println("It's on sale");
                break;
            default:
                System.out.println("Thanks for your order");
        }
        
        // Arrays. Store a list of items of the same type/class.
        // Declare an array
        int [] myInts;
        double [] myDoubles;
        SimpleZip [] simples = new SimpleZip[10];
        // Allocate space in the array using new
        // Declare and initialize
        //String [] zips = {"10101","20202","30303","46556","90210"};
        // Declare and create
        
        
        
        
        // When we create an array, it only saves space for a certain number of
        // objects. We still have to put them into the array.
        
        
        // Access an item in an array
        //System.out.println(zips[2]);
        
        // Change an item in an array
        //zips[3] = "46601";
        
        // Loop through an array for / for-each
        
        
        // INSERT: adding an item to an array
        /*int count = 0;
        for (String zip : zips) {
            simples[count] = new SimpleZip(zip);
            count++;
        }*/
        
        // Loop through this array ; for-each/ for
        
    }
    
}