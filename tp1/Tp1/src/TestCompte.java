
public class TestCompte {

	public static void main(String[] args) {
		Client c1=new Client("Amri","Aymen");
		c1.ouvrir_compte();
		c1.ouvrir_compte();
		c1.ouvrir_compte();
		c1.ouvrir_compte();
		c1.deposer("1", 1500);
		c1.deposer("2", 2000);
		c1.deposer("3", 2500);
		c1.deposer("4", 3000);
		System.out.println(c1.verif("5"));
		System.out.println(c1.verif("2"));
		c1.fermer_compte("1");
		c1.retirer("2", 500);
		c1.retirer("3",1000);
		c1.afficher();
		
	}

}
