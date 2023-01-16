package exercice;
import java.util.Scanner;

public class Exercice5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Indiquer le nombre que vous voulez calculer avec la suite de Fibonacci : ");
        int d= sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		
		if (d==0 || d==1)
	    {
	        System.out.println("Fibonacci " + d);
	    }

	    else
	    {
	       for (int i=2; i<=d; i++)
	        {
	            a = b + c;
	            c = b;
	            b = a;
	        }
	       System.out.println("Fibonnaci " + d + " = " + a );
	    }
		
	}
}