package program;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
	    list.add("SERVLETS");
	    list.add("JDBC");
	    System.out.println(list);
	    String s= "JSP";
	    
	    boolean contains = list.contains(s);
	    if(contains)
        {
            //If list contains "JSP", printing it's index
 
            System.out.println(list.indexOf(s));
        }
	    s = "J2EE";
	    
        //Checking whether list contains "STRUTS"
 
        contains = list.contains("J2EE");
        
        if(contains)
        {
            //If list contains "STRUTS", printing it's index
 
            System.out.println(list.indexOf(s));
        }
	}

}
