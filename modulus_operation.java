package number;

import java.util.Scanner;

public class modulus_operation {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number m");
		int m=s.nextInt();
		System.out.println("enter the number n");
		int n=s.nextInt();
		System.out.print("the value is ");
		System.out.println(m%n);
	}

}

