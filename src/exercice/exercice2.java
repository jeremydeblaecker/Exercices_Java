package exercice;
import java.lang.Math;
import java.util.*;

public class exercice2 {
	
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int max = 6;
    int min = 1;
    
    int intervalle = max - min + 1;
    
    int d1 = 421;
    int d2 = 421;
    int d3 = 421;
    
    String a = "o";
    while(a.equals("o") || a.equals("O")) {
        for (int i = 0; i<3; i++ ) {
            if (d1 != 4) {
                d1 = (int) (Math.random() * intervalle) + min;
            }
            if (d2 != 2) {
                d2 = (int) (Math.random() * intervalle) + min;
            }
            if (d3 != 1) {
                d3 = (int) (Math.random() * intervalle) + min;
            }
            
            System.out.println(d1 + "|" + d2 + "|" + d3);
            
            if (d1 == 4 && d2 == 2 && d3 == 1) {
                System.out.println("Victoire!");
            } 
            else {
                System.out.println("Perdu");
            }
        }
        System.out.println("Une nouvelle partie? (O/N)");
        a = sc.nextLine();
    }
    System.out.println("Au revoir!");

}
}