
public class Personne {
	private String nom;
	private int age;
	//le constructeur va déclancher deux exception 
	public Personne(String x,String y )throws NomInvalideException,AgeInvalideException {
		if(x==null || x.isEmpty()) throw new NomInvalideException();
		//d'aprés la valeur de x entrées il va verifié la condition si elle est invalide il va declancher l'exception NomInvalideException
		this.nom=x;
		try 
		{
			this.age=Integer.parseInt(y);
		} 
		catch  (NumberFormatException e) {
			age =0;
		}
		//dans ce qui precéde il va affecter y a la variable age et il va verifié son contenu s'ill est n'est pas un number il va déclancher une exception
		
		
		if(age<=0 || age >120) throw new AgeInvalideException();
		//d'aprés la valeur de age  il va verifié la condition si elle est invalide il va declancher l'exception AgeInvalideException
	}
}	
