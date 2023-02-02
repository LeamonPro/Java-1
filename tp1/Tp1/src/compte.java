
public class compte {
	static int y=0;
	private String num;
	private float solde;
	public void crediter(float x) {
		solde+=x;
	}
	public void debiter(float x) {
			solde-=x;
	}
	public float getSolde() {
		return solde;
	}
	public compte() {
		y++;
		num=String.valueOf(y);
		solde=0;
	}
	public void affiche() {
		System.out.println("\t\tCompte num "+num+" a comme solde "+solde+"DT");
		
	}
	public boolean verif(String x) {
		return num.equals(x);
		
	}
	
}
