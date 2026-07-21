package krasnayaPahra.ui.pageObjects.popups.mainPageHeader;

import com.codeborne.selenide.SelenideElement;
import krasnayaPahra.ui.pageObjects.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class RestaurantHeaderPopup extends BasePage {

    private static final String MAIN_ELEMENT_RESTAURANT="//div[@aria-labelledby='sub-restorani_i_bari']";
    private static final String RESTAURANT_POPUP = ".//a[@title='Ресторан']";
    private static final String LOBBY_BAR_POPUP=".//a[@title='Лобби-бар']";

    @Override
    public SelenideElement getMainElement() {
        return $x(MAIN_ELEMENT_RESTAURANT);
    }
    public SelenideElement getRestaurantSelector() {
        return getMainElement().$x(RESTAURANT_POPUP);
    }
    public SelenideElement getLobbyBarSelector(){
        return getMainElement().$x(LOBBY_BAR_POPUP);
    }




}
