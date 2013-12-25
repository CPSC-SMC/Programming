/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lib;

import java.util.Random;

/**
 * A simulation of an animal. Animals in general have a very limited 
 * set of characteristics. They eat, drink, sleep, and forage. They have a name,
 * hunger, thirst, and energy. Eating and drinking decrease hunger and thirst, 
 * respectively. Eating and sleeping increase energy. Sleeping increases hunger
 * and thirst. Foraging increases hunger and thirst and decreases energy.
 * 
 * @author sbroad
 */
public class Animal {
    private String name;
    private int hunger;
    private int thirst;
    private double energy;

    /**
     * Create an Animal whose attributes are all initialized.
     * @param name the animal's name
     * @param hunger the animal's hunger level
     * @param thirst the animal's thirst level
     * @param energy the animal's energy level
     */
    public Animal(String name, int hunger, int thirst, double energy) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.energy = energy;
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
