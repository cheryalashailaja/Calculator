package com.onlinecalculator.calculator.calctypes;
import java.util.*;
public class factorial {

	public static void main(String args[])
	{
		int n, i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n number");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
		fact=fact*i;
		
		}
		System.out.println("factorial of given number"+fact);
		
	}
}
