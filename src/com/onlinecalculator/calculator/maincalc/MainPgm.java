package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
    int type;
    type=disp();
	    
    if(type==1)
        {
    	BasicCalc c=new BasicCalc();
		c.menu();
		c.userInputs();
		c.performOperation();
        }
        if(type==2)
        {
        	 ScientificCalc calc=new ScientificCalc();
    		 calc.menu();
    		 calc.userInputs();
    		calc.performOperation();
    		 
       	}
        	
        	if(type==3)
        	{
        		StatisticCalc calc1=new StatisticCalc();
       		 calc1.menu();
       		 calc1.userInputs();
       		calc1.performOperation();
        	}
 
    }
        
   
    
    	 static int disp()
    	 {
    		 int ch;
    		 Scanner sc=new Scanner(System.in);
    		 System.out.println("*************CALCULATOR*************");
    		 System.out.println("***********1.BASIC CALCULATOR*********");
    		 System.out.println("***********2.SCIENTIFIC CALCULATOR*********");
    		 System.out.println("************3.STATISTIC CALCULCATOR**********");
    		 System.out.println("enter your choice");
    		 ch=sc.nextInt();
    		 return(ch);
    	 }
    }
