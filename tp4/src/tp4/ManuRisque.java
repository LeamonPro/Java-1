package tp4;

public class ManuRisque extends Manutention implements aRisque{
    //on peut dire que ce classe faire un h�ritage multiple il a h�rit� de Manutention et aRisque
	public ManuRisque(String nom , String prenom, int age , String date, float nbh) {
        super(nom,prenom,age,date,nbh);
    }
}
