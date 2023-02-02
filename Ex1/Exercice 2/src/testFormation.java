import java.util.Scanner;
public class testFormation {
    public static void main(String [] args){
    	 Scanner keyb =new Scanner(System.in);
    	 System.out.println("Donner le nom et la specialite de e1");
        enseignant e1=new enseignant(keyb.next(),keyb.next());
        System.out.println("Donner le nom et la specialite de e2");
        enseignant e2=new enseignant(keyb.next(),keyb.next());
        System.out.println("Donner le nom de la formation");
        formation f=new formation(keyb.next(),e1);
        System.out.println("donner le nom et la specialite du participant");
        participant p=new participant(keyb.next(),e2.getSpecialite());
        p.affecterFormation(f);
        p.affiche();
        f.setEns(e2);
        p.affecterFormation(f);
        p.affiche();
        keyb.close();
    }
    
}
