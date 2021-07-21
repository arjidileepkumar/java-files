package mypackage;
import java.lang.*;
import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        int d1 = s.nextInt();
        char op= s.next().charAt(0);
        int d2 = s.nextInt();
        if (op=='+');
        System.out.println((int)d1+d2);
        else if (op=='-');
        System.out.println((int)d1-d2);
        else if (op=='*');
        System.out.println((int)d1*d2);
        else if (op=='/');
        System.out.println((int)d1/d2);
        
        
	}

}
