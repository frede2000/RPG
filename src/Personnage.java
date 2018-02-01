public abstract class Personnage {
    protected int pv, pd;
    protected String nom;
    protected boolean mort;

    public abstract void attack(Personnage _persoQuiEstAttaque);

    public int getPd(){return this.pd;}
    public int getPv(){return this.pv;}
    public String getNom(){return this.nom;}
    public boolean getMort(){return this.mort;}

    public void setPv(int _vieDeVie){this.pv -= _vieDeVie;}
    public void setMort(boolean _mort){this.mort = _mort;}

}
