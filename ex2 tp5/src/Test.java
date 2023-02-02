
public class Test {

	public static void main(String[] args) {
		try {
			Personne P=new Personne("Aymen","A");
		}
		catch (AgeInvalideException  | NomInvalideException e)
		{
			e.printStackTrace();
	}
		}//on a fait l'instantiation du P dans un bloc try catch pourque lorsque on remarque une exception de type NomInvalideException ou AgeInvalideException on le declanche et on affiche ses details par la commande printStackTrace

}
