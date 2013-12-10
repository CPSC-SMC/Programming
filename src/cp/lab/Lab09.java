/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

import edu.saintmarys.google.Geocoding;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>Lab 09: GUI Mashups -- Geocoding and Twitter</p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>Make a GUI program which will allow the user to enter her address and 
 * obtain information about her address in response.</p>
 * 
 * <ol><li>Review code from class.<br/>
 * https://github.com/CPSC-SMC/Programming/tree/master/src/cp/term</li>
 * 
 * <li>Create a new project. Copy this code over the Lab09.java file. THE 
 * Lab09.java file is only for instructions.</li>
 * 
 * <li>Add a new JFrame Form... to your project.</li>
 * 
 * <li>For this lab, we will use the Google Geocoding webservice. Open the class 
 * documentation file (Yes, it is quite sparse.) 
 * http://sites.saintmarys.edu/~sbroad/javadoc/edu/saintmarys/google/Geocoding.html</li>
 * 
 * <li>Design your JFrame. You will at least need a JLabel, a JTextField, and a 
 * JButton. Probably you will also need a JTextArea or something of that nature.</li>
 * 
 * <li>Create an event handling method for clicking the JButton. Make the event
 * handler geocode the address and then display information about the location
 * and the weather at that location in the JTextArea or whereever. What 
 * information do you want to find out about the address? </li><ol type = "a">
 * 
 * <li>You will need to get the information that the user entered out of one 
 * of your components.</li>
 * 
 * <li>You will need to create a Geocoding object.</li>
 * 
 * <li>You will need to use information from the Geocoding object to obtain info
 * from the NationalWeatherService web service.</li>
 * 
 * <li>You will update the program window with this info.</li></ol>
 * 
 * <li>Submit your project.</li></ol>
 * 
 * @author sbroad
 */
public class Lab09 {
    
    /**
     * This method is an example of how you might begin to handle the JButton
     * click event.
     * @param evt the button click evt
     */
    public void OKButtonActionPerformed(ActionEvent evt) {
        try {
            String location = "The White House"; // you'd get this from a GUI component
            Geocoding geo = new Geocoding(location);
            String zip = geo.getLocations().get(0).getPostalCode();
            System.out.println(zip); // you would use the zip to get weather
        } catch (IOException ex) {
            Logger.getLogger(Lab09.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
