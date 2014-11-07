
import perso.Personne;
import perso.Etudiant;
import perso.Enseignant;

class HelloPersonnes {
	
	public static void main(String[] args) {
		Personne p1 = new Personne("Patate", 10);
		Personne p2 = new Etudiant("Table", 1337, 42);
		Personne p3 = new Enseignant("Prout", -10, 1000);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
