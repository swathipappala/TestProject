package com.java.Fibonacci;

public class FibonacciRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int t1=0,t2=1,t3,i=10;
System.out.println(t1 +" "+ t2);
while(i<=10){
	t3=t1+t2;
	System.out.println(" "+t3);
	t1=t2;
	t2=t3;
}
	}

}
