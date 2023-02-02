package tp4;
//on va faire un héritage d'un class abstrait donc on doit redefinir tous les m"thodes abstraites
public class Representant extends Commercial {
	private final static float pourcentage=0.2f;
	private final static float bonus=800;
	public Representant(String nom, String prenom, int age, String date,float ca) {
		super(nom, prenom, age, date,ca);
	}

	public String getTitre() {
		return "Representant";
	}

	public float calculerSalaire() {
		return pourcentage*super.getCa()+bonus;
	}

}
