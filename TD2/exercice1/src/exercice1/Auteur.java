package exercice1;

public class Auteur {
	private String nom;
	private Livre[] tabLivres;
	private int nbrlivres;

	public Auteur(String nom) {
		this.nom = nom;
		tabLivres = new Livre[100];
		nbrlivres = 0;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterLivre(Livre l) {
		tabLivres[nbrlivres] = l;
		nbrlivres++;
	}

	public void afficher() {
		System.out.println("le nom de l'auteur est :" + nom);
		System.out.println("Les livres ecrites par ce auteur");
		for (int i = 0; i < nbrlivres; i++) {
			System.out.println(tabLivres[i].getTitre());
		}

	}

}
