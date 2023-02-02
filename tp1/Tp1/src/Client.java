
public class Client {
	private String nom;
	private String prenom;
	private int nbCompte;
	private compte[] tabComptes;

	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		nbCompte = 0;
		tabComptes = new compte[10];
	}

	public void ouvrir_compte() {
		if (nbCompte < 10) {
			tabComptes[nbCompte] = new compte();
			nbCompte++;
		} else
			System.out.println("No more accounts");
	}

	public void fermer_compte(String x) {
		for (int i = 0; i < nbCompte; i++) {
			if (tabComptes[i].verif(x)==true) {
				for (int j = i; j < nbCompte-1; j++)
					tabComptes[j] = tabComptes[j + 1];
				nbCompte--;
			}
		}

	}

	public void deposer(String c, float x) {
		for(int i=0;i<nbCompte;i++) {
			if(tabComptes[i].verif(c)==true) {
				tabComptes[i].crediter(x);
				break;}
		}
	}

	public void retirer(String c, float x) {
		for(int i=0;i<nbCompte;i++) {
			if(tabComptes[i].verif(c)==true) {
				tabComptes[i].debiter(x);
				break;}
		}
	}

	public void afficher() {
		float som=0;
		System.out.println("Client :" + nom + " " + prenom );
		System.out.println("\tInfos sur les comptes :");
		for (int i = 0; i < nbCompte; i++) {
			som+=tabComptes[i].getSolde();
			if (tabComptes[i] != null)
				tabComptes[i].affiche();
		}
		System.out.println("\t\tLe total ="+som+"DT");

	}

	public boolean verif(String x) {
		for (int i = 0; i < nbCompte; i++) {
			if (tabComptes[i].verif(x))
				return true;
		}
		return false;

	}

}
