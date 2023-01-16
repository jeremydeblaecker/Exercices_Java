package exercice;
import java.util.Scanner;
import java.util.Random;

public class exercice1 {
	public static void main(String[] args)
	{
	  Scanner input = new Scanner(System.in);
	  Random rnd = new Random();
	  int nbrmystere = rnd.nextInt(10 + 10) -10;
	  int nessais = 0;
	  int chiffrejoueur;
	  System.out.print("Le nombre à trouver est compris entre -10 et 10. \nEntrer un nombre :");
	  
	  chiffrejoueur = input.nextInt();
	  ++nessais;
	  
	  while (chiffrejoueur != nbrmystere)
	  {
	    if (chiffrejoueur < nbrmystere)
	    {
	      System.out.println("Trop petit");
	    }
	    else
	    {
	      System.out.println("Trop grand");
	    }
	    System.out.print("Le nombre à trouver est compris entre -10 et 10\n	");
	    chiffrejoueur = input.nextInt();
	    ++nessais;
	  }
	  System.out.println("Bravo le chiffre est bien " + chiffrejoueur + ",vous avez gagné en " + nessais + " coups");
	}

}
