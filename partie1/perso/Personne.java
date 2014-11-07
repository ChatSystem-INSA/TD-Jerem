
package partie1.perso;

public class Personne {
	
	private String nom;
	private int age;

	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public String toString()
	{
		return "Personne [nom="+this.getNom()+", age="+this.getAge()+"]";
	}

	public String getNom()
	{
		return this.nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}
