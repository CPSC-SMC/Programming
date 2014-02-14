/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.hw;

/**
 * <p>Homework 3: Classes, methods, instances, objects.</p>
 * <p>CPSC 207: Computer Programming</p>
 * 
 * <p>Complete each of the methods in Homework03 below. Each method describes what
 * it is supposed to do. Use the <code>return</code> statement to return the
 * required information.</p>
 * 
 * <p>Create a project called Homework03. Copy this file over the contents of
 * Homework03.java. The main method does not need to be modified. Most of your
 * work will be done in the <code>class Student</code> declaration below.</p>
 * 
 * <p>Submit your project in the usual way. See Lab01 for details.</p>
 * 
 * @author sbroad
 */
public class Homework03 {
    
    /**
     * A test program for Homework 3 exercises. Do not modify.
     * @param args command line arguments
     */
    public static void main(String [] args) {
        
        // create a new student object
        Student s = new Student("Josie", 890101202);
        
        // make a note of grades the student has received
        s.addCourse(3, 3); // B in a 3 credit class
        s.addCourse(4, 3.333); // B+ in a 4 credit class
        s.addCourse(3, 4); // A in a 3 credit course
        s.addCourse(3, 2.333); // C+ in a 3 credit course
        s.addCourse(4, 3.667); // A- in a 4 credit course
        
        // print information about the student
        System.out.printf("%s has id %d.\n", s.getName(), s.getID());
        System.out.printf("%s has %d credits.\n", s.getName(), s.getCredits());
        System.out.printf("%s has %.4f quality points.\n", s.getName(), s.getQualityPoints());
        System.out.printf("%s has %.2f GPA.\n", s.getName(), s.gpa());

        // print the student
        System.out.println(s);
        
    }
}

/**
 * The Student class represents a student. Each student has a name, an ID, 
 * a number of credits passed, and a number of quality points. Students can 
 * take a class and calculate a gpa. You need to:
 * 
 * 1. Declare instance variables for name, id, credits and quality points.
 * 2. Implement a constructor that accepts a name and id as parameters,
 *  and initializes the credits and quality points to 0;
 * 3. Implement accessor methods for each variable.
 * 4. Implement a method called gpa() to compute the gpa for the student.
 *          GPA = quality points / credits earned.
 * 5. Implement a method called addCourse(int credits, double grade) to add 
 *    a course to a student's "transcript." This method should accept a 
 *    number of credits and a grade (a possibly fractional number from 0 to
 *    4. This method adds to the student's credits and to the student's
 *    quality points.
 * 6. Implement the toString method, to make Student objects printable.
 * 
 */
class Student {

    // TODO: declare appropriate attributes i.e., instance variables
    private String n;
    private long i;
    private int c;
    private double qp;
    
    /**
     *
     * @param name
     * @param ID
     */
    public Student(String name, long ID) {
        n = name;
        i = ID;
        c = 0;
        qp = 0;
    }

    /**
     *
     * @return
     */
    public String getName() {
        throw new cp.HomeworkException();
    }

    /**
     *
     * @return
     */
    public long getID() {
        throw new cp.HomeworkException();
    }

    /**
     *
     * @return
     */
    public int getCredits() {
        throw new cp.HomeworkException();
    }

    /**
     *
     * @return
     */
    public double getQualityPoints() {
        throw new cp.HomeworkException();
    }

    /**
     *
     * @return
     */
    public double gpa() {
        return qp / c;
    }

    /**
     *
     * @param credits
     * @param grade
     */
    public void addCourse(int credits, double grade) {
        // c = c + credits;
        c += credits;
        qp += credits * grade;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        throw new cp.HomeworkException();
    }
}
