//on va h�rit� d'un class pr�difinie qui s'appelle Exception
public class TempsException extends Exception {
	//le clas Exception admet une m�thode toString qu'on va h�rit� et l'a donn� le message qu'on veut afficher 
	public TempsException(String x) {
		super(x);// x represente le message d'erreur 
	}
}
