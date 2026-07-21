package krasnayaPahra.ui.pageObjects.fiow;

import krasnayaPahra.ui.pageObjects.BaseFlow;
import krasnayaPahra.ui.pageObjects.pages.NomeraBusinessPage;

import static com.codeborne.selenide.Selenide.$;

public class NomeraBusinessFlow implements BaseFlow {

   // private static final String="";

    NomeraBusinessPage nomeraBusinessPage=new NomeraBusinessPage();

    public void fullNameInBooking(){

        $(nomeraBusinessPage.getBookingElement()).sendKeys("Джон Голд");
    }
}
