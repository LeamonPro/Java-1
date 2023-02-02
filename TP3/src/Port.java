import java.util.ArrayList;

public class Port {
	private String nom;
	private int cap;
	private float taxe;
	private int nbBarque;
	private ArrayList<Barque> listBarque;
	public Port(String nom,int cap,float taxe) {
		this.nom=nom;
		this.cap=cap;
		this.taxe=taxe;
		nbBarque=0;
		listBarque=new ArrayList<Barque>();
	}
	public void entreBarque(Barque b) {
		if(nbBarque<cap) {
			listBarque.add(b);
			nbBarque++;
		}
		else 
			System.out.println("Port saturé");
		
	}
	public void sortieBarque(Barque b) {
		for(int i=0;i<nbBarque;i++) {
			if(listBarque.get(i).equals(b)) {
				listBarque.remove(b);		
			nbBarque--;}
		}
	}
  
	public float calculerRecette() {
		float recette=0;
		for(int i=0;i<listBarque.size();i++) {
			 if(listBarque.get(i) instanceof BarqueMoteur){
		            if(((BarqueMoteur)listBarque.get(i)).getPuissance()<5)
		                 recette+=taxe*1.1f;
		            else
		                recette+= taxe*1.2f;
		        }
			 else
		           recette+=taxe;
					
		}
		return recette;
	}
	public String toString() {
		String ch="Nom : "+nom+"\tCapacite: "+cap+"\tRecette du jour: "+calculerRecette()+"\tNombre de barque: "+nbBarque+"\n";
		for(int i=0;i<nbBarque;i++) {
			ch+=listBarque.get(i).toString()+"\n";
		}
		return ch;
	}
	
	
	
}
