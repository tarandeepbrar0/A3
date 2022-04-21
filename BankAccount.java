/********************************************************************
 * Programmer:	Tarandep 
 * Class:  CS30S
 *
 * Assignment: Assignment 3
 *
 * Description: BankAccount class, this is the super class 
 ***********************************************************************/

// import libraries as needed here

public class BankAccount{
    //*** Class Variables ***
    public static int nextID = 1000;         // static int for next id
    //*** Instance Variables ***
    private int id;       //variable for id
    protected double balance = 0.0; 
    protected  String firstName; 
    protected String lastName;
    //*** Constructors ***
    public BankAccount(){
       id = nextID++; 
       firstName = "unknown";  
       lastName = "unknown"; 
       balance = 0.0; 
    }// end no-arg constrcutor 
    
    public BankAccount(String fn, String ln, double b){
        id = nextID++; 
        this.firstName = fn; 
        this.lastName = ln; 
        this.balance = b; 
    }// end full-arg constructor 
      
    //*** Getters ***
    public int getID(){
        return id;
    }// end getID
    
    public String getFirstName(){
        return firstName; 
    }// end getFirstName 
    
    public String getLastName(){
        return lastName; 
    }// end getLastName
    
    public double getBalance(){
        return balance; 
    }// end getBalance
    
    //*** Setters ***
    public void setFirstName(String fn){
        firstName = fn;
    } // end setFirstName
    
    public void setLastName(String ln){
        lastName = ln;
    } // end setLastName
    
    public void setBalance(double b){
        balance = b;
    } // end setbalance 
    
    //**** Other Methods ****
    public String getInfo(){
        String st = "Name: " + firstName + ", " + "Last Name: " + lastName + ", " + "ID: " + id + ", " + balance; 
        return st; 
    }// end getInfo 
    
    public void Deposit(double dp){
        this.balance += dp; 
    }// end Deposit 
    
    @Override
    public String toString(){
       return "Name: " + firstName + ", " + "Last Name: " + lastName + ", " + "ID: " + id; 
    }// end toString 
    
    
} // end of public class
