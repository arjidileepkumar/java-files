package file;

import java.util.Scanner;

public class Luckynumber {

	public static void main(String[] args) {
		//getting number from user
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number: ");
		int n= s.nextInt();
		if ((n>1)&&(n<10))
			System.out.println("in between 1 and 10");
		else 
			System.out.println("not in perameter");
		
		
		
	}

}
