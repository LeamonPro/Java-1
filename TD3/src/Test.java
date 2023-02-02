import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employe> liste=new ArrayList<Employe>();
		liste.add(new Vacataire("Ali",200,3.9f));
		liste.add(new Contractuel("Salah",900f));
		liste.add(new Permanent("Mohamed",1100f,150f));
		for(int i=0;i<liste.size();i++)
			System.out.println(liste.get(i));
		for(int i=0;i<liste.size();i++) {
			if (liste.get(i) instanceof Vacataire)
				((Vacataire)liste.get(i)).setprixHeure(4.1f);
			else if(liste.get(i) instanceof Permanent)
				((Permanent)liste.get(i)).setPrime(230);
			else 
				((Contractuel)liste.get(i)).setsalaireBase(1000);
		}
		for(int i=0;i<liste.size();i++)
			System.out.println(liste.get(i));
	}

}
