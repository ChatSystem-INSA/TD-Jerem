package partie1.perso;

import java.util.ArrayList;

/**
 * Created by boutoill on 07/11/14.
 */
public class EnseignantChercheur extends Enseignant implements IChercheur {

    public static final int MAX_PUB = 10;
    private ArrayList<Publication> publications;

    public EnseignantChercheur(String nom, int age, int heures) {
        super(nom, age, heures);
        this.publications = new ArrayList<Publication>();
    }

    public String toString()
    {
        return "EnseignantChercheur [nom="+this.getNom()+", age="+this.getAge()+", heures="+this.getHeures()+", publications="+this.listerPublications()+"]";
    }

    @Override
    public void ajouterPublication(Publication p) {
        if(this.publications.size() < this.MAX_PUB)
        {
            this.publications.add(p);
        }
    }

    @Override
    public String listerPublications() {
        return this.publications.toString();
    }
}
