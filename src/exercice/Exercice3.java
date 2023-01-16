package exercice;
import java.util.Scanner;


public class Exercice3 {
	
	public int ordinateurjoue(int reste)
    {
        return (int)(Math.random()*3)+1;
    }
    
    public void play()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Avec combien d'alumettes voulez-vous commencer ?");
        int reste = sc.nextInt();
        while(reste>0)
        {
            int ordinateur=ordinateurjoue(reste);
            System.out.println("L'ordinateur choisi "+ordinateur);
            reste-=ordinateur;
            System.out.println("Il y a maintenant "+ reste +" restante.");
            if(reste<=0)
            {
                System.out.println("L'ordinateur a gagné!");
                return;
            }
            System.out.println("Combien d'alumettes voulez retirer ?(1, 2 ou 3)");
            int person=sc.nextInt();
            while(person!=1 && person!=2 && person!=3)
            {
                System.out.println(person+" n'est pas autorisé, choisir 1, 2 ou 3.");
                person=sc.nextInt();
            }
            reste-=person;
            System.out.println("Maintenant il y a "+reste+" alumettes restantes.");
            if(reste<=0)
            {
                System.out.println("Victoire!");
                return;
            }
        }
    }
    
    public static void main(String[] args)
    {
    	Exercice3 jeu=new Exercice3();
        jeu.play();
    }
}