package web.yandextest;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class OpenHotelKrasnayaPahra {
    @Test
    public void openUrlHoyelKrasnayaPahra() {
        open("https://krasnaya-pakhra-kurort.ru/");
        Selenide.switchTo().frame("booking-search-frame");
        $(".rec-dates-btn").scrollIntoCenter().click();
       // $$("#ares li.g").shouldHave(CollectionCondition.size(10));
       // $("#ares li.g").shouldHave(text("Яндекс Карты — транспорт, навигация, поиск мест"));
        System.out.println("");
    }

}
