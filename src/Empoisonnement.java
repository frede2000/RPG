public class Empoisonnement extends Sort {
    protected int nmbFoisAtt;

    public Empoisonnement(){
        this.nom = "Empoisonnement";
        this.cout = 2;
        this.nmbFoisAtt = 0;
    }

    public void lancerSort(Personnage _perso) {
        this.nmbFoisAtt++;
        _perso.setPv(2*this.nmbFoisAtt);
    }
}
