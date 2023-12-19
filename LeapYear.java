package day1;
/*
Write a program to check leap year using if else. 
How to check whether a given year is a leap year or not. 
[Hint:Take an input of any number. Store it in some variable say year. 
 If a year is exactly divisible by 4 and not divisible by 100, 
 then it is a leap year. Or if a year is exactly divisible
 by 400 then it is a leap year.]
 */

import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0)|| year%400==0)
		{
			System.out.println(year+" is a Leap Year");
		}else
		{
			System.out.println(year+" is not  a Leap Year");
		}
		
		sc.close();
	}

}
