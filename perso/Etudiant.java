
package perso;

public class Etudiant extends Personne {
	
	private float note;

	public Etudiant(String nom, int age, float note)
	{
		super(nom, age);
		this.note = note;
	}

	public String toString()
	{
		return "Etudiant [nom="+this.getNom()+", age="+this.getAge()+", note="+this.getNote()+"]";
	}

	public float getNote()
	{
		return this.note;
	}

	public void setNote(float note)
	{
		this.note = note;
	}

}
