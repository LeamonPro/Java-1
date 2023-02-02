
public class Complexe extends Affichage implements Operation {
	private double im, re;

	public Complexe(double im, double re) {
		this.re = re;
		this.im = im;

	}

	public String affiche() {
		return "Re=" + re + " imm=" + im;
	}

	public Object plus(Object a) {
		return new Complexe(re + ((Complexe) a).re, im + ((Complexe) a).im);
	}

	public Object moins(Object a) {
		return new Complexe(re - ((Complexe) a).re, im - ((Complexe) a).im);
	}

}
