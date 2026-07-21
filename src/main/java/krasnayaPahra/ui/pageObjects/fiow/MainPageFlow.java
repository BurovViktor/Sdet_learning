package krasnayaPahra.ui.pageObjects.fiow;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import krasnayaPahra.ui.pageObjects.BaseFlow;
import krasnayaPahra.ui.pageObjects.pages.BusinessPage;
import krasnayaPahra.ui.pageObjects.pages.MainPage;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static krasnayaPahra.ui.pageObjects.enums.EnamsPahra.BASE_URL;

public class MainPageFlow implements BaseFlow {


    private final MainPage mainPageElements = new MainPage();

    @DisplayName("Открыть главную страницу в браузере")
    public void openMainPageInBrowser() {
        open(BASE_URL.toString());
    }

    @DisplayName("Открыта главная страница")
    public void mainPageIsLoaded() {
        mainPageElements.getMainElement().shouldBe(Condition.clickable);
    }

    @DisplayName("Переключится на BookingIframe")
    public void switchToBookingIframe() {
        Selenide.switchTo().frame(mainPageElements.getBookingIFrameElement());
    }

    @DisplayName("Перейти на флоу навигации")
    public NavigationHeaderPanelFlaw atNavigationFlow() {
        return new NavigationHeaderPanelFlaw();
    }
    public BusinessHeaderFlow atBusinessHeaderFlow() {
        return new BusinessHeaderFlow();
    }
    public NomeraBusinessFlow atNomeraBusinessFlow(){
        return new NomeraBusinessFlow();
    }

}
