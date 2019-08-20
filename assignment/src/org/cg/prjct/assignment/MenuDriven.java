package org.cg.prjct.assignment;
import java.util.Scanner;
public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		
			
			System.out.println("1.Check palindrome (use Digits)");
			System.out.println("2.Check palindrome (use Aphabates)");
			System.out.println("3.print out all Armstrong numbers between 1 and 500. ");
			System.out.println("4.Printing the pattern");
			System.out.println("5.Exit");
			for(int count=1;count<=3;count++) {
			System.out.println("Enter your choice");
			ch=sc.nextInt();
		
		switch(ch) {
		
		case 1:
			int number,remain,sum=0,temp;
			System.out.println("Enter number");
			number=sc.nextInt();
			temp=number;
			while(number>0) {
				remain=number%10;
				sum=(sum*10)+remain;
				number=number/10;
			}
			if(sum==temp) 
				System.out.println("pallindrome Number");
			else
				System.out.println("Not pallindrome number");
			break;
			
		case 2:
			String s;
			String rev="";
			System.out.println("Enter the string");
			s=sc.next();
			int l=s.length();
			for(int i=l-1;i>=0;i--) {
				rev=rev+s.charAt(i);
			}
			if(s.equals(rev)) {
				System.out.println("String is pallindrome"+rev +" "+s);
			}
			else {
				System.out.println("String is not pallindrome"+" "+rev +" "+s);
			}
			break;
		case 3:
			int tempv,add=0,rem;
			for(int i=1;i<=500;i++){
				tempv=i;
				while(tempv>0) {
				rem=tempv%10;
				add=add+(rem*rem*rem);
				tempv=tempv/10;
				}
				if(add==i) {
					System.out.println(i+" ");
				}
			
				add=0;
			}	
			break;
			
		case 4:
			int rows=5;
			for(int i=1;i<=rows;i++)
			{
				for(int j=rows;j>i;j--)
					System.out.print(" ");
				for(int k=i;k>=1;k--)
					System.out.print(k);
				if(i!=1)
				{
					for(int lo=1;lo<i;lo++)
						System.out.print(lo+1);
					
				}
				System.out.println("");
			}
			
			break;
			
		case 5:
			
				System.exit(0);
				
			default:
				System.out.println("Enter valid choice");
		
				
				
			
		}
			}
		System.out.println("Input exceeds. Thank you");
	}

}
