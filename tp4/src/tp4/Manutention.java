package tp4;
//on va faire un h�ritage d'un class abstrait donc on doit redefinir tous les m�thodes abstraites
public class Manutention extends Employe {
	private float nbh;
	private static final float val_h=65;
	public Manutention(String nom, String prenom, int age, String date,float nbh) {
		super(nom, prenom, age, date);
		this.nbh=nbh;
	}

	public String getTitre() {
		return "Manutention";
	}

	public float calculerSalaire() {
		return val_h*nbh;
	}

}
