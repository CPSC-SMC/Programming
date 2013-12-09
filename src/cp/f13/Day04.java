/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.f13;

/**
 *
 * @author sbroad
 */
public class Day04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "Java";
        String b = "Python";
        int comp;
        comp = a.compareTo(b);
        System.out.println(comp);
        comp = b.compareTo(a);
        System.out.println(comp);
        
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.concat(b));
        System.out.println(b.concat(a));
        System.out.println(a.concat(a));
        System.out.println(a + b);
        
        System.out.println(a.replaceAll("a", "monkey"));
        String sentence = "Maria is unhappy. Maria is sad.";
        System.out.println(sentence.replaceAll("Maria", "Alex"));
        
    }
}
