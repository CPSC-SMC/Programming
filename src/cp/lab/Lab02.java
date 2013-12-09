/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

/**
 * CPSC 207: Computer Programming
 * Lab 2: User Input and our first web service
 * 
 * In this Lab you will use the WebServices.jar library to obtain city and state
 * information about a specific zip code.
 * 
 * 1. To learn how the web service works, copy the following link into the URL 
 * box in your favorite web browser: http://zip.elevenbasetwo.com/v2/US/46556
 * 
 * 2. Observe that simple, relevant information is displayed in the web browser, 
 * but not in an especially useful format.
 * 
 * 3. Create a Lab02 project in NetBeans. See Lab1 if you need a refresher.
 * 
 * 4. Download the files WebServices.jar and json-simple-1.1.1.jar. Copy them to
 * the NetBeansProjects folder in your My Documents folder. Ask if you need help.
 * Look in Blackboard for a link to Java Jar Files.
 * 
 * 5. Add the WebServices.jar file to your project.
 *      a. Right click on the Libraries section of the Lab2 project in the 
 *      Project viewer in NetBeans (it is in the window on the left side of 
 *      the IDE).
 *      b. Select “Add JAR/folder…” in the drop down menu.
 *      c. Find WebServices.jar and add it.
 *      d. Repeat for json-simple-1.1.1.jar.
 * 
 * 6. Review the documentation for the SimpleZip class:
 * <a href="http://sites.saintmarys.edu/~sbroad/javadoc/edu/saintmarys/SimpleZip.html">SimpleZip documentation</a>
 * 
 * 7. Make your main method do the following:
 *      a. Create a scanner. (see Section 2.6) When red squiggles occur to
 *      indicate that the Scanner is not known, click on the red light bulb and
 *      select to import java.util.Scanner.
 *      b. Prompt the user for a zip code.
 *      c. Create a SimpleZip object using the entered zip code.
 *      d. Print the city and state for the entered zip code.
 *      e. Repeat steps b-d.
 * 
 * 8. Make sure to include comments to explain your code.
 * 
 * 9. Test your program.
 *      a. Try your home zip code. What happens?
 *      b. Try the SMC zip code. What happens?
 *      c. Try the zip code 46617-1315. What happens?
 *      d. Try the zip code ABCDE. What happens?
 *      e. Try the zip code 00000. What happens?
 * 
 * 10. Create your java documentation.
 *      a. Add javadoc comments for your main method.
 *      b. Generate your javadoc using Run->Generate javadoc.
 * 
 * 11. Submit your lab program by uploading your Lab02 folder to you assignment
 * folder in Google drive.

 * @author sbroad
 */
public class Lab02 {

    /**
     *
     * @param args
     */
    public static void main(String [] args) {
        
    }
    
}
