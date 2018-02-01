public abstract class Personnage {
    protected int pv, pd;
    protected String nom;

    public abstract void attack(Personnage _persoQuiEstAttaque);

    public int getPd(){return this.pd;}
    public int getPv(){return this.pv;}

    public void setPv(int _vieDeVie){this.pv -= _vieDeVie;}

}
