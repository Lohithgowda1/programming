package javainterviewprograms;

import java.util.Scanner;

public class Neonnum {
	void neon(int num){
		int sqr=num*num;
		int sum=0;
		while(sqr>0) { 
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
		
		if(sum==num) {
			System.out.println("The number is Neon : "+num);
		}
		else {
			System.out.println("It is not a neon number");
		}
	}
	public static void main(String args[]) {
		 Neonnum obj=new Neonnum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		  int num=sc.nextInt();
		 
		  obj.neon(num);
	}
}
