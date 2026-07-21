package krasnayaPahra.ui.pageObjects.pages;

import com.codeborne.selenide.SelenideElement;
import krasnayaPahra.ui.pageObjects.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class NomeraBusinessPage extends BasePage {
    private static final String MANE_ELEMENT = "//main[@id='content']";
    private static final String BOOKING_ELEMENT=".//input[@name='name']";

    @Override
    public SelenideElement getMainElement() {
        return $x(MANE_ELEMENT);
    }

    public SelenideElement getBookingElement(){
        return getMainElement().$x(BOOKING_ELEMENT);
    }

}

