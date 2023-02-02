
public class Vacataire extends Employe {
	private int nbHeures;
	private float prixHeure;

	public Vacataire(String nom, int nbHeures, float prixHeure) {
		super(nom);
		this.nbHeures = nbHeures;
		this.prixHeure = prixHeure;
	}

	public void setprixHeure(float prixHeure) {
		this.prixHeure = prixHeure;
	}

	public void calculerSalaire() {
		salaire = nbHeures * prixHeure;
	}

	public String toString() {
		this.calculerSalaire();
		return (super.toString() + ", Salaire:" + salaire );

	}

}
