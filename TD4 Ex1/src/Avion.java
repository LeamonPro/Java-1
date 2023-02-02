
public class Avion extends Vehicule implements Motorise {
	public Avion(String marque) {
		this.marque=marque;
	}
	public String seDeplacer() {
		return " Je vole";
	}
	public String toString() {
		return super.toString()+"de type Avion et de marque "+marque;
	}
	public double calculer() {
		return prop*15;
	}

}
