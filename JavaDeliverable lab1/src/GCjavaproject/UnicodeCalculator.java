package GCjavaproject;

import java.util.Scanner;

public class UnicodeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
		int absoluteValue;
		int sum = 0;
		int sum1 = 0;
		int sum3;

		
	    Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter string1 : ");
		String string1 = scnr.nextLine();
		
		System.out.print("Enter string2 : ");
		String string2 = scnr.nextLine();
		System.out.println();

	    for(int i= 0; i < string1.length(); i++)
		{
		sum3 = string1.charAt(i);
		System.out.println(string1.charAt(i)+" : "+ sum3);
		sum += sum3;                                      // If you want to increment or decrement a variable by an
		                                                  //amount other than 1, you can use += and -=. For example, i += 2 increments i by 2.
		}
		System.out.println();
		
		for(int i= 0; i < string2.length(); i++)
		{
		sum3 = string2.charAt(i);
		System.out.println(string2.charAt(i)+" : " + sum3);
		sum1 += sum3;
		}
		System.out.println();
		
		 absoluteValue = Math.abs(sum - sum1) ;
		 System.out.println("Difference (as Absolute value) : " + absoluteValue);

	}

}
