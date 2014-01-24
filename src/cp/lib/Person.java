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
    
    /**
     * Uses the given first and last name to create a Person object.
     * @param FirstName
     * @param LastName
     */
    public Person(String FirstName, String LastName)
    {
        firstName = FirstName;
        lastName = LastName;
    }
    
    /**
     * Retrieve the First Name of the person.
     * @return
     */
    public String getFirst() { return firstName; }

    /**
     * Retrieve the Last Name of the person.
     * @return
     */
    public String getLast() { return lastName; }
    
    @Override
    public boolean equals(Object other) {
        Person p = (Person) other;
        return (firstName.equalsIgnoreCase(p.firstName) 
                && lastName.equalsIgnoreCase(p.lastName));
    }
    
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
    
    @Override
    public String toString()
    {
        return lastName + ", " + firstName;
    }
}
