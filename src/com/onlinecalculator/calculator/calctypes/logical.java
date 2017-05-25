package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class logical 
{

	public static void main(String args[])
	{
		Boolean a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextBoolean();
		System.out.println("enter second number");
		b=s.nextBoolean();
	    System.out.println("not opertion="+(a&&b));
		System.out.println("left opertion="+(a||b));
		System.out.println("left opertion="+!(a&&b));
		
		
}
}
