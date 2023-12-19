package day1;

import java.util.Scanner;

/*
 Write a program to check whether a number is a Strong number or not. 
Strong number is a special number whose sum of factorial of digits is 
equal to the original number. For example: 145 is a strong number. 
Since, 1! + 4! + 5! = 145
*/

public class StrongNumber {
//	Method for factorial using recursion
	public static int fact(int n ) {
		if(n==0 || n==1)
		{
			return 1;
		}else
		{
			return n*fact(n-1);
		}
	}
	
//	Method to check number is Strong Number or Not
	public static void isStrongNumber(int n)
	{
		int oldNumber=n; // storing the number in another variable
		int sum=0;
		//logic
		while(n!=0)
		{
			sum=sum+fact(n%10);
			
			n/=10;
		}
		if(sum==oldNumber)
		{
			System.out.println(oldNumber+" is a Strong Number");
		}else
		{
			System.out.println(oldNumber+" is not a Strong Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
//		Calling the isStrongNumber()
		isStrongNumber(n);
		
		sc.close();

	}

}
