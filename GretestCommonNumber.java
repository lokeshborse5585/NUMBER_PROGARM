package com.NumberProgram_2;

import java.util.Scanner;

public class GretestCommonNumber {
	
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		System.out.println("enter the num 1");
	    int num1=ch.nextInt();
	    
	    System.out.println("enter the num 2");
	    int num2=ch.nextInt();
	    
	    int max=1;
	    
	    for(int i=1;i<=num1;i++)
	    {
	    	   if(num1%i==0 && num2%i==0)
	    	   {
	    		   max=i;
	    	   }
	    }
	    
	    System.out.println("The gretest common factor is : "+max);
		
		
	}

}
