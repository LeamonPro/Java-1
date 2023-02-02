
public class Test {

	public static void main(String[] args) {
		Personne t[] = new Personne[2];
		t[0] = new Enseignant("BEN MOHAMED", "FOULEN", "Maitre Assistant");
		t[1] = new Etudiant("BEN FLEN", "FOULEN", 12341234);
		Departement dep = new Departement("IDSD", t);
		System.out.println("Departement :" + dep.getNom());
		System.out.println("Liste des personnes :");
		for (int i = 0; i < dep.getTabPersonne().length; i++) {
			System.out.print("\t" + dep.getTabPersonne()[i].getNom() + ",\t" + dep.getTabPersonne()[i].getPrenom());
			if (dep.getTabPersonne()[i] instanceof Etudiant)
				System.out.println(",\t" + ((Etudiant) dep.getTabPersonne()[i]).getMatricule());
			else
				System.out.println(",\t" + ((Enseignant) dep.getTabPersonne()[i]).getGrade());
		}

	}

}
