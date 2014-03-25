/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.lab;

/**
 * CPSC 207: Computer Programming
 * Lab 7: Recursion and Palindromes
 * 
 * Recursive methods are methods that call themselves. This type of processing 
 * is very common in mathematics. A sequence of numbers might be defined by 
 * performing some operation on the previous member(s) of the sequence. For 
 * example, 
 * 
 * a(n)=2*a(n-1)
 * 
 * The next value is 2 times the current value. The problem is that one must 
 * eventually know one value of the sequence in order to know any of them. For 
 * example, suppose a(1)=1.5. Then a(2)=3, a(3)=6, etc.
 * 
 * The known value is called the Base Case in computer programming. A recursion 
 * that does not have a base case is called an infinite recursion, because one 
 * keeps going backward forever. 
 * 
 * If you haven’t reached the Base Case yet, you need a Smaller Caller case. 
 * This case is a very similar problem to the original, but the smaller caller 
 * must lead to the Base Case.
 * 
 * For example,
        public static double doubling(int n) {
            if (n == 1) 
            {
		return 1.5;
            }
            else
            {
		return 2*doubling(n-1);
            }
        }
 * The base case is n == 1, and the function returns 1.5. The smaller caller case 
 * is when n > 1. Notice that the smaller caller duplicates the formula described 
 * above.
 * 
 * Copy this method into your Lab7 class (not in your main method).
 *   
 * Print results from the doubling method in your main method. Does it work as 
 * you expected?
 * 
 * Make another method of the same type called public static int factorial(int n).
 * (This is the mathematical function n! = n*(n-1)! and 0! = 1.)
 * 
 * Implement this function. What is the base case and smaller caller?
 * 
 * Print some results from the factorial method in your main method. Try 13! 
 * What goes wrong? How could you fix it?
 * 
 * Make another method of the same type called: 
 * public static boolean palindrome(String word)
 * 
 * To check to see if word is a palindrome, you will compare the first character 
 * of the word to the last character.
 * 
 * If the word has 0 or 1 letters, it is a palindrome, so return true.
 * otherwise if the word’s first (0) and last (word.length() - 1) letters are 
 * different, it isn’t a palindrome, so return false. (Use charAt() to get the 
 * individual letters. Individual letters can be compared with ==.)
 * otherwise, the first and last letters match, so we can forget about them and 
 * focus on the word after removing those letters. check to see if this smaller 
 * word is a palindrome. (Use substring() to get the smaller word.)
 * 
 * In your main method, prompt the user for a word to check as a palindrome. Scan 
 * in the word and check to see if it is a palindrome. Print a message that 
 * indicates whether or not it is.
 * 
 * Before checking to see if the word is a palindrome, make the word lowercase. 
 * Also, replace anything that is not a letter of the alphabet with the empty 
 * string. You can do this by using the .replaceAll("[^A-Za-z]", "") on the string.
 * Try using a few of these strings: http://www.palindromelist.net/ You’ll notice 
 * that sentences can be palindromes. Since the previous step removes spaces, 
 * punctuation and changes all letters to lowercase, we can identify these 
 * palindromes.
 * 
 * @author sbroad
 */
public class Lab07 {

    // Copy doubling method here
    
    
    
    // Factorial method
    public static int factorial(int n) {
        // implement this!!! think back to class...
        throw new cp.LabException();
    }
    
    
    public static boolean palindrome(String word) {
        //implement this!!! read the instructions above
        throw new cp.LabException();
    }
    
    /**
     *
     * @param args
     */
    public static void main (String [] args) {
        // Try printing some results from doubling method, for example doubling(6), doubling(20)
        
        
        // Try printing some factorial results, for example 4!, 7!, 14!
        // check them against wolframalpha.com
        
        
        // Ask the user to enter a word or phrase
        // clean up the word to make it a 
        // test to see if it is a palindrome
        
        
        
        
    }
}
