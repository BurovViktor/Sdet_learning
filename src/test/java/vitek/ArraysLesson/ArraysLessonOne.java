package vitek.ArraysLesson;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysLessonOne {
    @Test
    void main() {
        int[] intArray = new int[10];

        if (intArray.length == 10) {
            intArray[0] = 420;
        } else {
            System.out.println("Не могу добавить значение в массив");
        }
        System.out.println(intArray[0]);
    }

    @Test
    void pohui() {
        int one = 1;
        String oneString = String.valueOf(one);
        int againIntOne = Integer.parseInt(oneString);

        System.out.println(againIntOne);
    }
}