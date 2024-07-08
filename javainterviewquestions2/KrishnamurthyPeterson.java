package javainterviewprograms;

import java.util.Scanner;

public class KrishnamurthyPeterson {
	public static int factorial(int num) {
		int f=1;
		for(int i=1;i<=num;i++)
			f=f*i;
		return f;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0,temp=num;
		while(num!=0) {
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
			
		}
		if(sum==temp) {
			System.out.println(temp+" it is peterson number/strong number");
		}
		else {
			System.out.println("it is not a peterson number");
		}
	}
}