package vitek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseLessonFiveTest {
    static String name;
    static int age;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        name = bufferedReader.readLine();
        age = Integer.parseInt(bufferedReader.readLine());
        if(name.equals("Витек") && age==26){
            System.out.println("Это Витек");
        }else if(name.equals("Серега")&& age==31){
            System.out.println("Это Серега");
        }else if (age==26){
            System.out.println("Возможно Это Витёк");
        }else if (age==31){
            System.out.println("Возможно это Серёега");
        }else  {
            System.out.println("Пошел на хуй");
        }
    }
}
