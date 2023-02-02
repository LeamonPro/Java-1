
public class Test {

	public static void main(String[] args) {
		try {
			Temps T = new Temps(21, 40, 500); 

		}catch(TempsException e)
		{
			e.printStackTrace();
		}
		//on a fait l'instantiation du T dans un bloc try catch pourque lorsque on remarque une exception de typeTempException on le declanche et on affiche ses details par la commande printStackTrace

}
}
