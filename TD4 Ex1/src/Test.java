import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		ArrayList<Vehicule> liste=new ArrayList<>();
		liste.add(new Voiture("Lamborghini"));
		liste.add(new Avion("Concorde"));
		liste.add(new Velo("Rockrider"));
		for(int i=0;i<liste.size();i++) {
			if(liste.get(i) instanceof Motorise) 
			System.out.println(liste.get(i).toString()+liste.get(i).seDeplacer()+" et la valeure de propriete :"+((Motorise)liste.get(i)).calculer());
			else {
				System.out.println(liste.get(i).toString()+liste.get(i).seDeplacer());
			}
			}
			
		ArrayList<Motorise> liste1=new ArrayList<>();
		liste1.add(new Voiture("Porshe"));
		liste1.add(new Avion("F12"));
		for(int i=0;i<liste1.size();i++) {
			System.out.println(liste1.get(i).toString()+liste.get(i).seDeplacer()+" et la valeure de propriete est :"+liste1.get(i).calculer());
		}
		
	}

}
