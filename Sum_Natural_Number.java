package com.NumberProgram_2;

import java.util.Scanner;

public class Sum_Natural_Number {
	public static void main(String[] args) {
		
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num=ch.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		
		System.out.println("The sum of the natural number is : "+sum);
	}

}
