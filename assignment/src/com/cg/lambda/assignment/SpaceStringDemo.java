package com.cg.lambda.assignment;

import java.util.Scanner;

public class SpaceStringDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = scan.next();
		SpaceString obj = (message)->{
			for(int index=0;index<string.length();index++) {
				 sb.append(string.charAt(index));
			}
			return message;
		};
		System.out.println("Output:" +string);

	}

}
