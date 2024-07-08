package javainterviewprograms;

import java.util.Scanner;

public class Area {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle ");
		int r=sc.nextInt();
		int square=r*r;
		double areac=3.14*square;
		System.out.println("Area of circle is:"+areac);
		System.out.println("enter the length of the rectangle");
		int l=sc.nextInt();
		System.out.println("enter the bredth of the rectangle");
		int b=sc.nextInt();
		int arear=l*b;
		System.out.println("Area of rectangle is:"+arear);
		System.out.println("enter the side length of the square");
		int s=sc.nextInt();
		int areas=s*s;
		System.out.println("Area of rectangle is:"+areas);
		
		
	}

}
