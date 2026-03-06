package com.NumberProgram_2;

import java.util.Scanner;

public class Factorial_Number {
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ch.nextInt();
		System.out.println("Tha Factorial of the given number is : "+fact(num));
		
		
	}
	public static int fact(int num)
	{
		if(num==0)
		{
			return 1;
		}
		return num*fact(num-1);
	}

}
