package program;

import java.util.HashSet;

public class DuplicateElementUsingHashSet {
	public static void main(String[] args)
	{
		String[] arrElement = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		HashSet<String> set = new HashSet<String>();
		
		for(String arrayElement : arrElement )
		{
			if(!set.add(arrayElement))
			{
				System.out.println("Duplicate Element is : "+arrayElement);
			}
		}
		
	}

}
