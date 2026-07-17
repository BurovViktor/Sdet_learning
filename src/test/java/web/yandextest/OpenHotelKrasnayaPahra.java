package web.yandextest;

import krasnayaPahra.ui.pageObjects.fiow.MainPageFlow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class OpenHotelKrasnayaPahra {

    private MainPageFlow mainPageFlow;

    @BeforeEach
    void setUp(){
        mainPageFlow = new MainPageFlow();

        mainPageFlow.openMainPageInBrowser();
        mainPageFlow.mainPageIsLoaded();
    }

    @Test
    public void openUrlHotelKrasnayaPahra() {
        mainPageFlow
                .atNavigationFlow()
                .hoverOnPrices();
        mainPageFlow.atNavigationFlow().waitSec(3);

        mainPageFlow.atNavigationFlow().hoverOnRestaurants();
        mainPageFlow.atNavigationFlow().waitSec(1);

        mainPageFlow.atNavigationFlow().clickOnPrices();

        mainPageFlow.switchToBookingIframe();
    }
    @Test
    void hoverOnNavigationPanel(){
        mainPageFlow.atNavigationFlow()
                .hoverOnPrices();
        mainPageFlow.atNavigationFlow().waitSec(3);

        mainPageFlow.atNavigationFlow().
                hoverOnRestaurants();
        mainPageFlow.atNavigationFlow().waitSec(3);
    }
}
