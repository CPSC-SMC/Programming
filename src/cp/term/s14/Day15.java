/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import cp.lib.Sorting;
import edu.saintmarys.SimpleZip;
import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day15 {
    public static void main(String [] args) {
        String [] zipCodes = {"10101", "20202", "30303", "90210", "46556"};
        SortableSimpleZip [] simples = new SortableSimpleZip[10];
                
        // When we create an array, it only saves 
        // space for a certain number of
        // objects. We still have to put them 
        // into the array.
        int index;  // position we are currently looking at
        int count = 0; // number of positions filled
                        // in the array

        // INSERT: adding an item to an array
        //      add each zip code to the simplezip array
        Scanner scan = new Scanner(System.in);
        
        for (String zipCode : zipCodes) {
            // Create a SimpleZip object
            SortableSimpleZip simple = new SortableSimpleZip(zipCode);
            
            // 1. modify the array
            simples[count] = simple;
            
            // 2. increase count by 1
            count++;
            
        }
        
        Sorting.selectionSort(simples);
        
        for (index = 0; index < count; index++) {
            System.out.println(simples[index]);
        }
    }
}

class SortableSimpleZip extends SimpleZip implements Comparable<SimpleZip> {
    public SortableSimpleZip(String zip) {
        super(zip);
    }

    @Override
    public int compareTo(SimpleZip o) {
        return -this.getCity().compareTo(o.getCity());
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    
}