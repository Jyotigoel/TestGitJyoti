package program;

public class isBinaryOrNot {
	 public static void main(String[] args)
	    {
	        isBinaryOrNot(101101010);
	    }
	 static void isBinaryOrNot(int number)
	 {
		 int copyOfNumber = number;
		 boolean isBinary = true;
		  while (copyOfNumber > 0)
		  {
			  int temp = copyOfNumber%10;
			  if(temp>1)
			  {
				  isBinary = false;
				  break;
				  
			  }
			  else
			  {
				  copyOfNumber = copyOfNumber/10;
			  }
		  }
		  if (isBinary)
	        {
	            System.out.println(number+" is a binary number");
	        }
	        else
	        {
	            System.out.println(number+" is not a binary number");
	        }
	 }

}
