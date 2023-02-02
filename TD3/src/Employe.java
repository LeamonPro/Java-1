
public class Employe {
	private int matricule;
	private String nom;
	protected float salaire;
	static int i=1000;

	public Employe(String nom) {
		this.nom = nom;
		i++;
		matricule = i;
		salaire = 0;
	
	}

	public String toString() {
		return ("Matricule:" + matricule + ", Nom:" + nom);
	}

}
