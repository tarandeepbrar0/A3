/********************************************************************
 * Programmer:	Tarandep 
 * Class:  CS30S
 *
 * Assignment: Pracitioner example
 *
 * Description: Pracitioner class, this is the super class 
 ***********************************************************************/

// import libraries as needed here

public class Cheqing extends BankAccount{
    //*** Class Variables ***
    
    //*** Instance Variables ***
    final double FEE = 1.50; 
    private double cheque; 
    //*** Constructors ***
    public Cheqing(){
    }// end no-arg constructor 
    
    public Cheqing(String fn, String ln, double b){
        super(fn, ln, b);    
    }// end full arg constructor
  
    // *** Other Methods ***
    public void Cheque(double c){
     if(this.balance > c){
        balance -= c; 
        balance -= FEE;
     } // end if 
     else{
         balance -= c - 15; 

      }// end else
    }// double cheque 

} // end of public class
