package com.NumberProgram_2;

import java.util.Scanner;

public class Factors_Of_Given_Number {
  public static void main(String[] args) {
	
	  Scanner ch=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num=ch.nextInt();
	  
	  for(int i=1;i<=num;i++) {
		  if(num%i==0)
		  {
			  System.out.println(i);
			  
		  }
		  
	  }
}
}
