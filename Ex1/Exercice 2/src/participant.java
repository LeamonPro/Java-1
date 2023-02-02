public class participant {
	private String nom;
	private String specialite;
	private formation form;

	public participant(String nom, String specialite) {
		this.nom = nom;
		this.specialite = specialite;
	}

	public void affecterFormation(formation f) {
		if (f.getEns().getSpecialite().equals(this.specialite)) {
			form = f;
		} else
			form = null;

	}

	public void affiche() {
		System.out.println("Nom:" + nom);
		if (form != null)
			form.affiche();
		else
			System.out.println("Pas de formation");
	}
}