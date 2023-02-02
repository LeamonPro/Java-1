package ex;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.println("Donner le nom et le nombre maximal des employer du service");
		Service s1 = new Service(keyb.next(), keyb.nextInt());
		System.out.println("Donner le nom et le nombre maximal des employer du service");
		Service s2 = new Service(keyb.next(), keyb.nextInt());
		System.out.println("Donner le nom et le salaire du employe");
		Employe e1 = new Employe(keyb.next(), keyb.nextFloat());
		System.out.println("Donner le nom et le salaire du employe");
		Employe e2 = new Employe(keyb.next(), keyb.nextFloat());
		System.out.println("Donner le nom et le salaire du employe");
		Employe e3 = new Employe(keyb.next(), keyb.nextFloat());
		System.out.println("Donner le nom et le salaire du employe");
		Employe e4 = new Employe(keyb.next(), keyb.nextFloat());
		keyb.close();
		s1.affecterEmp(e1);
		s1.affecterEmp(e2);
		s2.affecterEmp(e4);
		s2.affecterEmp(e3);
		s1.setChef(e1);
		s2.setChef(e3);
		s1.affiche();
		s2.affiche();
		s1.eliminerEmp(e2);
		s2.eliminerEmp(e4);
		s1.affecterEmp(e4);
		s2.affecterEmp(e2);
		s2.setChef(e2);
		e2.augmenterSalaire(0.35f);
		s2.getChef().augmenterSalaire(0.5f);
		s1.augmenterSalaire(0.06f);
		s2.augmenterSalaire(0.06f);
		s1.affiche();
		s2.affiche();

	}

}
