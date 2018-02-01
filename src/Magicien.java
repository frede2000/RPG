import java.util.Random;

public abstract class Magicien extends Personnage {
    Random random = new Random();
    protected int pMagie, sortRD;
    protected Sort[] tabSort = new Sort[2];

    public Magicien(){
        this.pd = 1;
        this.pv = 60;
    }

    public void attack(Personnage _persoQuiEstAttaque) {
        this.sortRD = random.nextInt(1);
        if(this.pMagie >= tabSort[sortRD].getCout())
        {
            tabSort[sortRD].lancerSort(_persoQuiEstAttaque);
        }
    }
}
