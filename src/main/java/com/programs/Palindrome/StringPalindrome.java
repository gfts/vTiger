package com.programs.Palindrome;


import java.util.Scanner;

public class StringPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Check if String is Palindrom or not");
		Scanner scan=new Scanner(System.in);
		boolean exit = new Boolean(false);
		while(!exit){
		String st1= scan.nextLine();
		StringBuilder st2= new StringBuilder(st1);
		StringBuilder st3=new StringBuilder();
		for(int i=st2.length()-1;i>=0;i--)
		{
			st3= st3.append(Character.toLowerCase(st2.charAt(i)));
		}
		x:
if(st2.length()==st3.length())
{
	for(int i=0; i<st2.length();i++)
	{
		if(st3.charAt(i)!= Character.toLowerCase(st2.charAt(i)))
		{
			System.out.println("Not Palidrome");
			break x;
			}
	}
	System.out.println("It is Palindrome");
}
		
	}

}}
