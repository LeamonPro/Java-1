package tp4;
//on a faire un h�ritage d'un class abstrait donc on doit redefinir tous les m�thodes abstraites
public class Production extends Employe {
	private int nbu;
	public Production (String nom,String prenom,int age,String date ,int nbu) {
		super(nom,prenom,age,date);
		this.nbu=nbu;
	}
	public String getTitre() {
		return "Production";
	}

    public int getNbu() {
        return nbu;
    }

    public void setNbu(int nbu) {
        this.nbu = nbu;
    }
    public float calculerSalaire() {
        return nbu*5;
    }
}
