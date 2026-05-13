package vitek;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseLessonSix {
    String name = "Ж";

    @Test
    void main() throws IOException {
        BufferedReader klava = new BufferedReader(new InputStreamReader(System.in));
        String console = klava.readLine();
        System.out.println(console);
    }
}
