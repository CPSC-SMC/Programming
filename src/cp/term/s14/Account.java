/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cp.term.s14;

/**
 * This class represents an account. The account has an account number, an
 * account name, and an account balance. The account should allow for deposits
 * and withdrawals.
 * 
 * @author sbroad
 */
public class Account {

    // attributes of the class
    private long acctNumber; // account number
    private String acctName; // account name
    private float balance; // account balance
    
    // Constructor
    public Account(long Number, String Name, float Balance) {
        acctNumber = Number;
        acctName = Name;
        balance = Balance;
    }
    
    // Accessor methods: number, name, balance
    public long getAccountNumber() {
        return acctNumber;
    }
    
    
    // Mutator methods: setName, deposit, withdraw
    public float withdraw(float amount) {
        balance = balance - amount;
        return balance;
    }
    
    
    // toString method
    @Override
    public String toString() {
        return String.format("%d: %s Balance: $%.2f", acctNumber, acctName, balance);
    }
    
}
