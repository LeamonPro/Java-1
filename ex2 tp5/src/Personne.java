
public class Personne {
	private String nom;
	private int age;
	//le constructeur va d�clancher deux exception 
	public Personne(String x,String y )throws NomInvalideException,AgeInvalideException {
		if(x==null || x.isEmpty()) throw new NomInvalideException();
		//d'apr�s la valeur de x entr�es il va verifi� la condition si elle est invalide il va declancher l'exception NomInvalideException
		this.nom=x;
		try 
		{
			this.age=Integer.parseInt(y);
		} 
		catch  (NumberFormatException e) {
			age =0;
		}
		//dans ce qui prec�de il va affecter y a la variable age et il va verifi� son contenu s'ill est n'est pas un number il va d�clancher une exception
		
		
		if(age<=0 || age >120) throw new AgeInvalideException();
		//d'apr�s la valeur de age  il va verifi� la condition si elle est invalide il va declancher l'exception AgeInvalideException
	}
}	
