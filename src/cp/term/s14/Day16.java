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
public class Day16 {
    

    public static int sum(int n) {
        
        // base case !!!!
        if (n == 0) {
            return 0;
        }
        
        // smaller caller
        else {
            return n + sum(n-1);
        }
    }
    
    public static int fact(int n) {
        
        
        if (n == 0) {
            return 2;
        }
        
        else {
            return n*fact(n-1);
        }

    }
    
    public static int fib(int n) {
        
        if (n < 2) {
            return n;
        }

        else {
            return fib(n-1) + fib(n-2);
        }
    }
    
    public static int compare(String a, String b) {
        return 0;
    }
    
    public static boolean palindrome(String a) {
        return false;
    }
    
    public static void main(String [] args) {
        // try out the sum of first n integers
        System.out.println(sum(5));
        System.out.println(sum(20));
        //System.out.println(sum(-20));
        
        // Test factorial
        System.out.println(fact(5));
        System.out.println(fact(12));
        System.out.println(fact(15));
        
        // Test fib
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(45));
        System.out.println(fib(50));
    }
}
