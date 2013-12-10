/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

/**
 * CPSC 207: Computer Programming
 * Lab 4: Create your own Weather class
 * 
 * In this lab you will create your own Weather class and make it printable. 
 * Then you will use the National Weather Service web service to obtain weather 
 * data for two zip codes, create the Weather objects for each and then print 
 * it in a short report. The report should include the city, state, current 
 * temp, hi temp and low temp. (Where will you get the city and state?) 
 * 
 * 1. Create a new project called Lab04. Create an additional Java Class file
 * called Weather.java in the lab04 package (see the Die example in section 4.2).
 * 
 * 2. Review the documentation for the NationalWeatherService class. 
 * http://sites.saintmarys.edu/~sbroad/javadoc/edu/saintmarys/NationalWeatherService.html
 * 
 * 3. Copy this file over the contents of Lab04.java.
 * 
 * 4. In Weather.java (see section 4.2)
 *      a. declare appropriate instance variables (choose the type carefully and 
 *      name them well) (see Listing 4.2, 4.4 as examples)
 *      b. declare and implement a constructor with no arguments (the default 
 *      constructor). Initialize the class variables with values that indicate 
 *      that the weather information has not been loaded.(see Section 4.5)
 *      c. declare and implement a constructor that accepts arguments that give 
 *      initial values for each of the instance variables
 *      d. declare and implement appropriate accessor methods (see Section 4.3)
 *      e. declare and implement the public String toString() method. Use the 
 *      String.format method the same way as you did with System.out.printf in 
 *      an earlier lab.
 * 
 * 5. In the main method,
 *      a. prompt and accept user’s first zip code
 *      b. prompt and accept user’s second zip code
 *      c. prompt and accept user’s third zip code
 *      d. obtain weather and city/state info for each of the zip codes 
 *          (one at a time)
 *      e. create a Weather object for each zip code
 *      f. print each Weather object to obtain a report
 * 
 * 6. Test your project.
 *      a. Try several valid inputs. Are the results good?
 *      b. Try entering bad zip codes. What happens?
 * 
 * 7. Select Tools->Analyze javadoc from the menu. The results will appear in 
 * the general area of the Java console. 
 *      a. Select the top checkbox and click the "Fix Selected" button that 
 *      appears below. 
 *      b. Fill in the empty javadoc comment areas in Lab04.java and Weather.java.
 *      c. after each @param, explain what the method parameter does.
 * 
 * 8. Submit your lab project in the usual way.
 * 
 * @author sbroad
 */
public class Lab04 {

    /**
     *
     * @param args
     */
    public static void main (String [] args) {
        
    }
}
