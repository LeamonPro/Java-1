
public class Temps {
	private int heures;
	private int minutes;
	private int secondes;
	public Temps(int h, int m, int s) throws TempsException //le constructeur va declancher une exception
	{
		if(h<0 || h>23 ) throw new TempsException("heures invalide"); 
		if(m<0 || m>59 ) throw new TempsException("minutes invalide");
		if(s<0 || s>59 ) throw new TempsException("seconde invalide");
		//d'aprés les valeurs de h,m et s entrées il va verifié les conditions si l'une des conditions est invalide il va declancher l'exception associée a une telle condition
		this.heures=h;
		this.minutes=m;
		this.secondes=s;
		
	}
	
}
