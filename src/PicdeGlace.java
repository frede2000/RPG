public class PicdeGlace extends Sort {
    public PicdeGlace(){
        this.nom = "pic de glace";
        this.cout = 5;
    }


    public void lancerSort(Personnage _perso) {
        _perso.setPv(7-_perso.getPd());
    }
}
