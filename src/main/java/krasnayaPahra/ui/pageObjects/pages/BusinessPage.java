package krasnayaPahra.ui.pageObjects.pages;

import com.codeborne.selenide.SelenideElement;
import krasnayaPahra.ui.pageObjects.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class BusinessPage extends BasePage {

    private static final String MANE_BUSINESS_ELEMENT = "//main[@id='content']";
    private static final String BUSINESS_IFRAME_ELEMENT = ".//div[@class='container u-space-2']";

    @Override
    public SelenideElement getMainElement() {
        return $x(MANE_BUSINESS_ELEMENT);
    }

    public String getBusinessIframeElement() {
        return BUSINESS_IFRAME_ELEMENT;
    }
    public static SelenideElement getIframeElement(){
        return $x(BUSINESS_IFRAME_ELEMENT);
    }


}
