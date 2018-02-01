public class BouledeFeu extends Sort {
    public BouledeFeu(){
        this.nom = "boule de feu";
        this.cout = 5;
    }

    public void lancerSort(Personnage _perso) {
        _perso.setPv(5);
    }
}
