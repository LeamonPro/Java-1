package exercice1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.println("Donner le nom du premier auteur");
		Auteur A1 = new Auteur(keyb.next());
		System.out.println("Donner le nom du deuxieme auteur");
		Auteur A2 = new Auteur(keyb.next());
		System.out.println("Donner le nom du troisieme auteur");
		Auteur A3 = new Auteur(keyb.next());
		System.out.println("Donner le titre du premier livre");
		Livre L1 = new Livre(keyb.next(), new Auteur[] { A1 });

		System.out.println("Donner le titre du deuxieme livre");
		Livre L2 = new Livre(keyb.next(), new Auteur[] { A1, A2 });

		System.out.println("Donner le titre du troisieme livre");
		Livre L3 = new Livre(keyb.next(), new Auteur[] { A2, A3 });
		keyb.close();
		System.out.println("Description du premier auteur du livre 1");
		L1.getPremierAuteur().afficher();
		System.out.println("desc de tous les auteurs du livre 3");
		for (Auteur l : L3.getAuteurs()) {
			l.afficher();
		}
		System.out.println("nom du premier auteur de l1");
		System.out.println(L1.getPremierAuteur().getNom());

	}

}
