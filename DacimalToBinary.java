package com.NumberProgram_2;

import java.util.Scanner;

public class DacimalToBinary {
  public static void main(String[] args) {
	Scanner ch=new Scanner(System.in);
	System.out.println("Enter the number");
	int Dacimal=ch.nextInt();//10
	int binary=0;//1010
	int position=1;
	
	while(Dacimal!=0)
	{
		int last=Dacimal%2;
		binary=binary+position*last;
		position=position*10;
		Dacimal=Dacimal/2;
	}
	
	System.out.println("the Binary of that number is : "+binary);
	
	
}
}
