package program;

import java.util.Scanner;

public class ReverseAddPalindrome {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ënter Number:" );
		int inputNumber = sc.nextInt();
		
		reverseAndAdd(inputNumber);
		
				
	}
	static void reverseAndAdd(int number)
	{
		if(checkPalindrome(number))
		{
			System.out.println("Given Number is already a palindrome");
		}
		else
		{
			while(!checkPalindrome(number))
			{
				int reverse =  reverseNumber(number);
				int sum = reverse + number;
				System.out.println(number+" + "+reverse+" = "+sum);
                
                number = sum;
			}
			
		}
	}
	
	static boolean checkPalindrome(int number)
	{
		int reverse = reverseNumber(number);
		if (number == reverse)
		{
			System.out.println("This Number is a palindrome");
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	static int reverseNumber(int number)
	{
		int reverse = 0;
		int rem = 0 ;
		while(number !=0)
		{
			rem = number%10;
			reverse = (reverse*10)+rem;
			number = number/10;
		}
		return reverse;
	}

}
