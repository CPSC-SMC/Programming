/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.hw;

import java.util.Random;

/**
 * <p>Homework 5: Flow control continued: Loops, Switches</p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>Complete the main method in Homework05 below. Follow the instructions
 * above the main method to implement a program using the RandomStudent class.</p>
 * 
 * <p>Create a project called Homework05. Copy this file over the contents of
 * Homework05.java. The main method does not need to be modified. Remove the lines
 * marked <code>throw new HomeworkException();</code>.</p>
 * 
 * <p>Submit your project in the usual way. See Lab01 for details.</p>
 * 
 * @author sbroad
 */
public class Homework05 {
    
    /**
     * A list of majors. Feel free to add yours to the list if it is not already
     * there.
     */
    public static enum Major {Bio, Chem, Business, Math, Psych, Soc, English, 
           Art, Nursing}
    
    /**
     * A random student. The random student has a randomly assigned major and
     * GPA.
     */
    public static class RandomStudent {
        private Major major;
        private double gpa;
        private Random gen;
        
        /**
         * Randomly assigns a major from the list of majors and a GPA from a
         * normal distribution. Any major that you add to the <code>enum</code>
         * above will be considered.
         */
        public RandomStudent() {
            gen = new Random();
            major = Major.values()[gen.nextInt(Major.values().length)];
            gpa = gen.nextGaussian()*0.5+2.8;
        }

        /**
         * Get the major of the random student.
         * @return the major.
         */
        public Major getMajor() {
            return major;
        }

        /**
         * Get the random student's GPA.
         * @return the random student's gpa
         */
        public double getGpa() {
            return gpa;
        }

        /**
         * Get the school for the random student's major. Use a <code>switch</code> 
         * statement to determine the random student's school. For example, Bio 
         * and Chem are in Science Hall, Math is in Madeleva, etc. 
         * 
         * @return The name of the school for the student's major
         */
        public String getBuilding() {
            // TODO Implement this method
            throw new cp.HomeworkException();
        }
        
        /**
         * Makes the RandomStudent object printable.
         * @return a string which represents the random student
         */
        @Override
        public String toString() {
            return String.format("Major: %s, Building: %s, GPA: %.2f", 
                    major.toString(), this.getBuilding(), gpa);
        }
    }

    /**
     * Students will implement this main program. This main method should do 
     * each of the following. Follow the todo list in main.
     * 
     * @param args
     */
    public static void main(String [] args) {
        // TODO Print all of the possible majors. Use a "for-each" loop 
        // with the list Major.values()
        
        // TODO Declare and create 20 RandomStudent objects. Use a while or for 
        // loop. For each one of them,
        //      a. Print the random student on a line by itself.
        //      b. If the random student's major is in the same building as yours,
        //         print "It's home." on a line.
        //      c. Print the random student's gpa to 6 decimal places.
        
        // TODO Add the Animal class to your project from
        // https://raw2.github.com/CPSC-SMC/Programming/201402/src/cp/lib/Animal.java
        // It will be in a second .java file in your project.

        // TODO Create 100 Animal objects. 
        // Use a while or for loop. For each of
        // them, make the animal forage(), then eat() the amount foraged, sleep(8).
        // Then forage() again and drink() the amount foraged and sleep(8).
        // Count how many animals survive. The animal survives if thirst is less
        // than 2 and hunger is less than 4. Print a message to the console 
        // indicating how many animals survived.

    }
    
}
