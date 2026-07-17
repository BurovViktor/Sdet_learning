package krasnayaPahra.ui.pageObjects.pages;

import com.codeborne.selenide.SelenideElement;
import krasnayaPahra.ui.pageObjects.BasePage;

import static com.codeborne.selenide.Selenide.$x;


public class MainPage extends BasePage {

    private static final String MANE_ELEMENT = "//div[@class='slick-list draggable']";
    private static final String BOOKING_IFRAME_ELEMENT = "booking-search-frame";

    @Override
    public SelenideElement getMainElement() {
        return $x(MANE_ELEMENT);
    }

    public String getBookingIFrameElement() {
        return BOOKING_IFRAME_ELEMENT;
    }
}
