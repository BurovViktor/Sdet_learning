package krasnayaPahra.ui.pageObjects.popups.mainPageHeader;

import com.codeborne.selenide.SelenideElement;
import krasnayaPahra.ui.pageObjects.BasePage;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.prompt;

public class NavigationHeaderPanel extends BasePage {

    private static final String MAIN_ELEMENT = "//div[@id='navBar']";
    private static final String PRICE_ELEMENT = ".//a[@title='Цены']";
    private static final String RESTORAN_ELEMENT = ".//a[@href='/restorani_i_bari']";
    private static final String RECOVERY_ELEMENT = ".//a[@id='sub-ozdorovlenie']";
    private static final String CHILDS_ELEMENT = ".//a[@id='sub-detyam']";
    private static final String SERVICES_ELEMENT = "//a[@id='sub-uslugi']";
    private static final String NUMBER_ELEMENT = ".//a[@id='sub-nomera']";
    private static final String HOW_TO_GET_THERE_ELEMENT = ".//a[@title='Как проехать в отель']";

    @Override
    public SelenideElement getMainElement() {
        return $x(MAIN_ELEMENT);
    }

    public SelenideElement getPriceElement() {
        return getMainElement().$x(PRICE_ELEMENT);
    }

    public SelenideElement getRestaurantElement() {
        return getMainElement().$x(RESTORAN_ELEMENT);
    }

    public SelenideElement getRecoverElement() {
        return getMainElement().$x(RECOVERY_ELEMENT);
    }

    public SelenideElement getChildElement() {
        return getMainElement().$x(CHILDS_ELEMENT);
    }

    public SelenideElement getServicesElement() {
        return getMainElement().$x(SERVICES_ELEMENT);
    }

    public SelenideElement getNumberElement(){
        return getMainElement().$x(NUMBER_ELEMENT);
    }

    public SelenideElement getHowToGetThereElemnt(){
        return getMainElement().$x(HOW_TO_GET_THERE_ELEMENT);
    }
}
