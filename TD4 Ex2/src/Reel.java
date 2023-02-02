
public class Reel extends Affichage implements Operation {
	private double x;

	public Reel(double x) {
		this.x = x;
	}

	public String affiche() {
		return "la valeure est:" + x;
	}

	public Object plus(Object a) {
		return new Reel(x + ((Reel) a).x);
	}

	public Object moins(Object b) {
		return new Reel(x - ((Reel) b).x);
	}

}
