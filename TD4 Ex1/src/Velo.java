
public class Velo extends Vehicule{
	public Velo(String marque) {
		this.marque=marque;
	}
	public String seDeplacer() {
		return " Je pedale";
		}
	public String toString() {
		return super.toString()+"de type Velo et de marque "+marque;
	}
}
