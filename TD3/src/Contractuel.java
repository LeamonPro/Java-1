
public class Contractuel extends Employe {
	protected float salaireBase;

	public Contractuel(String nom, float salaireBase) {
		super(nom);
		this.salaireBase = salaireBase;
	}

	public void setsalaireBase(float salaireBase) {
		this.salaireBase = salaireBase;
	}

	public void calculerSalaire() {
		salaire = salaireBase;
	}

	public String toString() {
		this.calculerSalaire();
		return (super.toString() + ", Salaire: " + salaire);
	}

}
