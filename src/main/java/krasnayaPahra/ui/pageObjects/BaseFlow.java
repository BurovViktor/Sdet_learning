package krasnayaPahra.ui.pageObjects;

import org.junit.jupiter.api.DisplayName;

public interface BaseFlow {

    @DisplayName("Ждать {secs}с")
    default void waitSec(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
