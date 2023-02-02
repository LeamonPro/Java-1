//on va hérité d'un class prédifinie qui s'appelle Exception
public class NomInvalideException extends Exception {
	//le clas Exception admet une méthode toString qu'on va hérité et l'a donné le message qu'on veut afficher 
	public NomInvalideException() {
		super("Nom invalide");//on a passer au super le message qu'on veut afficher 
	}
}
