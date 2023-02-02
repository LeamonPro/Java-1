
public class Barque {
	private String nom;
	private String num;
	public Barque(String nom,String num) {
		this.nom=nom;
		this.num=num;
	}
	public String getNum() {
		return num;
	}
	public String toString() {
		return "Nom :"+nom+"\tNumero autorisation :"+num;
	}
}
