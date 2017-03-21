package program;

public class EqualityOfTwoArrays {
	
	public static void main(String[] args)
	{
		int[] arrayOne = {1,2,3,5};
		int[] arrayTwo = {2,1,3,5};
		
		boolean equalsOrNot = true;
		
		if(arrayOne.length == arrayTwo.length)
		{
			for(int i=0 ; i<arrayOne.length ; i++)
			{
				if(arrayOne[i]!=arrayTwo[i])
				{
					equalsOrNot = false;
				}
			}
			
		}
		else
		{
			equalsOrNot = false;
		}
		if(equalsOrNot)
		{
			System.out.println("Array are equals");
		}
		else
        {
            System.out.println("Two Arrays Are Not equal");
        }
		
	}

}
