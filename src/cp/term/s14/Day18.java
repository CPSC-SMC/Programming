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
        
        Strawberry s = new Strawberry(2.5,2,1);
        System.out.println(s);
        
        s.eat(0.25);
        s.jam(0.5);
        System.out.println(s.getVariety());
        System.out.println(s);
        
        GrannySmith gs = new GrannySmith(1.69, 1);
        FujiApple fuji = new FujiApple(1.99, 2);
        
        Apple [] myApples = {gs, fuji};
        
        for (Apple a : myApples) {
            System.out.println(a);
        }
        
        try {
            System.out.println(myApples[3]);
        }
        catch (Exception ex) {
            System.out.println("Position 3 is not in the array.");
        }
        
        System.out.println("It kept going");
    }
}


class Strawberry extends Fruit {
    
    protected double size;
    
    public Strawberry(double price, double weight, double size) {
        super("Strawberry", "", price, weight);
        this.size = size;
    }
    
    public void jam(double amt) {
        this.weight -= amt;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String getVariety() {
        return "Silly, there are no strawberry varieties";
    }
    
}

class Apple extends Fruit {
    public Apple(String variety, double price, double weight) {
        super("Apple",variety,price,weight);
    }
}

class GrannySmith extends Apple {
    public GrannySmith(double price, double weight) {
        super("Granny Smith", price, weight);
    }
}

class FujiApple extends Apple {
    public FujiApple(double price, double weight) {
        super("Fuji", price, weight);
    }

    @Override
    public String toString() {
        return "Fuji Apples are awesome. It's sad I only have " + this.getWeight() + " pounds.";
    }
    
    
}