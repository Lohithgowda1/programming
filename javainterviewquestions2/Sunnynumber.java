package javainterviewprograms;

import java.util.Scanner;

public class Sunnynumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n;
		double d;
		System.out.println("enter the number");
		n=sc.nextInt();
		d=Math.sqrt(n+1);
		if(d-Math.floor(d)==0) {
			System.out.println(n+" it is a sunny number");
		}
		else {
			System.out.println(n+" it is not a sunny number");
		}
	}

}
