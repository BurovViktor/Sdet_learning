package vitek;

public class Heroes {

    private int damage;
    private int mana;
    private String name;
    private int hp;
    private int enemyHp;

    public static int counter = 60;

    public Heroes(String name, int hp, int mana, int damage) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.damage = damage;

        counter--;
        System.out.println(counter);
    }

    public int getHp() {
        return hp;
    }

    public void ultimate() {
        if (counter == 57) {
            this.damage = 1000000;
        } else if (counter <= 56) {
            damage = 0;
        }

    }

    public void attack(Heroes hero) {
        this.enemyHp = hero.getHp() - damage;

        if(this.enemyHp<=0){
            System.out.println("Ты проиграл!"+hero.name);
        }
        System.out.println(enemyHp);
        counter--;
    }

    public void incrementCounter(){
        counter++;
    }
    public void decincrementCounter(){
        counter--;
    }
}
