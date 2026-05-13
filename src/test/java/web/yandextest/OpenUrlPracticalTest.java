package web.yandextest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class OpenUrlPracticalTest {
    @Test
    public void openUrl(){
        open("https://www.software-testing.ru/component/content/article/3806-qa-tester-beginner-series-a-beginners-guide-to-page-object-model-pom-and-page-factory");
        String dailyNews=".item40";
        $(dailyNews).scrollIntoCenter().click();
        System.out.println("Наш URL -> " + WebDriverRunner.getWebDriver().getCurrentUrl());

    }
}
