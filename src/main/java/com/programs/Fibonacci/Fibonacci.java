package com.programs.Fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	System.out.println("Tell the number till when you want fibonacci series ");
	int num=scan.nextInt();
	int x=1;
	int y=1;
	System.out.println("Below is the Fibonacci series");
	System.out.print(x+" ");
	System.out.print(y+" ");
	int temp=x+y;
	while(temp<num)
	{
		temp=x+y;
		if(temp<num)
		System.out.print(temp+" ");
		x=y;
		y=temp;
	}
	
	}

}

