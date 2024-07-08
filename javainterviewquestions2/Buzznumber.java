package javainterviewprograms;

import java.util.Scanner;

public class Buzznumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

		if(n%10==7 || n%7==0) {
				System.out.println("It is not a buzz number");		
		}
		else {
			System.out.println("it is not a buzz number");
		}
}
}
