
public class Test {

	public static void main(String[] args) {
		Intersection i1 = new Intersection("a");
		Intersection i2 = new Intersection("b");
		Vehicules v1 = new Vehicules("111", 70, 'N');
		Vehicules v2 = new Vehicules("150", 60, 'S');
		i1.entreeVehicule(v2);
		i1.entreeVehicule(v1);
		Intersection.accident(i1);
		i1.affiche();
		i1.sortieVehicule(v1);
		i2.entreeVehicule(v1);
		i1.sortieVehicule(v2.getMat());
		i2.entreeVehicule(v2);
		Intersection.accident(i2);
		i1.affiche();

	}

}
