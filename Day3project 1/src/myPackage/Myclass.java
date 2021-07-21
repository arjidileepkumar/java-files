package myPackage;

import java.util.Scanner;

public class Myclass
{

	public static void main(String[] args) 
	{
		
		
		Scanner input =new Scanner(System.in);
		System.out.println("enter your name: ");
		String name= input.next();
		
		System.out.println("enetr your age: ");
		
		int age = input.nextInt();
		System.out.println("your name is: "+name);
		
		
		System.out.println("your age is: "+age);
	
		
	}

}
