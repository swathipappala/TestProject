package com.java.Fibonacci;

import java.util.Scanner;

public class FibonacciScan {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int t1=0,t2=1,t3,i;
Scanner scanner = new Scanner(System.in);
i=scanner.nextInt();
System.out.print(t1 +" "+t2);
for(int n=0;n<=i;n++){
t3=t1+t2;
System.out.print(" "+ t3);
t1=t2;
t2=t3;
	}
	}
}
