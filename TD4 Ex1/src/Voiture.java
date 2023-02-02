
class Voiture extends Vehicule implements Motorise {
	public Voiture(String marque) {
		this.marque=marque;
	}
	public String seDeplacer() {
		return " Je roule";
	}
	public String toString() {
		return super.toString()+"de type Voiture et de marque "+marque;
	}
	public double calculer() {
		return 2*prop;
	}
	
	

}
