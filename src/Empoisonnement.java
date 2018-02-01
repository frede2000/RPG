import java.util.Random;

public class Empoisonnement extends Sort {
    protected int nmbFoisAtt;
    Random random = new Random();
    public Empoisonnement(){
        this.nom = "Empoisonnement";
        this.cout = 2;
        this.nmbFoisAtt = 0;
    }

    public void lancerSort(Personnage _perso) {
        this.nmbFoisAtt++;
        _perso.setPv((random.nextInt(3 - 1 + 1) + 1)*this.nmbFoisAtt);
    }
}
