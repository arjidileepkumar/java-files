package nestedloop;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
               int d=0;
               do {
              System.out.println("enter number: ");
               d+=s.nextInt();
               
	}while (d<=100);
               System.out.println("done: "+d);

}
}