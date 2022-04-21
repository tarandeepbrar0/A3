/********************************************************************
 * Programmer:	Tarandep 
 * Class:  CS30S
 *
 * Assignment: Assignment 3
 *
 * Description: BankAccount class, this is the super class 
 ***********************************************************************/

// import libraries as needed here

public class Savings extends BankAccount{
    //*** Class Variables ***
    
    //*** Instance Variables ***
    private final double INTERESTRATE = 0.05; 
    //*** Constructors ***
    public Savings(){
         
    }// end no-arg constructor 
    
    public Savings(String fn, String ln, double b){
        super(fn, ln, b);    
    }// end full arg constructor
    
    // **** Other Methods ****
    public double Withdraw(double wd){
        if(balance > wd){
           this.balance -= wd;  
        }// end if 
        else{
            System.out.println("Access Denied"); 
        }// end else 
        
        return this.balance; 
    }// end Withdraw
    public void ApplyInterest(){
     double ir; 
     ir = this.balance * INTERESTRATE;
        
     this.balance += ir;  
    }// end applyInterest
} // end of public class
