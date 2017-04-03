package program;

import java.util.Arrays;

public class deepToStingExample {
	  public static void main(String[] args)
	  {
		  String[] oneDArray = new String[] {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
		  
	        System.out.println("One Dimensional Array : ");
	 
	        //Printing one dimensional array contents using deepToString() method
	 
	        System.out.println(Arrays.deepToString(oneDArray));
	        
	    	     
	        String[][] twoDArray = new String[][] {
                {"ONE", "TWO", "THREE", "FOUR"},
                {"FIVE", "SIX", "SEVEN"},
                {"EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE"}
            };
            System.out.println("Two Dimensional Array : ");
            
            //Printing two dimensional array contents using deepToString() method
     
            System.out.println(Arrays.deepToString(twoDArray));
	  }
	
}
