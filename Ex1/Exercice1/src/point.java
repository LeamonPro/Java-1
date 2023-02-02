public class point {
    private float abs;
    private float ord;
    public point(float abs,float ord){
        this.abs=abs;
        this.ord=ord;
    }
    public float getAbscisse(){
        return abs ;
    }
    public float getOrdonnee(){
        return ord;
    }
    public void deplacer(float dx,float dy){
        abs+=dx;
        ord+=dy;
    }
    public void affiche(){
        System.out.println("("+abs+","+ord+")");
    }
    public boolean coincide(point p){
        if ((p.abs==this.abs) && (p.ord==this.ord)) //tu peux enlever this.ord
            return true;
        return false ;
    }
}
