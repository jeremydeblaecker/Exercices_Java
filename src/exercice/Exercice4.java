package exercice;
import java.util.Scanner;

public class Exercice4 {
	public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    System.out.println("Entrer a");
    int nombreA = sc.nextInt();
    System.out.println("Entrer b");
    int nombreB= sc.nextInt();
    System.out.println("Entrer U0");
    float nombreU0= sc.nextFloat();
    System.out.println("Entrer NMax");
    int nombreNMAX= sc.nextInt();
    System.out.println("Entrer Epsilon");
    float epsilon= sc.nextFloat();

    System.out.println("Calcul de la suite Un =" +nombreA+ "+" +nombreB+ "/ Un-1 avec U0 =" +nombreU0+ "et NMAX =" +nombreNMAX+ "avec epsilon =" +epsilon);
    float u_max = (nombreA+nombreB/nombreU0);
	int n = 1;
	
	while (Math.abs(u_max - nombreU0) > epsilon && (n < nombreNMAX)){
		nombreU0 = u_max;
		u_max =nombreA + nombreB/ nombreU0;
	    n += 1;
	}
    System.out.println("Resultat " +u_max+ ",nombre d'itération " +n);
	}
	
}