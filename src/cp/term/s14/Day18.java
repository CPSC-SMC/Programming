package cp.term.s14;


/**
 *
 * @author sbroad
 */
public class Day18 {
    public static void main(String [] args) {
        
        // Create a fruit
        Fruit f = new Fruit("Apple", "", 1.29, 3);
        System.out.println(f);
        
        f.eat(0.5);
        System.out.printf("sold some for $%.2f\n", f.sell(0.5));
        
        System.out.println(f);
        
        Strawberry s = new Strawberry("", 2.5,2,1);
        System.out.println(s);
        
        s.eat(0.25);
        s.jam(0.5);
        
        System.out.println(s);
    }
}


class Strawberry extends Fruit {
    
    protected double size;
    
    public Strawberry(String variety, double price, double weight, double size) {
        super("Strawberry", variety, price, weight);
        this.size = size;
    }
    
    public void jam(double amt) {
        this.weight -= amt;
    }
    
    
}