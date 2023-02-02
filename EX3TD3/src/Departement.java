
public class Departement {
	private String nom;
	private Personne[] tabPersonne;

	public Departement(String nom, Personne[] tabPersonne) {
		this.nom = nom;
		this.tabPersonne = tabPersonne;
	}

	public Personne[] getTabPersonne() {
		return tabPersonne;
	}

	public String getNom() {
		return nom;
	}

}
