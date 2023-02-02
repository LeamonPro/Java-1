package tp4;
//on va faire un héritage d'un class abstrait donc on doit redefinir tous les méthodes abstraites
public class Vente extends Commercial {
	private final static float pourcentage=0.2f;
	private final static float bonus=400;
	private float ca;
	public Vente(String nom, String prenom, int age, String date,float ca) {
		super(nom, prenom, age, date,ca);
		
		
	}//un classe qui hérite de Commercial represente les vendeurs
	
	public String getTitre() {
		return "Vendeur";
	}
	public float calculerSalaire() {
		return pourcentage*super.getCa()+bonus;
	}
	

}
