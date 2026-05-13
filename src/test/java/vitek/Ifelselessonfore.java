package vitek;

import org.junit.jupiter.api.Test;

public class Ifelselessonfore {
    protected static final int curenthour = 20;

    // 1-8 сплю
    //с 9-18 пиздец активен
    //19-0 дотка
    @Test
    void main() {
        System.out.println("Текущий час"+":"+curenthour);
        System.out.println("Мое состояние:");
        if (curenthour >=1 && curenthour <= 8) {
            System.out.println("Сплю");
        } else if (curenthour >= 9 && curenthour <= 18) {
            System.out.println("пиздец активен");
        } else if (curenthour >= 19 || curenthour <=0) {
            System.out.println("дотка");
        } else {
            System.out.println("Пошел на хуй");
        }
    }
}
