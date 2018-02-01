public class MagicienNoir extends Magicien {

    public MagicienNoir(){
        this.nom = "magicien noir";
        this.pMagie = 50;
        this.tabSort[0] = new BouledeFeu();
        this.tabSort[1] = new PicdeGlace();
    }
}
