package vitek;


import org.junit.jupiter.api.Test;

public class ifelselessontwo {
    protected int age = 31;

    @Test
    void main() {
        if (age == 26) {
            System.out.println("Это Витек");
        }
        else if(age == 31) {
            System.out.println("Это Серега");
        }
        else {
            System.out.println("Ты хуй");
        }
    }
}