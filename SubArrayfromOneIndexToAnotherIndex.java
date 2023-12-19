package day1;
/*
Declare an array with 10 elements. 
Get a sub array from an array between index 2 to 6 
and find out the 2nd highest number from the sub array.
Input: 2 4 5 3 6 7 9 4 5 6
Output:
     Sub array: 5 3 6 7 9
     2nd Highest element: 7
     */
import java.util.*;
public class SubArrayfromOneIndexToAnotherIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Array : ");
		int n=sc.nextInt();
		System.out.println();
		int arr[]=new int[n];
		
		System.out.println("Inserting the values in Array");
		System.out.println("*******************************");

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the element at "+i+ " , arr["+i+"] :");
			arr[i]=sc.nextInt();

		}
		System.out.print("Array is : ");

		System.out.print("[ ");
		for(int e :arr)
		{
			System.out.print(e+" ");
		}
		System.out.print("]");
		
		
		System.out.println();
		System.out.print("Enter the first index for sub string : ");
		int fi=sc.nextInt();
		System.out.println();
		System.out.print("Enter the last index for sub string : ");
		int li=sc.nextInt();
		System.out.println();
		
		
		int subArray[] = new int[li-fi+1];
		for(int i = fi;i<=li;i++)
		{
			subArray[i-fi]=arr[i];
		}
		
		System.out.print("Sub Array is : ");

		System.out.print("[ ");
		for(int e :subArray)
		{
			
			System.out.print(e+" ");
		}
		System.out.print("]");

		sc.close();		
		

	}

}
