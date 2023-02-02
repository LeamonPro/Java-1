
public class Vehicules {
	private String mat;
	private int vitesse;
	private char direction;

	public Vehicules(String mat, int vitesse, char direction) {
		this.mat = mat;
		this.vitesse = vitesse;
		this.direction = direction;
	}

	public String getMat() {
		return mat;
	}

	public int getVitesse() {
		return vitesse;
	}

	public char getDirection() {
		return direction;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public void affiche() {
		System.out.println("La voiture de matricule " + mat + " marche a une vitesse de " + vitesse
				+ "km/h dans la direction " + direction);
	}

}
