public abstract class Guerrier extends Personnage {
    protected int pForce, degat;

    public Guerrier(){
        this.mort = false;
    }


    public void attack(Personnage _persoQuiEstAttaque) {
        this.degat = _persoQuiEstAttaque.getPv();
        _persoQuiEstAttaque.setPv((this.pForce*2)-_persoQuiEstAttaque.getPd());
        this.degat -= _persoQuiEstAttaque.getPv();
        System.out.print("Le " + _persoQuiEstAttaque.getNom() + " perd " + degat + " points de vie.");
        if(_persoQuiEstAttaque.getPv() <= 0)
        {
            _persoQuiEstAttaque.setMort(true);
            System.out.print(" Il lui en reste 0.\n\n Le " + _persoQuiEstAttaque.getNom() + " est mort, le " + this.nom + " a gagné !");
        }
        else
        {
            System.out.print(" Il lui en reste " + _persoQuiEstAttaque.getPv() + ".\n");
        }
    }
}
