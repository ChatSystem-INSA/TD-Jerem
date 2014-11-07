
import perso.Personne;
import perso.Etudiant;
import perso.Enseignant;

class HelloPersonnes {
	
	public static void main(String[] args) {

		Personne[] tableau = new Personne[3];
		tableau[0] = new Personne("Patate", 10);
		tableau[1] = new Etudiant("Table", 1337, 42);
		tableau[2] = new Enseignant("Prout", -10, 1000);

		for(Personne p : tableau)
		{
			System.out.println(p.toString());
		}

	}

}
