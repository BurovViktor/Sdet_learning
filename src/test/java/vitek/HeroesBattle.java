package vitek;

public class HeroesBattle {


    public static void main(String[] args) {
        Heroes vitekUnding = new Heroes("Витек", 720, 290, 72);
        Heroes seregaWindRunner = new Heroes("Серега", 600, 340, 20);

        vitekUnding.attack(seregaWindRunner);
        seregaWindRunner.attack(vitekUnding);

        vitekUnding.ultimate();
        vitekUnding.incrementCounter();
        seregaWindRunner.ultimate();

        vitekUnding.attack(seregaWindRunner);
        seregaWindRunner.attack(vitekUnding);

    }
}