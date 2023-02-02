package tp4;
import java.util.ArrayList;//importation de la bibliothéque qui contient les arrayList

public class Personnel {
	ArrayList<Employe> liste=new ArrayList<>(); //déclaration d'une arrayList
    public void ajouterEmploye(Employe e) {
        liste.add(e); //méthode qui ajouter un element au arrayList

    }
    void affichersalaire() {
        for(int i=0;i<liste.size();i++) //liste.size retourne le taille de la liste  {
            System.out.println(liste.get(i).calculerSalaire()); //liste.get(i) permettre d'acceder au element de rang i
        
    }
    float salairemoyen() {
        float som=0;
        for(int i=0;i<liste.size();i++) {
            som+=liste.get(i).calculerSalaire();
        }
        return som/liste.size();
    }
    public void afficheEmploye() {
    	for(Employe e:liste) 
    		System.out.println(e.getNom());
    		
    }
}

