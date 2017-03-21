package program;

import java.util.HashMap;

public class characterCount {
	public static void main(String[] args)
	{
		characterCount("abcabcdef");
	}
     static void characterCount(String input)
     {
    	 HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
    	 char[] strArray = input.toCharArray();
    	 for(char c : strArray)
    	 {
    		 if(charCountMap.containsKey(c))
    		 {
    			 charCountMap.put(c, charCountMap.get(c)+1);
    		 }
    		 else
    			 charCountMap.put(c,1);
    	 }
    	System.out.println(charCountMap); 
     }
     
}
