package tp4;

public abstract class Commercial extends Employe {
	private float ca;

	public Commercial(String nom, String prenom, int age, String date,float ca) {
		super(nom, prenom, age, date);
		this.ca=ca;
		
	}//c'est une classe qui h�rite de la classe Employe on l'a fait dans le but d'acceder au chiffre d'affaire realis� par un tel employ�e
	
	public float getCa() {
		return ca;
	}///m�thode qui nous permet d'acceder a l'attribut ca au d�hors de la classe 

}
