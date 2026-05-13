package vitek.object;

public class Vitek extends vitek.object.Serega {
    static String name;
    private String surname = "Буров";
    int yearOfBirth;

    public Vitek(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static void main(String[] args) {
        Vitek vitek = new Vitek(1999);
        vitek.object.Serega serega=new vitek.object.Serega();
        vitek.object.Joint joint=new vitek.object.Joint(1,1,1);
        System.out.println(Vitek.name + vitek.yearOfBirth);

        vitek.setSurname("Попов");
        vitek.getSurname();
        System.out.println("_____________");
        System.out.println(marijuanaSum);
        System.out.println("_____________");
        System.out.println(serega.request);
        serega.offer();
        System.out.println("_____________");
        System.out.println(joint.marijuana);
        System.out.println(joint.paper);
        System.out.println(joint.tobacco);
        System.out.println(marijuanaSum);
        setFireTo();
    }
}
