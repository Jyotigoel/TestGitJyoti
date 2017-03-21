package program;

public class RemoveWhiteSpaces {
	public static void main(String[] args)
	{
		String str = "Core java is very important";
		
		char[] c = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0 ; i < c.length ; i++)
		{
			if((c[i] != ' ') && (c[i] != '\t'))
			{
				sb.append(c[i]);
			}
			
		}
		System.out.println(sb);
	}
	

}
