package javainterviewprograms;

public class Reverse {
	public static void main(String args[]) {
		String a="hello";
		String b=" ";
		char c;
		for(int i=a.length()-1;i>=0;i--) {
			c=a.charAt(i);
			b=b+c;
		}
		System.out.println(b);
	}

}
