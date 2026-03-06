package com.NumberProgram_2;

import java.util.Scanner;

public class Spy_Number {
   public static void main(String[] args) {
	Scanner ch=new Scanner(System.in);
	
	System.out.println("Enter The  Number");
	int num=ch.nextInt();
	int temp=num;
	int sum=0;
	int mul=1;
	
	while(num!=0)
	{
		int rem=num%10;
		sum=sum+rem;
		mul=mul*rem;
		
		
		num=num/10;
	}
	if(mul==sum)
	{
		System.out.println("The given number is the spy number");
	}
	else {
		System.out.println("The given number is  not the spy number");
	}
	
}
}
