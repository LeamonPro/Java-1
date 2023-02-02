
public class Test {

	public static void main(String[] args) {
		Port p=new Port("Marsa",300	,100f);
		BarqueMoteur b1=new BarqueMoteur("Hannibal","2",6);
		Barque b2=new Barque("Cercina","1");
		BarqueMoteur b3=new BarqueMoteur("Rose","3",4);
		Barque b4=new Barque("Ellisa","4");
		p.entreBarque(b1);
		p.entreBarque(b2);
		p.entreBarque(b3);
		p.entreBarque(b4);
		p.sortieBarque(b4);
		System.out.println(p.toString());

	}

}
