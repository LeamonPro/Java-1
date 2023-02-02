package tp4;

public abstract class Commercial extends Employe {
	private float ca;

	public Commercial(String nom, String prenom, int age, String date,float ca) {
		super(nom, prenom, age, date);
		this.ca=ca;
		
	}//c'est une classe qui hérite de la classe Employe on l'a fait dans le but d'acceder au chiffre d'affaire realisé par un tel employée
	
	public float getCa() {
		return ca;
	}///méthode qui nous permet d'acceder a l'attribut ca au déhors de la classe 

}
