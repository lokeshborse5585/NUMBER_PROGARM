package com.NumberProgram_2;

import java.util.Scanner;

public class ReveseTheGivenNumber {
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ch.nextInt();
		int res=0;
		while(num!=0)
		{
			int rem=num%10;
			  res=res*10+rem;
			num/=10;
		}
		System.out.println("The revese of the given number is :"+res);
	}

}
