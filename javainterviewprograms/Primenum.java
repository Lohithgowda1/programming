package javainterviewprograms;

import java.util.Scanner;

public class Primenum {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		for(int i=2;i<a;i++) {
		if(a%i!=0) {
			System.out.println("It is a prime number");
			break;
		}
		else {
			System.out.println("It is not a prime number");
			break;
		}
	}
	}
}
