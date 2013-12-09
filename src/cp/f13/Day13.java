/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.f13;

import edu.saintmarys.SimpleZip;
import java.util.Scanner;

/**
 *
 * @author sbroad
 */
public class Day13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] girlsNames = {"Rylan", "Kinley", "Kinsey"};
        
        for(String name : girlsNames)
        {
            System.out.println(name);
        }
        
        System.out.println();
        System.out.println(girlsNames[1]);
        
        // an error
        //System.out.println(girlsNames[3]);
        
        SimpleZip [] zips = new SimpleZip[3];
        int count = 0;
        String zip;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("What zip code? ");
        zip = scan.nextLine();
        
        while (zip.length() == 5 && count < zips.length)
        {
            // 1. Create the value
            SimpleZip s = new SimpleZip(zip);
            
            // 2. Store in the array
            zips[count] = s;
            
            // 3. Add one to count
            count++;
            
            System.out.println("What zip code? ");
            zip = scan.nextLine();
        }
        
        //for(SimpleZip s : zips)
        //{
        //   if (s == null) break;
        //   System.out.println(s);
        //}
        
        for(int index = 0; index < count; index++)
        {
            System.out.println(zips[index]);
        }
    }
}
