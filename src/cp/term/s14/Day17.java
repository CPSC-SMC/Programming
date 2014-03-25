/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

import cp.lib.Animal;

/**
 *
 * @author sbroad
 */
public class Day17 {
    public static void main(String [] args) {
        Animal a;
        
        // Create a lion
        a = new Lion();
        System.out.println(a);
        
        // Create a dog
        a = new Dog();
        System.out.println(a);
        
        // Create a Hound
        a = new HoundDog();
        System.out.println(a);
    }
}

class Lion extends Animal {

    public Lion(int hunger, int thirst, double energy) {
        super("Leo", hunger, thirst, energy);
    }

    public Lion() {
        this(0,0,1);
    }
    
    public String toString () {
        return "I'm a lion! Roooaar! " + super.toString();
    }
}

class Dog extends Animal {
    public Dog(int hunger, int thirst, double energy) {
        super("Bowzer", hunger, thirst, energy);
    }
    
    public Dog() {
        this(0,0,1);
    }
    
    public String toString() {
        return "I'm a dog! Woof! " + super.toString();
    }
}

class HoundDog extends Dog {
    public String toString() {
        return "Howl! " + super.toString();
    }
}