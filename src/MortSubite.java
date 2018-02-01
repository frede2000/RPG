import java.util.Random;

public class MortSubite extends Sort{
    Random random = new Random();
    public MortSubite(){
        this.nom = "mort subite";
        this.cout = 10;
    }

    public void lancerSort(Personnage _perso){
        if(random.nextInt(10) == 4)
        {
            _perso.setPv(_perso.pv);
        }
    }
}
