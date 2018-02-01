public class MagicienRouge extends Magicien {

    public MagicienRouge(){
        this.pMagie = 40;
        this.tabSort[0] = new Empoisonnement();
        this.tabSort[1] = new MortSubite();
        this.nom = "magicien rouge";
    }
}
