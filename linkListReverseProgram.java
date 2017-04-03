package program;

import java.util.Iterator;
import java.util.LinkedList;

public class linkListReverseProgram {
	public static void main ( String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		 
        //Adding elements at the end of the list
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("JDBC");
 
        //Printing the elements of list
 
        System.out.println(list); 
        Iterator<String> it = list.descendingIterator();
        
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}
