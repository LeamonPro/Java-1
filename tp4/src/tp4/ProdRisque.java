package tp4;

public class ProdRisque extends Production implements aRisque {
	//on peut dire que ce classe faire un h�ritage multiple il a h�rit� de Production et aRisque
	public ProdRisque(String nom, String prenom, int age, String date,int nbu) {
		super(nom, prenom, age, date,nbu);
	}
	public float calculerSalaire() {
		return super.calculerSalaire()+prime; //ici ona utilis� la m�thode calculerSalaire de la classe Production h�rit� par le mot super.
	}
	

}
