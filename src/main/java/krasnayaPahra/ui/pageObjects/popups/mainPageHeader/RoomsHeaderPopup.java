package krasnayaPahra.ui.pageObjects.popups.mainPageHeader;

import com.codeborne.selenide.SelenideElement;
import krasnayaPahra.ui.pageObjects.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class RoomsHeaderPopup extends BasePage {

    private static final String MAIN_ELEMENT_ROOMS="//div[@aria-labelledby='sub-nomera']";
    private static final String BUSINESS_POPUP =".//a[@title='Бизнес']";
    private static final String STUDIO_POPUP=".//a[@title='Студия']";
    private static final String BUSINESS_HEADER=".//h1[@itemprop='headline name']";

    @Override
    public SelenideElement getMainElement() {
        return $x(MAIN_ELEMENT_ROOMS);
    }
    public SelenideElement getBusinessPopup(){
        return getMainElement().$x(BUSINESS_POPUP);
    }
    public SelenideElement getStudioPopup(){
        return getMainElement().$x(STUDIO_POPUP);
    }
    public SelenideElement getBusinessHeader(){
        return getMainElement().$x(BUSINESS_HEADER);
    }
}
