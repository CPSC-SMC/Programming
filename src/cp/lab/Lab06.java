/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

/**
 * CPSC 207: Computer Programming
 * Lab 6: Movies In Theaters and Arrays
 * 
 * This is a two part lab. During the first week, we will focus on loading 
 * Movie data into an array and searching it. During the second week we will 
 * sort the Movie data.
 * 
 * Part 1: Loading the Movie data
 * 1. Open the Census package help files. 
 * http://sites.saintmarys.edu/~sbroad/javadoc/edu/saintmarys/rottentomatoes/package-summary.html
 * 
 * 2. Create a Lab6 project.
 * 
 * 3. Make sure the WebServices.jar and json-simple-1.1.1.jar files are in your 
 * project.
 * 
 * 4. Create a MyMovie class file.
 *      a. Make sure to add it to the lab6 package.
 *      b. Declare and implement appropriate (private) variables for the MyMovie 
 *      class. We are using it to store movie titles, freshness scores, running 
 *      time and critics’ concensus, in addition to whatever else you might be 
 *      interested in.
 *      c. Declare and implement a constructor.
 *      d. Declare and implement a toString method.
 * 
 * 5. In your Lab6.java file:
 *      a. Create an InTheatersMovieRequest object called movies.
 *      b. Declare and create an array of 50 MyMovie objects.
 *      c. Declare a count variable and initialize to zero.
 *      d. The movies in theaters are available in the InTheatersMovieRequest 
 *      object. You need to make a loop like this:
            for (String url : movies.getMovieURLs()) 
            {
                Movie mov = new Movie(url);
                // create MyMovie object and INSERT into your array
                // this is a different object than the one created above
                
            }
 *      e. Prompt the user to enter a movie title.
 *      f. Search for the movie that the user entered. 
 *      g. If found, print the MyMovie object. If not found, print a message 
 *      that indicates that the movie was not found.
 * 
 * 6. Submit your project in the usual way.
 * 
 * Part 2: Sort the movie review data and print the top 5 movies
 * 
 * 1. Download Sorting.java from 
 * https://github.com/CPSC-SMC/Programming/blob/master/src/cp/lib/Sorting.java
 * 
 * 2. Add this file to your Lab06 project, in the lab06 package.
 * 
 * 3. Make MyMovie "Comparable" by implementing the comparable interface. 
 * (We’ll go through this together. Example on p. 509 in your text, Section 10.4, 
 * Listing 10.10.)
 *      a. Sort the movies putting highest score first.
 *      b. If the freshness score is the same, break the tie by comparing the 
 *      movie titles.
 * 
 * 4. Modify your main method to use the sort method to sort the MyMovie data.
 * 
 * 5. Store and print the counter. What does this number mean?
 * 
 * 6. Modify your program to print the top 5 movies.
 * 
 * 7. Submit your program. Because this program is already in your Drive, you
 * may be asked whether or not you want to replace the existing files. Reply yes.
 * 
 * @author sbroad
 */
public class Lab06 {

    /**
     *
     * @param args
     */
    public static void main (String [] args) {
        
    }
}
