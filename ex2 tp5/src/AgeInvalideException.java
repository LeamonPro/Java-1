//on va h�rit� d'un class pr�difinie qui s'appelle Exception
public class AgeInvalideException extends Exception{
	//le clas Exception admet une m�thode toString qu'on va h�rit� et l'a donn� le message qu'on veut afficher 
	public AgeInvalideException() {
		super("Age invalide");//on a passer au super le message qu'on veut afficher 
	}
}
