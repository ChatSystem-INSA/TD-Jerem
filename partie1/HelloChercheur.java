package partie1;

import partie1.perso.EnseignantChercheur;
import partie1.perso.IChercheur;
import partie1.perso.Publication;

public class HelloChercheur {

    public static void main(String[] args) {
        // Creation of the objects
        IChercheur chercheur = new EnseignantChercheur("tom", 35,192);
        chercheur.ajouterPublication(new Publication("La conception objet",2003));
        chercheur.ajouterPublication(new Publication("La programmation objet",2004));

        // printing the object attributes
        System.out.println(chercheur);
    }
}