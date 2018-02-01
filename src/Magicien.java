import java.util.Random;

public abstract class Magicien extends Personnage {
    Random random = new Random();
    protected int pMagie, sortRD, degat;
    protected Sort[] tabSort = new Sort[2];

    public Magicien(){
        this.pd = 1;
        this.pv = 60;
        this.mort = false;
    }

    public void attack(Personnage _persoQuiEstAttaque) {
        this.sortRD = random.nextInt(2);
        if(this.pMagie >= tabSort[sortRD].getCout())
        {
            this.degat = _persoQuiEstAttaque.getPv();
            tabSort[sortRD].lancerSort(_persoQuiEstAttaque);
            this.degat -= _persoQuiEstAttaque.getPv();
            this.pMagie -= tabSort[sortRD].cout;
            System.out.print("Le " + this.nom + " utilise " + tabSort[sortRD].getNom() + ", ce qui lui coûte " + tabSort[sortRD].getCout() + " points de magie.\n" +
                    "Il lui reste " + this.pMagie + " points de magie.\n" +
                    "Le "+ _persoQuiEstAttaque.getNom() +" perd " + degat + " points de vie.");
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
        else
        {
            _persoQuiEstAttaque.setMort(true);
            System.out.print("Le " + this.nom + " n'a plus de point de magie.\n\nPartie nulle !");
        }
    }
}
