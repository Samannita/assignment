package com.cg.lambda.assignment;

import java.util.Scanner;
import java.lang.Math;
public class PowerDemo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st num:");
		double num1= scan.nextDouble();
		System.out.println("Enter the 2nd num:");
		double num2= scan.nextDouble();
		PowerProgram obj = (x,y)->(Math.pow(x,y));
		System.out.println(+num1 +" to the power "+ +num2 + " is:" +" "+obj.power(num1,num2 ));
		

	}

}
