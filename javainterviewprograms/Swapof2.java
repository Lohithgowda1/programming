package javainterviewprograms;

import java.util.Scanner;

public class Swapof2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num");
		int a=sc.nextInt();
		System.out.println("enter the second num");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap:"+a);
		System.out.println("after swap:"+b);
		
	}

}
