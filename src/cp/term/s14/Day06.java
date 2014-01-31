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
public class Day06 {
    public static void main(String [] args) {
                // Date and SimpleDateFormat
        // http://docs.oracle.com/javase/6/docs/api/java/util/Date.html
        // http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
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
        
        
        // Create an Account using our Account class
        
    }
}
