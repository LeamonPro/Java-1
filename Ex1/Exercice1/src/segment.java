public class segment {
    private point ext1;
    private point ext2;
    public segment(point ext1,point ext2){
        this.ext1=ext1;
        this.ext2=ext2;
    }
    public void deplacerExt1(point p){
        ext1.deplacer(p.getAbscisse(),p.getOrdonnee());
    }
    public void deplacerExt2(point p){
        ext2.deplacer(p.getAbscisse(), p.getOrdonnee());
    }
    public double longeur(){
        return Math.sqrt(Math.pow(ext2.getAbscisse()-ext1.getAbscisse(),2)+Math.pow(ext2.getOrdonnee()-ext1.getOrdonnee(),2));
    }
    public void affiche(){
        ext1.affiche();
        ext2.affiche();
        System.out.format("la longuer du segment est :%.2f",longeur());

    }
    
}
