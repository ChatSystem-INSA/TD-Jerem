package perso;

import perso.Enseignant;

/**
 * Created by boutoill on 07/11/14.
 */
public class EnseignantChercheur extends Enseignant implements IChercheur {

    public static final int SIZE = 10;
    private Publication[] publications;
    private int countEntries;

    public EnseignantChercheur(String nom, int age, int heures) {
        super(nom, age, heures);
        this.publications = new Publication[this.SIZE];
        this.countEntries = 0;
    }

    public String toString()
    {
        return "EnseignantChercheur [nom="+this.getNom()+", age="+this.getAge()+", heures="+this.getHeures()+", publications="+this.listerPublications()+"]";
    }

    @Override
    public void ajouterPublication(Publication p) {
        if(this.countEntries < this.SIZE)
        {
            this.publications[this.countEntries] = p;
            this.countEntries += 1;
        }
    }

    @Override
    public String listerPublications() {
        String retour = "{";
        for(int i = 0; i<this.countEntries; i++)
        {
            retour += this.publications[i].toString() + " ";
        }
        return retour + "}";
    }
}
