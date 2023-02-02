package exercice1;

public class Livre {
	private String titre;
	private Auteur[] tabAuteurs;

	public Livre(String titre, Auteur[] tabAuteurs) {
		this.titre = titre;
		this.tabAuteurs = tabAuteurs;
		for(int i=0;i<tabAuteurs.length;i++) {
			tabAuteurs[i].ajouterLivre(this);
		}
	}

	public String getTitre() {
		return titre;
	}

	public Auteur getPremierAuteur() {
			return tabAuteurs[0];
	}

	public Auteur[] getAuteurs() {
		return tabAuteurs;
	}

}
