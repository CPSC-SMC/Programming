/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.lib;

/**
 *
 * @author sbroad
 */
public class Weather {
    // 1. Attributes
    private int temp;
    private int high;
    private int low;
    private String conditions;
    private String location;
    
    // 2. Constructor
    // for each attribute, add a parameter
    public Weather(int Temp, int High, int Low, 
            String Conditions, String Location)
    {
        temp = Temp;
        high = High;
        low = Low;
        conditions = Conditions;
        location = Location;
    }

    public Weather(int Current, int High, int Low) {
        temp = Current;
        high = High;
        low = Low;
        conditions = "";
        location = "";
    }
    
    // 3. Accessor methods
    public float getTemp()
    {
        return temp;
    }
    
    public float getHigh()
    {
        return high;
    }
    
    public float getLow()
    {
        return low;
    }
    
    // 4. toString Method
    public String toString()
    {
        String report = "";
        
        report += "Temp: " + temp + "\n";
        report += "High: " + high + "\n";
        report += "Low: " + low + "\n";
        report += "Conditions: " + conditions + "\n";
        report += "Location: " + location + "\n";
        
        return report;
    }
    
    // 5. Other methods as needed
    // none today
}
