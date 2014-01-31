/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sbroad
 */
public class Day05 {
    public static void main(String [] args) {
        // Math
        // PI, E
        System.out.println(2*Math.PI);
        System.out.println(Math.E);
        
        // abs, pow, exp, sqrt
        System.out.println(Math.abs(-17.57));
        System.out.println(Math.pow(3,4));
        
        // Formatting
        // System.out.printf(______,____,...)
        //                   format,values separated by commas
        // %s ---> placeholder for String/char
        // %d ---> placeholder for int/long/byte/short
        // %f ---> placeholder for float/double
        // %x.yf ---> specify decimal places for float/double
        System.out.printf("%s (%d)\n", "Ally", 1234567);
        
        // account #, account name, balance
        System.out.printf("Acct #: %d\nName:   %s\nBal:    $%.2f\n", 
                1111, "Spongebob", 2.);
        
        // String.format(______,____,...)
        //               format, values separated by commas
        // Creates a String instead of printing it
        String report = String.format("Acct #: %d\nName:   %s\nBal:    $%.2f\n", 
                1111, "Spongebob", 2.);
        System.out.println(report);
        
        String first= "Steven";
        String last = "Broad";
        System.out.printf("%s, %s\n", last, first);
        System.out.printf("%s, %s\n", first, last);
        // Date and SimpleDateFormat
        // http://docs.oracle.com/javase/1.4.2/docs/api/java/util/Date.html
        // http://docs.oracle.com/javase/1.4.2/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat mmddyy = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat MonthDayYear = new SimpleDateFormat("MMM d, yyyy");
        Date now = new Date();
        
        // Print
        System.out.println(mmddyy.format(now));
        System.out.println(MonthDayYear.format(now));
        
        // Parse
       

        // Creating a Date objects with ticks
        
        
        // Creating a SimpleZip object
        // SimpleZip simple = new SimpleZip("46617");
        
        
        // Creating a NationalWeatherService object
        // NationalWeatherService nws = new NationalWeatherService("46617");
        
        
        
    }
}
