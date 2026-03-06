package com.NumberProgram_2;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
	Scanner ch=new Scanner(System.in);
	System.out.println("enter the num 1");
	int num1=ch.nextInt();
	
	System.out.println("enter the num 2");
	int num2=ch.nextInt();
	int max=num1>num2?num1:num2;
	
	 for(int i=max; ;i++)
	 {  
		 
		 if((i%num1==0)&&(i%num2==0))
		 {
			 System.out.println("the LCM of the two numbwr is : "+i);
			 break;
		 }
		 
	 }
}
}
