package com.NumberProgram_2;

import java.util.Scanner;

public class PrimeNumberInGivenRange {
	public static void main(String[] args) {
		
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter  the starting number");
		int start=ch.nextInt();
		System.out.println("Enter  the Last number");
		int end=ch.nextInt();
		
		for(int i=start;i<=end;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{count++;
					
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}

}
