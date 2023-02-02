package tp4;

public class ProdRisque extends Production implements aRisque {
	//on peut dire que ce classe faire un héritage multiple il a hérité de Production et aRisque
	public ProdRisque(String nom, String prenom, int age, String date,int nbu) {
		super(nom, prenom, age, date,nbu);
	}
	public float calculerSalaire() {
		return super.calculerSalaire()+prime; //ici ona utilisé la méthode calculerSalaire de la classe Production hérité par le mot super.
	}
	

}
