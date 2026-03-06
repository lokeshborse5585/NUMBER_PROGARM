package com.NumberProgram_2;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
	Scanner ch=new Scanner(System.in);
	System.out.println("Enter the number");
	
	int num=ch.nextInt();
	int count=0;
	
	for(int i=1;i<=num;i++) {
		if(num%i==0)
		{
		 count++;
		}
	}
	if(count==2)
	{
		System.out.println("the given number is the prime number");
	}
	else {
		System.out.println("the given number is  Not the prime number");
	}
}
}
