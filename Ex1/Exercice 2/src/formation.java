public class formation {
    private String nom;
    private enseignant ens;
    public formation(String nom,enseignant ens){
        this.nom=nom;
        this.ens=ens;
    }
    public String getNom(){
        return nom;
    }
    public enseignant getEns(){
        return ens;
    }
    public void setEns(enseignant ens){
        this.ens=ens;
    }
    public void affiche(){
        System.out.println("Formation:"+nom);
        ens.affiche();
    }
}
