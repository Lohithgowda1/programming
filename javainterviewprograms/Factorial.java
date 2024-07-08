package javainterviewprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int res=1;
		for(int i=1;i<=a;i++) {
			res*=i;
		}
		System.out.println(res);
	}
}
