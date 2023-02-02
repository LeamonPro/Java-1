package tp4;

// on va faire le class Employee un classe abstrait car il contient des méthodes abstraites
abstract class Employe {
	private String nom, prenom, date;
	private int age;

	public Employe(String nom, String prenom, int age, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

	public abstract String getTitre();// on a fait cette méthode abstraite car chaque Employe a son propre titre donc
										// la méthode ne retourne pas toujours la meme chaine

	public String getNom() {
		return getTitre() + nom + " " + prenom;
	};

	public abstract float calculerSalaire();// cette methode va retourner le salaire d'un employée selon son titre donc
											// le traitement fait au ker de la méthode va changé alors on l'a fait
											// abstraite
}
