/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.lib;

/**
 *
 * @author sbroad
 */
public class Person implements Comparable {
    private String firstName;
    private String lastName;
    
    public Person(String FirstName, String LastName)
    {
        firstName = FirstName;
        lastName = LastName;
    }
    
    public String getFirst() { return firstName; }
    public String getLast() { return lastName; }
    
    @Override
    public int compareTo(Object other)
    {
        // convert other to the correct type
        Person p = (Person) other;
        
        // compare the last names
        if (firstName.compareTo(p.firstName) == 0)
        {
            return lastName.compareTo(p.lastName);
        }
        else
        {
            return firstName.compareTo(p.firstName);
        }
    }
    
    public String toString()
    {
        return lastName + ", " + firstName;
    }
}
