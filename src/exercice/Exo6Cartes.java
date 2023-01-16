package exercice;

enum Couleur{
    PIQUE,
    COEUR,
    CARREAU,
    TREFLE;
}

public class Exo6Cartes {
    private Couleur a_Couleur;
    private String a_Valeur;

    public Exo6Cartes(Couleur color, String Valeur){
        this.a_Couleur = color;
        this.a_Valeur = Valeur;
    }

    public Exo6Cartes(Exo6Cartes card){
        this.a_Couleur = card.a_Couleur;
        this.a_Valeur = card.a_Valeur;
    }

    public void setType(Couleur clr){
        this.a_Couleur = clr;
    }

    public  void setValeur(String valeur){
        this.a_Valeur = valeur;
    }

    public void afficher(){
        System.out.println(this.a_Valeur+" of "+this.a_Couleur);
    }

    public boolean equal(Exo6Cartes egal){
        if (this.a_Couleur == egal.a_Couleur && this.a_Valeur== egal.a_Valeur){
            return true;
        }
        else{
            return false;
        }
    }

    public void affecter(Exo6Cartes Affecter){
        this.a_Couleur = Affecter.a_Couleur;
        this.a_Valeur = Affecter.a_Valeur;
    }
}
