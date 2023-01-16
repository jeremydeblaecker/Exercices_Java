package exercice;

public class Exo7PFormeGeometrique {
	abstract class AFormeGeometrique{
		private String nom;
		
	}
	
	
	class Rectangle extends AFormeGeometrique
	{
		private double largeur;
	    private double longueur;

	    public Rectangle(double larg, double longueur) {
	        this.largeur = larg;
	        this.longueur = longueur;
	    }
	    public double perimetre() {
	        return ((largeur + longueur)*2);
	    }
	    public void affichage() {
	    	System.out.println("Ce rectangle mesure"+this.largeur+"cm de largeur et"+this.longueur+"de longueur");
	    }
	    
	    public double surface() {
	        return (largeur * longueur);
	    }
	}
	
	class Cercle extends AFormeGeometrique{
		private double x;
		private double y;
		private double peri;
		private double rayon;
		
		public Cercle(double x, double y, double r) {
			this.x = x;
			this.y = y;			
			this.rayon = r;
		}
		
		public double perimetre() {
			return peri = (2 * Math.PI * rayon);
		}
		
		public void affichage(){
			System.out.println("Le permimetre du cercle est de" + peri);
		}
		
		public double surface() {
			return (Math.PI * (rayon * rayon));
		}
	}
	
	class Carre extends Rectangle{
		public Carre(double largeur, double longueur) {
			super (largeur, longueur);
		}
		
		public void affichage() {
	    	super.affichage();
	    	System.out.println("Largeur : "+super.largeur+"Longueur : "+super.longueur);

		}
	}
}
