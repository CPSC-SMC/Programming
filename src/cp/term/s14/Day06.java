/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.term.s14;

import edu.saintmarys.NationalWeatherService;
import edu.saintmarys.SimpleZip;
import edu.saintmarys.google.Geocoding;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author sbroad
 */
public class Day06 {
    public static void main(String [] args) throws ParseException, MalformedURLException, IOException {
        // Date and SimpleDateFormat
        // http://docs.oracle.com/javase/1.4.2/docs/api/java/util/Date.html
        // http://docs.oracle.com/javase/1.4.2/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat mmddyy = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat mdyy = new SimpleDateFormat("M/d/yy");
        SimpleDateFormat MonthDayYear = new SimpleDateFormat("MMM d, yyyy");
        Date now = new Date();
        
        // Print
        System.out.println(mdyy.format(now));
        System.out.println(mmddyy.format(now));
        System.out.println(MonthDayYear.format(now));
        
        // Parse
        Date dec23 = mdyy.parse("12/23/2013");
        System.out.println(dec23);
        //dec23 = mdyy.parse("23/12/2014");
        //System.out.println(dec23);
        //dec23 = mdyy.parse("23 Dec 2014");
        //System.out.println(dec23);
        //dec23 = mdyy.parse("I'm king of the world");
        //System.out.println(dec23);

        // Creating a Date objects with ticks
        // How many ticks is now?
        System.out.println(now.getTime());
        System.out.println(dec23.getTime());
        Date myDate = new Date((long)1000*60*60*24*(3*365+366+31+28+18));
        System.out.println(myDate);
        
        Date bday = mdyy.parse("03/18/1974");
        System.out.println(bday);
        
        // Creating a SimpleZip object
        SimpleZip simple = new SimpleZip("46617");
        System.out.println(simple.getCityState());
        
        // Creating a NationalWeatherService object
        NationalWeatherService nws = new NationalWeatherService("46617");
        System.out.println(nws.getCurrentTemp());
        NationalWeatherService miami = new NationalWeatherService("33101");
        System.out.println(miami.getCurrentTemp());
        NationalWeatherService minneapolis = new NationalWeatherService("55401");
        System.out.println(minneapolis.getCurrentTemp());
        
    }
}
