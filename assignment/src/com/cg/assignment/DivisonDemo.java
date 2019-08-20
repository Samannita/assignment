package com.cg.assignment;

import java.util.Scanner;


public class DivisonDemo {
	public double divison(double numer,int denom) throws InavlidDenominatorException {
		double result=1;
		double temp;
		if(numer<denom) {
			result=denom/numer;
		System.out.println("result:"+result);
			
		}
		else
		{	
			try {
				if(denom==0)
					throw new InavlidDenominatorException();
				else
				 result= numer/denom;
				System.out.println("Result is:" +result);
			}		
			catch(InavlidDenominatorException e) {
				System.out.println("Cant devide by zero");
			}
		}
		return result;
		
	}

	public static void main(String[] args) throws InavlidDenominatorException {
		// TODO Auto-generated method stub
		double numerator;
		int denominator;
		double result=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numerator:");
		numerator=scan.nextInt();
		System.out.println("Enter denominator:");
		denominator=scan.nextInt();
		DivisonDemo obj = new DivisonDemo();
		obj.divison(numerator, denominator);
		
		
		
		
		
	}

}
