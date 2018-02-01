import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int tour = 0, persoAttack = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Personnage[] tabPerso = new Personnage[2];

        System.out.print("Bienvenue dans RPG Simulator!\n");
        for(int i = 0; i < tabPerso.length; i++)
        {
            System.out.print("\nVeuillez choisir le personnage #" + (i+1) + "\n" +
                    "\t1. Barbare\n" +
                    "\t2. Paladin\n" +
                    "\t3. Magicien noir\n" +
                    "\t4. Magicien rouge\n" +
                    "Votre choix : ");

            switch (sc.nextInt())
            {
                case 1:
                    tabPerso[i] = new Barbare();
                    break;
                case 2:
                    tabPerso[i] = new Paladin();
                    break;
                case 3:
                    tabPerso[i] = new MagicienNoir();
                    break;
                case 4:
                    tabPerso[i] = new MagicienRouge();
                    break;
                default:
                    tabPerso[i] = new Barbare();
                    break;
            }

        }
        tour = random.nextInt(1);
        do{
            switch (tour)
            {
                case 0:
                    tour = 1;
                    persoAttack = 0;
                    break;
                case 1:
                    tour = 0;
                    persoAttack = 1;
                    break;
                    default:break;
            }
            System.out.print("\nLe " + tabPerso[tour].getNom() + " attaque !\n");
            tabPerso[tour].attack(tabPerso[persoAttack]);

        }while(!tabPerso[persoAttack].getMort());

    }
}
