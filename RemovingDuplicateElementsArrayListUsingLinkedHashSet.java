package program;

import java.util.ArrayList;
import java.util.LinkedHashSet;;

public class RemovingDuplicateElementsArrayListUsingLinkedHashSet {
	public static void main(String[] args)
	{
	
			ArrayList<String> listWithDuplicateElements  = new ArrayList<String>();
			listWithDuplicateElements.add("JAVA");
			 
	        listWithDuplicateElements.add("J2EE");
	 
	        listWithDuplicateElements.add("JSP");
	 
	        listWithDuplicateElements.add("SERVLETS");
	 
	        listWithDuplicateElements.add("JAVA");
	 
	        listWithDuplicateElements.add("STRUTS");
	 
	        listWithDuplicateElements.add("JSP");
	        System.out.print("ArrayList With Duplicate Elements :");
	        System.out.println(listWithDuplicateElements);
	        
	        LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
	        
	        ArrayList<String> listWithoutDuplicateElements =  new ArrayList<String>(set);
	        System.out.print("ArrayList After Removing Duplicate Elements :");
	        
	        System.out.println(listWithoutDuplicateElements);
	        	
	}


}
