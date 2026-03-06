package com.NumberProgram_2;

import java.util.Scanner;

public class Natural_Number {
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);	
		System.out.println("Enter the last natural number");
		int num=ch.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
			
		}
	}

}
