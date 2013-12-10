/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

/**
 * CPSC 207: Computer Programming<br/>
 * Lab 2: User Input and our first web service<br/><br/>
 * 
 * In this Lab you will use the WebServices.jar library to obtain city and state
 * information about a specific zip code.<br/><br/>
 * 
 * <ol><li> To learn how the web service works, copy the following link into the URL 
 * box in your favorite web browser: http://zip.elevenbasetwo.com/v2/US/46556</li>
 * 
 * <li> Observe that simple, relevant information is displayed in the web browser, 
 * but not in an especially useful format.</li>
 * 
 * <li> Create a Lab02 project in NetBeans. See Lab1 if you need a refresher. 
 * Replace the contents of the Lab02.java file with this file.</li>
 * 
 * <li> Download the files WebServices.jar and json-simple-1.1.1.jar. Copy them to
 * the NetBeansProjects folder in your My Documents folder. Ask if you need help.
 * Look in Blackboard for a link to Java Jar Files.</li>
 * 
 * <li> Add the WebServices.jar file to your project.</li><ol type="a">
 *      <li> Right click on the Libraries section of the Lab2 project in the 
 *      Project viewer in NetBeans (it is in the window on the left side of 
 *      the IDE).</li>
 *      <li> Select “Add JAR/folder…” in the drop down menu.</li>
 *      <li> Find WebServices.jar and add it.</li>
 *      <li> Repeat for json-simple-1.1.1.jar.</li></ol>
 * 
 * <li> Review the documentation for the SimpleZip class:
 * <a href="http://sites.saintmarys.edu/~sbroad/javadoc/edu/saintmarys/SimpleZip.html">SimpleZip documentation</a></li>
 * 
 * <li> Make your main method do the following:</li><ol type="a">
 *      <li> Create a scanner. (see Section 2.6) When red squiggles occur to
 *      indicate that the Scanner is not known, click on the red light bulb and
 *      select to import java.util.Scanner.</li>
 *      <li> Prompt the user for a zip code.</li>
 *      <li> Create a SimpleZip object using the entered zip code.</li>
 *      <li> Print the city and state for the entered zip code.</li>
 *      <li> Repeat steps b-d.</li></ol>
 * 
 * <li> Make sure to include comments to explain your code.</li>
 * 
 * <li> Test your program.</li><ol type="a">
 *      <li> Try your home zip code. What happens?</li>
 *      <li> Try the SMC zip code. What happens?</li>
 *      <li> Try the zip code 46617-1315. What happens?</li>
 *      <li> Try the zip code ABCDE. What happens?</li>
 *      <li> Try the zip code 00000. What happens?</li></ol>
 * 
 * <li> Create your java documentation.</li><ol type="a">
 *      <li> Add javadoc comments for your main method.</li>
 *      <li> Generate your javadoc using Run->Generate javadoc.</li></ol>
 * 
 * <li> Submit your lab program by uploading your Lab02 folder to you assignment
 * folder in Google drive.</li>

 * @author sbroad
 */
public class Lab02 {

    /**
     *
     * @param args
     */
    public static void main(String [] args) {
        // TODO Don't forget to add plenty of comments
    }
    
}
