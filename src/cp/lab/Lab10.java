/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

import edu.saintmarys.google.Directions;
import edu.saintmarys.google.Geocoding;
import edu.saintmarys.google.Geocoding.Location;
import edu.saintmarys.wolfram.Pod;
import edu.saintmarys.wolfram.WolframAlpha;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * <p>Lab 10: Mashup II Directions and Knowledge</p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>Make a GUI program that computes directions from an origin to a 
 * destination. Also provide some kind of information about the origin and 
 * destination using the WolframAlpha web service and optionally other web 
 * services of your choice.</p>
 * 
 * <p>Also begin thinking about how to design your final project.</p>
 * 
 * <p>Set up your package and get your GUI started.</p>
 * 
 * <ol><li>Review the Directions documentation: <br/>
 * http://sites.saintmarys.edu/~sbroad/javadoc/edu/saintmarys/google/Directions.html<br/>
 * The method you want to use is Directions.stepByStep() which produces step by 
 * step directions in HTML format. This information should go into a JEditorPane 
 * component. The JEditorPane component should be on a JScrollPane.
 * 
 * <li>In addition to the directions, your program will use the WolframAlpha web 
 * service to retrieve information about the Destination. Check out 
 * http://sites.saintmarys.edu/~sbroad/javadoc/edu/saintmarys/wolfram/WolframAlpha.html</li>
 * 
 * <li>Draw a picture of what your GUI will look like.</li>
 * 
 * <li>Create a Java Application project. Replace the text in the class file 
 * that it creates with the text in this file.</li>
 * 
 * <li>Add a JFrame form. This is where you will do your work. This file is
 * just for instructions and demonstration of WolframAlpha and Directions.</li>
 * 
 * <li>Layout your GUI.</li>
 * 
 * <li>Create event handling methods for the relevant components.</li>
 * 
 * <li>Implement those methods to get information from Google Directions and 
 * WolframAlpha and display that info in the relevant components.</li>
 * 
 * <li>Draw a picture of a GUI for a possible final project.</li></ol>
 * 
 * For your final project you will choose a GUI program to make and use web 
 * services of your choice to access it. Please consult your instructor for 
 * advice, etc.
 * 
 * Please browse http://sites.saintmarys.edu/~sbroad/javadoc/index.html?overview-summary.html 
 * and follow the links to discover other web services that we have not yet used.
 * 
 * @author sbroad
 */
public class Lab10 {
    public static void main(String [] args) {
        try {
            
            // The locations... you might get this from JTextFields
            String from = "The White House";
            String to = "Saint Mary's College, Notre Dame, IN";
            
            // Geocode these locations
            Geocoding orig = new Geocoding(from);
            Geocoding dest = new Geocoding(to);
            
            // Get the Location data for each location
            Location fromLoc = orig.getLocations().get(0);
            Location toLoc = dest.getLocations().get(0);
            
            // Get directions
            Directions dir = new Directions(fromLoc.toString(), toLoc.toString());
            
            // Display the directions
            System.out.println("Directions");
            System.out.println(dir.stepByStep());
            System.out.println();
            
            // Query WolframAlpha
            String query = "schools near " + toLoc.getCity() + " " 
                                           + toLoc.getState() + " " 
                                           + toLoc.getCountry();
            System.out.println(query);
            WolframAlpha wolf = new WolframAlpha(query);
            
            // It is possible to display individual pods, or all pods as shown
            // below.
            for (Pod p : wolf.getPods()) {
                System.out.println(p.getHtmlBlurb());
                System.out.println(p.getPlaintext());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
