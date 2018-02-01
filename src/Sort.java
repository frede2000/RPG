public abstract class Sort {
    protected String nom;
    protected int cout;

    public abstract void lancerSort(Personnage _perso);

    public int getCout(){return this.cout;}
    public String getNom(){return this.nom;}
}
