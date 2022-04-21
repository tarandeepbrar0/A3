import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;

/** ***************************************************
 *  Name:           Tarandeep 
 *  Class:          CS30S
 * 
 *  Assignment:     
 * 
 *  Description:    Place a short description of your program here
 * 
 *************************************************************/

public class BankAccountDriver{

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String closemessage = "";       // output closing message 
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
        ArrayList<BankAccount> list = new ArrayList<>(); 
        ProgramInfo programInfo = new ProgramInfo("Assignment 3");
    // ***** objects *****
    
        //Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

    // ***** print banners *****
    banner = programInfo.getBanner(); 
    
    System.out.println(banner);

        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window


    // ***** Main Processing *****
    BankAccount b1 = new BankAccount(); 
    BankAccount b2 = new BankAccount("Josh", "Buck", 2000); 
    System.out.println("Printing Client Info"); 
    System.out.println(b1.getInfo()); 
    System.out.println(b2.getInfo());
    
    // testing the Savings class 
    Savings s = new Savings("Bob", "Heart", 23000);
    Savings s1 = new Savings("Johnny", "William", 1900);
    System.out.println(s.getInfo());
    System.out.println(s1.getInfo());
    
    // testing the Cheqing class 
    Cheqing c = new Cheqing("Jabbs", "Bat", 99800);
    Cheqing c1 = new Cheqing("William", "Burn", 990); 
    System.out.println(c.getInfo()); 
    System.out.println(c1.getInfo());
    
    // add some banck accounts to the list 
    list.add(b1); 
    list.add(b2); 
    list.add(s); 
    list.add(s1); 
    list.add(c); 
    list.add(c1); 
    
    System.out.println(nl + "-------------------------------"); 
    // savings account using the withdraw method 
    Savings save = (Savings)list.get(2); 
    save.Withdraw(500.0);
    System.out.println("Withdrawing $500 from savings account"); 
    System.out.println(s.getInfo()); 
    for(BankAccount a: list){


        if(a instanceof Savings){
            s.ApplyInterest();
            System.out.println("New Balance " + s.getBalance()); 
            System.out.println(s.toString()); 
            System.out.println(s1.getBalance()); 
        }// end is savings

    }// end foreach 
    
    //savings account using the withdraw method when current balance is less then withdraw amount
    System.out.println(nl + "Withdrawing $30000 from savings account: Balance is less then $30000");
    Savings saves = (Savings)list.get(3);
    saves.Withdraw(30000.0);
    System.out.println(s1.getInfo() + nl);
    
    // cheqing account using the cheq method 
    Cheqing cheque = (Cheqing)list.get(4); 
    cheque.Cheque(700.0); 
    System.out.println("Withdrawing $700 from cheqing account");
    System.out.println(c.getInfo() + nl); 
    
    // cheqing account getting a negative balance 
    Cheqing cheque1 = (Cheqing)list.get(5); 
    cheque1.Cheque(1500.0); 
    System.out.println("Withdrawing $1500 from cheqing account: Negative balance");
    System.out.println(c1.getInfo() + nl); 
    
    // depositing money into the bank account
    System.out.println("Depositing money into bank account");
    BankAccount bank = (BankAccount)list.get(1); 
    bank.Deposit(265.0); 
    System.out.println(b2.getInfo() + nl);
    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
        closemessage = programInfo.getclosingmessage();
        System.out.println(closemessage);
        //System.out.println();
        //System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
