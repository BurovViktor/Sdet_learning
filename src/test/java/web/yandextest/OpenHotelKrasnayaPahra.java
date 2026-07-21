package web.yandextest;

import krasnayaPahra.ui.pageObjects.fiow.MainPageFlow;
import krasnayaPahra.ui.pageObjects.fiow.RestaurantHeaderFlow;
import krasnayaPahra.ui.pageObjects.fiow.RoomsHeaderFlow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;


public class OpenHotelKrasnayaPahra {

    private MainPageFlow mainPageFlow;


    @BeforeEach
    void setUp() {
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
    void hoverOnNavigationPanel() {
        mainPageFlow.atNavigationFlow()
                .hoverOnPrices();
        mainPageFlow.atNavigationFlow().waitSec(3);

        mainPageFlow.atNavigationFlow().
                hoverOnRestaurants();
        mainPageFlow.atNavigationFlow().waitSec(3);
    }

    @Test
    void hoverOnRestaurantPanel() {
        mainPageFlow.atNavigationFlow().hoverOnRestaurants();
        mainPageFlow.atNavigationFlow()
                .atRestaurantHeaderFlow()
                .clickRestaurant();
        //   System.out.println("...");
    }

    @Test
    void hoverOnLobbyBar() {
        mainPageFlow.atNavigationFlow().hoverOnRestaurants();
        mainPageFlow.atNavigationFlow()
                .atRestaurantHeaderFlow()
                .clickLobbyBar();

    }

    @Test
    void hoverOnStudio() {
        mainPageFlow.atNavigationFlow().hoverOnRooms();
        mainPageFlow.atNavigationFlow()
                .atRoomsHeaderFlow()
                .clickBusiness();
    }

    @Test
    void scrollBusiness() {
        mainPageFlow.atNavigationFlow().hoverOnRooms();
        mainPageFlow.atNavigationFlow()
                .atRoomsHeaderFlow()
                .clickBusiness();
        mainPageFlow.atBusinessHeaderFlow().scroll();

    //    System.out.println("...");
    }
    @Test
    void writeFoolNameInBooking() {
        mainPageFlow.atNavigationFlow().hoverOnRestaurants();
        mainPageFlow.atNavigationFlow()
                .atRestaurantHeaderFlow()
                .clickLobbyBar();
        mainPageFlow.atNomeraBusinessFlow().fullNameInBooking();

        System.out.println("...");

    }
}

