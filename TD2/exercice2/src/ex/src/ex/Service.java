package ex;

public class Service {
	private String nom;
	private Employe chef;
	private int nbMax;
	private Employe[] tabEmp;
	private int nbEmp;

	public Service(String nom, int nbMax) {
		this.nom = nom;
		this.nbMax = nbMax;
		tabEmp = new Employe[nbMax];
	}

	public Employe getChef() {
		return chef;
	}

	public void setChef(Employe chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void affecterEmp(Employe e) {
		if (nbEmp < nbMax) {
			tabEmp[nbEmp] = e;
			e.setService(this);
			nbEmp++;
		}
	}

	public void eliminerEmp(Employe e) {
		for (int i = 0; i < nbEmp; i++) {
			if (tabEmp[i].getMatricule() == e.getMatricule()) {
				for (int j = i; j < nbEmp - 1; j++) {
					tabEmp[j] = tabEmp[j + 1];
				}
				nbEmp--;
				break;
			}
		}
	}

	public void augmenterSalaire(float x) {
		for (int i = 0; i < nbEmp; i++)
			tabEmp[i].augmenterSalaire(x);
	}

	public void affiche() {
		System.out.println("Nom du service:" + nom);
		if (chef != null) {
			System.out.println(" Description du chef de service:");
			chef.afficher();
			System.out.println("");
		} else
			System.out.println(" Ce cervice n'a pas de chef");
		System.out.println(" Description des employes du service :");
		for (int i = 0; i < nbEmp; i++) {
			if (tabEmp[i].getMatricule() != chef.getMatricule()) {
				tabEmp[i].afficher();
				System.out.println(" ");
			}
		}
		System.out.println("----------------------------------------------");
	}

}
