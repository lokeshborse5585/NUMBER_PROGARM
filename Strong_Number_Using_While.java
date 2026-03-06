package com.NumberProgram_2;

import java.util.Scanner;

public class Strong_Number_Using_While {
	
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=ch.nextInt();
		int temp=num;
		
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		
		
		if(temp==sum)
		{
			System.out.println("The Given number is the amstrong number");
		}
		else {
			System.out.println("The Given Number Is Not A Amstrong Number ");
		}
	}

}
