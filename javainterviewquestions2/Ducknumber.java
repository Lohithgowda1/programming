package javainterviewprograms;

import java.util.Scanner;

public class Ducknumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rem,c=0;
		while(n!=0) {
			rem=n%10;
			if(rem==0) {
				c++;
			}
			n=n/10;
		}
			if(c>0) {
				System.out.println(" It is a duck number");
			}
			else {
				System.out.println("it is not a duck number");
			}
		}
	}

