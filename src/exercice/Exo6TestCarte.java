package exercice;

public class Exo6TestCarte {
    public static void main() {
        System.out.println("La première carte est: ");        
        Exo6Cartes Carte1 = new Exo6Cartes(Couleur.CARREAU, "VALET");
        Carte1.afficher();
        System.out.println("La deuxième carte est: ");        
        Exo6Cartes Carte2 = new Exo6Cartes(Couleur.CARREAU, "REINE");
        Carte2.afficher();
        
        if (Carte1.equal(Carte2)) {
            System.out.println("Les cartes sont identiques");
        } else {
            System.out.println("Les cartes sont differentes");
        }
    }

}

