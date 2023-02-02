package tp4;

public class Test {

	public static void main(String[] args) {
		Personnel p=new Personnel();
		p.ajouterEmploye(new Vente ("Pierre","Business",45,"1995",30000));
        p.ajouterEmploye(new Representant("Léon","Vendtout",25,"2001",20000));
        p.ajouterEmploye(new Production("Yves","Bosseur",32,"1998",1000));
        p.ajouterEmploye(new Manutention("Jeanne","Stocketout",32,"1998",45));
        p.ajouterEmploye(new ProdRisque("Jean","Flippe",28,"2000",1000));
        p.ajouterEmploye(new ManuRisque("Al","Abordage",30,"2001",45));
        p.affichersalaire();
        System.out.println("le salaire moyen est "+p.salairemoyen());
        p.afficheEmploye();

	}

}
