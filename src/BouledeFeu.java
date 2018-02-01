import java.util.Random;

public class BouledeFeu extends Sort {
    Random random = new Random();
    public BouledeFeu(){
        this.nom = "boule de feu";
        this.cout = 5;
    }

    public void lancerSort(Personnage _perso) {
        _perso.setPv(5 + random.nextInt(10 - 6 + 1) + 6);
    }
}
