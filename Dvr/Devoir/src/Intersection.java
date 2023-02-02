
public class Intersection {
	private String nom;
	private Vehicules[] TVehicules;
	private int nb;

	public Intersection(String nom) {
		this.nom = nom;
		TVehicules = new Vehicules[100];
		nb = 0;
	}

	public void entreeVehicule(Vehicules v) {
		TVehicules[nb] = v;
		nb++;
	}

	public void sortieVehicule(Vehicules v) {
		for (int i = 0; i < nb; i++) {
			if (TVehicules[i].getMat().equals(v.getMat())) {
				for (int j = i; j < nb - 1; j++)
					TVehicules[j] = TVehicules[j + 1];
				nb--;
			}
		}
	}

	public void sortieVehicule(String imat) {
		for (int i = 0; i < nb; i++) {
			if (TVehicules[i].getMat() == imat) {
				for (int j = i; j < nb - 1; j++)
					TVehicules[j] = TVehicules[j + 1];
				nb--;
			}
		}
	}

	public static void accident(Intersection a) {
		for (int i = 0; i < a.nb; i++) {
			for (int j = i; j < a.nb; j++) {
				if ((a.TVehicules[i].getVitesse() != 0) && (a.TVehicules[j].getVitesse() != 0)
						&& (a.TVehicules[i].getDirection() != a.TVehicules[j].getDirection())) {
					System.out.println("Les vehicules " + a.TVehicules[i].getMat() + "et  " + a.TVehicules[j].getMat()
							+ " de l'intersection " + a.nom + " risquent d'entrent en collision");
					if (a.TVehicules[i].getVitesse() > 50)
						a.TVehicules[i].setVitesse(50);
					if (a.TVehicules[j].getVitesse() > 50)
						a.TVehicules[j].setVitesse(50);
				}
			}
		}

	}

	public void affiche() {
		if (nb == 0)
			System.out.println("Pas de vehicule dans l'intersection "+nom);
		else {
			for (int i = 0; i < nb; i++) {
				TVehicules[i].affiche();
			}
		}
	}

}
