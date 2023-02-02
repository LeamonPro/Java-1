package ex;

public class Employe {
	static int y = 1001;
	private int matricule;
	private String nom;
	private float salaire;
	private Service service;

	public Employe(String nom, float salaire) {
		this.nom = nom;
		this.salaire = salaire;
		matricule = y;
		y++;
	}

	public int getMatricule() {
		return matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public void augmenterSalaire(float x) {
		salaire += salaire * x;
	}

	public void afficher() {
		System.out.println("    Matricule:" + matricule + "\n    Nom:" + nom + "\n    Nom de service" + service.getNom()
				+ "\n    Salaire:" + salaire);
	}

}
