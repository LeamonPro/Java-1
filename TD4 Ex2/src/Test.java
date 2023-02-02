
public class Test {

	public static void main(String[] args) {
		Reel a = new Reel(5.0);
		Reel b = new Reel(6.0);
		Reel c = (Reel) a.plus(b);
		System.out.println(c.affiche());
		Complexe z1 = new Complexe(1, 2);
		Complexe z2 = new Complexe(3, 4);
		Complexe z = (Complexe) z1.plus(z2);
		System.out.println(z.affiche());

	}

}
