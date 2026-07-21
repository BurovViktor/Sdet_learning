package krasnayaPahra.ui.pageObjects.fiow;

import com.codeborne.selenide.Condition;
import krasnayaPahra.ui.pageObjects.BaseFlow;
import krasnayaPahra.ui.pageObjects.pages.BusinessPage;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static krasnayaPahra.ui.pageObjects.enums.EnamsPahra.BUSINESS_URL;

public class BusinessHeaderFlow implements BaseFlow {

    private final BusinessPage maneBusinessPage =new BusinessPage();

    @DisplayName("Открыть страницу на вкладке Бизнес")
    public void openBusinessPage(){
        open(BUSINESS_URL.toString());
    }
    @DisplayName("Открыта страница Бизнеса")
    public void businessPageIsLoaded(){
        maneBusinessPage.getMainElement().shouldBe(Condition.clickable);
    }
    public void scroll(){
        $(BusinessPage.getIframeElement()).scrollIntoView(true);
    }
}
