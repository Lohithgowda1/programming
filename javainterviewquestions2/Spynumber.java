package javainterviewprograms;

import java.util.Scanner;

public class Spynumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0,mul=1,rem;
		while(n>0) {
		rem=n%10;
		sum=sum+rem;
		mul=mul*rem;
		n=n/10;
		}
		if(sum==mul) {
			System.out.println("it is spy number");
		}
		else {
			System.out.println("It is not the spy number");
		}	
	}
}
