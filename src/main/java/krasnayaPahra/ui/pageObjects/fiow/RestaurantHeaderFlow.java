package krasnayaPahra.ui.pageObjects.fiow;

import krasnayaPahra.ui.pageObjects.BaseFlow;
import krasnayaPahra.ui.pageObjects.popups.mainPageHeader.RestaurantHeaderPopup;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Condition.visible;

public class RestaurantHeaderFlow implements BaseFlow {

   private final RestaurantHeaderPopup headerPopup=new RestaurantHeaderPopup();

   @DisplayName("Нажать на кнопку Ресторан")
    public void clickRestaurant(){
       headerPopup.getRestaurantSelector()
               .shouldBe(visible)
               .click();
   }
   @DisplayName("Нажать на кнопку Лобби-Бар")
    public void clickLobbyBar(){
       headerPopup.getLobbyBarSelector()
               .shouldBe()
               .click();
   }

}
