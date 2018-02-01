public abstract class Guerrier extends Personnage {
    protected int pForce;

    public Guerrier(){

    }


    public void attack(Personnage _persoQuiEstAttaque) {
        _persoQuiEstAttaque.setPv((this.pForce*2)-_persoQuiEstAttaque.getPd());
    }
}
