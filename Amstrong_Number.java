package com.NumberProgram_2;

import java.util.Scanner;

public class Amstrong_Number {
	public static void main(String[] args) {
	   Scanner ch=new Scanner(System.in);
	   System.out.println("Enter The Number");
	   int num=ch.nextInt();//123
	   int temp1=num;
	   int temp2=num;
	   
	   int count1=0;
	   int sum=0;
	   
	   while(temp1!=0)
	   {
		   int rem=temp1%10;
		   count1++;
		   temp1=temp1/10;
	   }
	   
	   while(temp2!=0)
	   {
		   int rem=temp2%10;
		   int power=1;
		   for(int i=1;i<=count1;i++)
		   {
			    power=power*rem;
		   }
		   sum=sum+power;
		   temp2=temp2/10;
	   }
	   
	   if(num==sum)
	   {
		   System.out.println("The Given Number Is the Amstrong number");
	   }
	   else {
		   System.out.println("The Given Number Is  not the Amstrong number");
	   }
	   
	   
	}

}
