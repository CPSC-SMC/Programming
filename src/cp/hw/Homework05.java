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
        

        // TODO Create 100 Animal objects. (Use the Animal class below.)
        // Use a while or for loop. For each of
        // them, make the animal forage(), then eat(1), sleep(8).
        // Then forage() again and drink(1), sleep(8).
        // Count how many animals survive. The animal survives if thirst is less
        // than 2 and hunger is less than 4. Print a message to the console 
        // indicating how many animals survived.
        int lived = 0;
        for (int i = 0; i < 100; i++) {
            Animal a = new Animal("Brittany");
            int food = a.forage();
            a.eat(food);
            a.sleep(8);
            int water = a.forage();
            a.drink(water);
            a.sleep(8);
            if (a.getHunger() < 4 && a.getThirst() < 2) {
                lived ++;
            }
        }
        System.out.printf("Of 100 animals, only %d survived.\n", lived);

    }
    
}

/**
 * A list of majors. Feel free to add yours to the list if it is not already
 * there.
 */
enum Major {Bio, Chem, Business, Math, Psych, Soc, English, 
       Art, Nursing}

/**
 * A random student. The random student has a randomly assigned major and
 * GPA.
 */
class RandomStudent {
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
 * A simulation of an animal. Animals in general have a very limited 
 * set of characteristics. They eat, drink, sleep, and forage. They have a name,
 * hunger, thirst, and energy. Eating and drinking decrease hunger and thirst, 
 * respectively. Eating and sleeping increase energy. Sleeping increases hunger
 * and thirst. Foraging increases hunger and thirst and decreases energy.
 * 
 * @author sbroad
 */
class Animal {
    private String name;
    private int hunger;
    private int thirst;
    private double energy;

    /**
     * Create an Animal with a specific name. The hunger, thirst and energy levels
     * begin at 0, 0 and 1 respectively.
     * @param name the animal's name
     */
    public Animal(String Name) {
        name = Name;
        hunger = 0;
        thirst = 0;
        energy = 1;
    }
    
    /**
     * Create an Animal whose attributes are all initialized.
     * @param name the animal's name
     * @param hunger the animal's hunger level
     * @param thirst the animal's thirst level
     * @param energy the animal's energy level
     */
    public Animal(String Name, int Hunger, int Thirst, double Energy) {
        name = Name;
        hunger = Hunger;
        thirst = Thirst;
        energy = Energy;
    }

    /**
     * Obtain the name of the Animal
     * @return the animal's name
     */
    public String getName() {
        return name;
    }

    /**
     * Obtain the animal's hunger level.
     * @return the animal's hunger
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Obtain the animal's thirst level.
     * @return the animal's thirst
     */
    public int getThirst() {
        return thirst;
    }

    /**
     * Obtain the animal's energy level.
     * @return the animal's energy
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * Eating decreases hunger and increases energy somewhat.
     * @param amount the amount of food eaten
     */
    public void eat(int amount) {
        hunger -= amount;
        energy += 0.5*amount;
    }
    
    /**
     * Drinking decreases thirst.
     * @param amount the amount of water drunk
     */
    public void drink(int amount) {
        thirst -= amount;
    }
    
    /**
     * Sleeping increases energy, hunger and thirst
     * @param time
     */
    public void sleep(double time) {
        energy += time;
        hunger += (int) 0.25*time;
        thirst += (int) 0.25*time;
    }
    
    /**
     * It is hard to tell how long foraging will take. However, foraging is
     * necessary to find food and water. It increases hunger and thirst and 
     * decreases energy.
     * @return the amount of food or water found
     */
    public int forage() {
        Random gen = new Random();
        double time = gen.nextDouble()*8;
        energy -= 0.5*time;
        hunger += 0.5*time;
        thirst += 0.3*time;
        return gen.nextInt(3);
    }
    
    /**
     * Convert the Animal into a string to allow it to be printed.
     * @return A string representing the Animal
     */
    @Override
    public String toString() {
        return String.format("Name: %s, Energy: %.2f, Hunger: %d, Thirst %d", 
                getName(), getEnergy(), getHunger(), getThirst());
    }
}
