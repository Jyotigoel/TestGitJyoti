package program;

public class StringReverse {
		private static String hello = "Hello World";

		public static void main(String[] args) 
		{
			System.out.println(recursiveMethod(hello)); ;
		}
		
		/*public static String reverseString(String s) {
		char c[] = s.toCharArray();
		int i = 0, j = c.length - 1;
		while (i < j) {
		char tmp = c[i];
		c[i] = c[j];
		c[j] = tmp;
		i++;
		j--;
		}
		return new String(c);
		}*/	
		/*public static void reverseStringAnother(String s){
			char c[] = s.toCharArray();
			for(int i =c.length-1; i>=0;i--)
			{
				System.out.println(c[i]);
			}
			String b = new String(c);
			System.out.println(b);
			
				
		}*/
		
		public static String recursiveMethod(String str)
		{
			if((null == str) || (str.length()<=1))
			{
				return str;
			}
			return recursiveMethod(str.substring(1))+(str.charAt(0));
		}
}
