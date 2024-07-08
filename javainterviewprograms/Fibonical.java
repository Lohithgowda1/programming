package javainterviewprograms;

import java.util.Scanner;

public class Fibonical {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of series");
		int count=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println("the fibonce series are:");
		System.out.println(a);
		
		for(int i=2;i<=count;i++) {
			int res=a+b;
			System.out.println(res+" ");
			a=b;
			b=res;
		}
		System.out.println();
	}
}
