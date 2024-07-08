package javainterviewprograms;

import java.util.Random;

public class RandomNum {
	public static void main(String args[]) {
		Random random=new Random();
		int num;
		for(int i=0;i<=10;i++) {
			num=random.nextInt(999);
			System.out.println("value :"+num+" i: "+i);
			
		}
		
	}

}
