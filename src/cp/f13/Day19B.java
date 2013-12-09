/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.f13;

/**
 *
 * @author sbroad
 */
public class Day19B {
    public static void main(String [] args)
    {
        int size = 8;
        for (int x = 0; x < size; x++)
        {
            for (int y = 0; y < size; y++)
            {
                System.out.print("(" + x + ',' + y +"), ");
            }
            System.out.println();
        }
    }
}
