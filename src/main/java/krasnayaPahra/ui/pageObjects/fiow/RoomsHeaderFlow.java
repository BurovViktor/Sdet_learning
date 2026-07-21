package krasnayaPahra.ui.pageObjects.fiow;

import krasnayaPahra.ui.pageObjects.BaseFlow;
import krasnayaPahra.ui.pageObjects.popups.mainPageHeader.RoomsHeaderPopup;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;

public class RoomsHeaderFlow implements BaseFlow {

    RoomsHeaderPopup roomsHeaderPopup = new RoomsHeaderPopup();

    @DisplayName("Нажать на кнопку Бизнес")
    public void clickBusiness() {
        roomsHeaderPopup.getBusinessPopup()
                .shouldBe()
                .click();
    }
}
