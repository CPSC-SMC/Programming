/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.f13;

import cp.lib.Person;
import cp.lib.Sorting;

/**
 *
 * @author sbroad
 */
public class Day17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1 = "rainbow";
        String s2 = "tinsel";
        
        System.out.println(s1.compareTo(s2));
        
        Person [] people = new Person[4];
        int count = 0;
        
        // INSERT
        people[count] = new Person("Lauren", "Lindbloom");
        count++;
        
        //INSERT
        people[count] = new Person("Lizzy", "Juarez");
        count++;
        
        // INSERT
        people[count] = new Person("Katie", "Woolum");
        count++;
        
        //INSERT
        people[count] = new Person("Carolina", "Tapia");
        count++;
        
        Sorting.bubbleSort(people);
        
        for (Person p : people)
        {
            System.out.println(p);
        }
    }
}
