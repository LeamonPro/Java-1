public class enseignant {
	private String nom;
	private String specialite;

	public enseignant(String nom, String specialite) {
		this.nom = nom;
		this.specialite = specialite;
	}

	public String getNom() {
		return nom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void affiche() {
		System.out.println("Enseignant:" + nom +"\n "+"Specialite:" + specialite);
	}
}
