//on va hérité d'un class prédifinie qui s'appelle Exception
public class TempsException extends Exception {
	//le clas Exception admet une méthode toString qu'on va hérité et l'a donné le message qu'on veut afficher 
	public TempsException(String x) {
		super(x);// x represente le message d'erreur 
	}
}
