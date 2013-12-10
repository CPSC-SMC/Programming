/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.f13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author sbroad
 */
public class Day07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Random gen = new Random(); // using the Random constructor
        
        int num;
        float val;
        
        num = gen.nextInt(); //oops need to trim down the range
        System.out.println(num);
        
        num = gen.nextInt(10); // this ranges from 0 to 9
        System.out.println(num);
        
        num = gen.nextInt(10)+1; // this ranges from 1 to 10
        System.out.println(num);
        
        val = gen.nextFloat(); // random between 0 and 1
        System.out.println(val);
        
        val = 5 * gen.nextFloat(); // random between 0 and 5
        System.out.println(val);
        
        val = 4 * gen.nextFloat() - 2; // random number between -2 and 2
        System.out.printf("Score: %5.3f\n", val);

        System.out.println(Math.abs(val)); // absolute value of val
        
        Date a = new Date(); // Get the current date and time
        Date b = new Date(0);
        //If you have two date objects a and b, you can find out how far apart they are. You have to use the getTime() method.

        System.out.println(a.getTime());
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getTime() - b.getTime()); // prints number of milliseconds
        System.out.println((a.getTime() - b.getTime()) / 1000); // prints number of seconds
        System.out.println((a.getTime() - b.getTime()) / 1000 / 60); // prints number of minutes
        System.out.println((a.getTime() - b.getTime()) / 1000 / 60 / 60); // hours
        System.out.println((a.getTime() - b.getTime()) / 1000 / 60 / 60 / 24); // hours
        System.out.println((a.getTime() - b.getTime()) / 1000 / 60 / 60 / 24 / 7); // hours
        System.out.println((a.getTime() - b.getTime()) / 1000 / 60 / 60 / 24 / 7 / 52.1428); // hours
        
        SimpleDateFormat fmt1 = new SimpleDateFormat("M/d/yy");
        Date newYears = fmt1.parse("1/1/2013"); // makes a Date object representing 1/1/2013

        System.out.println(newYears);
        System.out.println(newYears.getTime());
        
        
    }
}
