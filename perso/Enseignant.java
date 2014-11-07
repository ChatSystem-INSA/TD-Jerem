
package perso;

public class Enseignant extends Personne {
	
	private int heures;

	public Enseignant(String nom, int age, int heures)
	{
		super(nom, age);
		this.heures = heures;
	}

	public String toString()
	{
		return "Enseignant [nom="+this.getNom()+", age="+this.getAge()+", heures="+this.getHeures()+"]";
	}

	public int getHeures()
	{
		return this.heures;
	}

	public void setHeures(int heures)
	{
		this.heures = heures;
	}

}
