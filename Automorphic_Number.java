package com.NumberProgram_2;

import java.util.Scanner;

public class Automorphic_Number {
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=ch.nextInt();
		int temp=num;
		int count=0;
		int squ=num*num;
		
		System.out.println(squ);
		
		int div=1;
		while(temp!=0)
		{
			 int rem=temp%10;
			 div=div*10;
			 temp=temp/10;
			
		}
			
				int rem=squ%div;
				if(rem==num)
				{
					System.out.println("The given number is the Automorphic number");
				
				}
				else {
					System.out.println("The given Number is not a  Automorphic number");
				}
				
				
				
	}

}
