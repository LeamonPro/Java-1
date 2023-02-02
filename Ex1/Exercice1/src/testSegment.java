import java.util.Scanner;

public class testSegment {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		System.out.println("donner les coordonnes de premier point");
		float x = keyb.nextFloat();
		float y = keyb.nextFloat();
		point p1 = new point(x,y);
		point p2;
		do {
		System.out.println("donner les coordonnes de deuxieme point");
		float x1 = keyb.nextFloat();
		float y1 = keyb.nextFloat();
		p2 = new point(x1,y1);
		}while(p1.coincide(p2));
		segment s = new segment(p1, p2);
		s.affiche();
		System.out.println("Donner les pas de deplacement de la premiere extremite");
		float x2 = keyb.nextFloat();
		float y2 = keyb.nextFloat();
		point p3 = new point(x2, y2);
		System.out.println("Donner les pas de deplacement de la deuxieme extremite");
		float x3 = keyb.nextFloat();
		float y3 = keyb.nextFloat();
		point p4 = new point(x3, y3);
		s.deplacerExt1(p3);
		s.deplacerExt2(p4);
		s.affiche();
	}
}