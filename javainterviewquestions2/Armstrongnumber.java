package javainterviewprograms;

import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("is armstrong : "+ isArmstrong(number));
	}
		static boolean isArmstrong(int n) {
		int temp,digit=0;
		int sum=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		System.out.println("the number of digit:"+digit);
		temp=n;
		while(temp>0) {
			int lastDigit=temp%10;
			sum=(int) (sum+ Math.pow(lastDigit, digit));
			temp=temp/10;
		}
		if(sum==n) {
			System.out.println("It is armstrong number");
			return true;
		}
		else {
			System.out.println("it is not arm strong number");
			return false;
		}
			
		}
	}


