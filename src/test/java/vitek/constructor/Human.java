package vitek.constructor;

public class Human {
    private int age;
    private String name;
    private int newAge;
    private String newName;


    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNewAge() {
        return newAge;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewAge(int newAge) {
        this.newAge = newAge;
    }

    public void setNewName(String newName) {
        this.newName = newName;

    }

    public static void main(String[] args) {
        Human serega = new Human("Serega");
        Human vitek = new Human("Vitek", 26);

        System.out.println(serega.getName());
        System.out.println(vitek.getName() + " " + vitek.getAge());

        vitek.setNewAge(serega.getAge());
        vitek.setNewName(serega.getName());

        serega.setName(vitek.getName());
        serega.setAge(vitek.getAge());


        System.out.println(serega.getName() + " " + serega.getAge());
        System.out.println(vitek.getNewName() + " ");
    }

//    @Override
//    public String toString() {
//        return age <= 0
//                ? String.format("Наш типосик: %s", this.name)
//                : String.format("Наш типосик: %s %d", this.name+" ", this.age);
//    }
}