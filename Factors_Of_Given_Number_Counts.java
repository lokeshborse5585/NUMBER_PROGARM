package com.NumberProgram_2;

import java.util.Scanner;

public class Factors_Of_Given_Number_Counts {
	 public static void main(String[] args) {
			
		  Scanner ch=new Scanner(System.in);
		  System.out.println("Enter the number");
		  int num=ch.nextInt();
		  int count=0;
		  for(int i=1;i<=num;i++) {
			  if(num%i==0)
			  {   count++;
			
				  
				  
			  }
			  
		  }
		  System.out.println("The count of the  factors of the givn number is : "+count);
	
	 }
}
