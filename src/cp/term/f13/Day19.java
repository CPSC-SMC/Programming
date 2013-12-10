/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.f13;

import cp.lib.Sorting;
import java.util.Random;

/**
 *
 * @author sbroad
 */
public class Day19 {
 
    public static void main(String [] args)
    {
        Random gen = new Random();
        int size = 20000;
        Integer [] myArray1 = new Integer[size];
        Integer [] myArray2 = new Integer[size];
        Integer [] myArray3 = new Integer[size];
        for (int index = 0; index < myArray1.length; index++)
        {
            myArray1[index] = gen.nextInt(1000);
            myArray2[index] = myArray1[index];
            myArray3[index] = myArray1[index];
            //System.out.print(myArray1[index] + ", ");
        }
        
        System.out.println();
        int bubble = Sorting.bubbleSort(myArray1);
        int selection = Sorting.selectionSort(myArray2);
        int insertion = Sorting.insertionSort(myArray3);
        
        System.out.println("Bubble sort took: " + bubble);
        System.out.println("Selection sort took: " + selection);
        System.out.println("Insertion sort took: " + insertion);
    }
}
