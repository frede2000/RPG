import java.util.Random;

public class PicdeGlace extends Sort {
    Random random = new Random();
    public PicdeGlace(){
        this.nom = "pic de glace";
        this.cout = 5;
    }


    public void lancerSort(Personnage _perso) {
        _perso.setPv(7 - _perso.getPd() + random.nextInt(8 - 5 + 1 ) + 5);
    }
}
