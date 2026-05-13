package vitek;

import org.junit.jupiter.api.Test;

public class ifelselessonthree {
   final String name = new String("Серёга");
        @Test
        void padla(){
            if(name.equals("Витёк")) {
                System.out.println("Витёк");
            }else if(name.equals("Серёга")){
                System.out.println("Серёга");
            }else {
                System.out.println("Пошел на хуй");
            }

    }
}
