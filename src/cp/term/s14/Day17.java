/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;


/**
 *
 * @author sbroad
 */
public class Day17 {
    public static void main(String [] args) {
        
        // Create a fruit
        Fruit f = new Fruit("Apple", "", 1.29, 3);
        System.out.println(f);
        
        f.eat(0.5);
        System.out.printf("sold some for %.2f\n", f.sell(0.5));
        
        System.out.println(f);
        
        
    }
}

class Fruit {
    
    // encapsulation = hiding data + publishing methods
    protected String name; 
    protected String variety;
    protected double price;
    protected double weight;

    public Fruit(String name, String variety, double price, double weight) {
        this.name = name;
        this.variety = variety;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getVariety() {
        return variety;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String eat(double amt) {
        weight -= amt;
        return "";
    }
    
    public double sell(double amt) {
        weight -= amt;
        return amt * price;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s, %.1f lbs at $%.2f per lb", variety, name, weight, price);
    }
    
}

