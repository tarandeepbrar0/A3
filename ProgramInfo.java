/********************************************************************
 * Programmer:	Tarandeep 
 * Class:  CS30S
 *
 * Assignment: Program Info 
 *
 * Description: creates a program info object to print banners and closing messages
 *              to console, JOptionPane and output file
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
    private String assignmentName = "";      // variable for assignment name 
    
    //*** Construcors ***
    
    /*****************************************
    * Description: create a new ProgramInfo object with the assignment
    *               property set to appropriate value
    * 
    * Interface:
    * 
    * @param        assignmentName  assignment name and number
    * ****************************************/
    public ProgramInfo(String name){
        this.assignmentName = name;
    } // end initialized constructor

    //*** Getters ***
    
    /*****************************************
    * Description: create and return a string for the program info banner
    * 
    * Interface:
    * 
    * @return bannerOut  string containing the program info banner
    * ****************************************/ 
    public String getBanner(){
        String bannerOut = "";                         // banner variable
        String nl = System.lineSeparator();            // new line seperator 
       
    	bannerOut = "*******************************************" + nl;
    	bannerOut += "Name:		Tarandeep" + nl;
    	bannerOut += "Class:		CS30S" + nl;
    	bannerOut += "Assignment:	" + assignmentName + nl;
    	bannerOut += "*******************************************" + nl + nl; 
        
        return bannerOut;
    } // end getBanner
   
    /*****************************************
    * Description: get closingmessage 
    * 
    * Interface:
    * 
    * @return       Strin: closingmessage strin
    * ****************************************/
    public String getclosingmessage(){
        String CMessage;                               // closing message variable 
        String nl = System.lineSeparator();            // new line seperator 
        
        CMessage = nl + "end of processing"; 
        return CMessage; 
    }// end getclosingmessage    

    
    //*** Setters ***
    
} // end of public class
