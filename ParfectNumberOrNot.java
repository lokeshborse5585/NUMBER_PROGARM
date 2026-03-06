package com.NumberProgram_2;
//the sum  if the aal factors  other than those number is equle to this number 
import java.util.Scanner;

public class ParfectNumberOrNot {
  public static void main(String[] args) {
	Scanner ch=new Scanner(System.in);
	System.out.println("enter the number");
	int num=ch.nextInt();
	int sum=0;
	
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum+=i;
		}
	}
	if(num==sum)
	{
		System.out.println("The given number is parfect number");
	}
	else{
		System.out.println("The given number is not  parfect number");
	}
}
}
