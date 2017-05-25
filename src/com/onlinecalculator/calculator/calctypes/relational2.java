package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class relational2 
{
	public static void main(String args[])
	{
		
	int a,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter first number");
	a=s.nextInt();
	System.out.println("enter second number");
	b=s.nextInt();
	System.out.println("a is equal b="+(a==b));
	System.out.println("a is notequal b="+(a!=b));
	System.out.println("a is greater b="+(a>b));
	System.out.println("a is lessthen b="+(a<b));
	System.out.println("a is greaterthan equal b="+(a>=b));
	System.out.println("a is lessthan equal b="+(a<=b));
	
}
	
}


