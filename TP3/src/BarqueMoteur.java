
public class BarqueMoteur extends Barque{
		private int puiss;
		public BarqueMoteur(String nom,String num,int puiss) {
			super(nom,num);
			this.puiss=puiss;
		}
		public int getPuissance() {
			return puiss;
		}
		public String toString() {
			return super.toString()+"\tPuissance :"+puiss;
		}
		
	}

