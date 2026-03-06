package com.NumberProgram_2;

import java.util.Scanner;

public class PrimeNumberUsingMetho {
	
	
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=ch.nextInt();
		
		if(primeCheck(num))
		{
			System.out.println("The given number is prime number");
		}
		else {
			System.out.println("The given number is  Not  a prime number");
		}
	}
	
	public static boolean primeCheck(int num)
	{
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		return count==2;
		
	}

}
