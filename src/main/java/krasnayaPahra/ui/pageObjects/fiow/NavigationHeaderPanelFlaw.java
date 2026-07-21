package krasnayaPahra.ui.pageObjects.fiow;

import krasnayaPahra.ui.pageObjects.BaseFlow;
import krasnayaPahra.ui.pageObjects.popups.mainPageHeader.NavigationHeaderPanel;
import krasnayaPahra.ui.pageObjects.popups.mainPageHeader.RestaurantHeaderPopup;
import krasnayaPahra.ui.pageObjects.popups.mainPageHeader.RoomsHeaderPopup;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;

public class NavigationHeaderPanelFlaw implements BaseFlow {

    private final NavigationHeaderPanel headerPanel = new NavigationHeaderPanel();


    @DisplayName("Открыта страница навигации")
    public void mainPageLoaded() {
        headerPanel.getMainElement().shouldBe(clickable);
    }

    @DisplayName("Навести на цены")
    public void hoverOnPrices() {
        headerPanel.getPriceElement()
                .shouldBe(visible)
                .hover();
    }

    @DisplayName("Нажать на Сервисы ")
    public void clickOnService() {
        headerPanel.getServicesElement()
                .shouldBe(visible)
                .click();
    }

    @DisplayName("Нажать на цены")
    public void clickOnPrices() {
        headerPanel.getPriceElement()
                .shouldBe(visible)
                .click();
    }

    @DisplayName("Навести на рестораны")
    public void hoverOnRestaurants() {
        headerPanel.getRestaurantElement()
                .shouldBe(visible)
                .hover();
    }
    @DisplayName("Навести на номера")
    public void hoverOnRooms(){
        headerPanel.getRoomsElement()
                .shouldBe()
                .hover();
    }

  public RestaurantHeaderFlow atRestaurantHeaderFlow() {
        return new RestaurantHeaderFlow();
  }
  public RoomsHeaderFlow atRoomsHeaderFlow(){
        return new RoomsHeaderFlow();
  }
  public BusinessHeaderFlow atBusinessHeaderFlow(){
        return new BusinessHeaderFlow();
  }
}
