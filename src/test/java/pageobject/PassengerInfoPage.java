package pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassengerInfoPage {

    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By DESTANATION_FROM = By.xpath(".//span[@class = 'bTxt'][1]");
    private final By DESTANATION_TO = By.xpath(".//span[@class = 'bTxt'][2]");
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");
    private final By SELECT_DATE = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");
    private BaseFunc baseFunc;


    @Test
    public void RegistrationTest() {

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

        private final String URL = "qaguru.lv:8089/tickets/";
        private WebDriver browser;
        private WebDriverWait wait;




baseFunc.openUrl(String);

baseFunc.select(By FROM = By.id("afrom");
baseFunc.select(By TO = By.id("bfrom");
baseFunc.select( By DESTANATION_FROM = By.xpath(".//span[@class = 'bTxt'][1]"));
baseFunc.select(By DESTANATION_TO = By.xpath(".//span[@class = 'bTxt'][2]"););
baseFunc.select(By SELECT_DATE = By.id("flight");

baseFunc.select(By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");
baseFunc.select(By GO_BTN = By.xpath(".//span[@class = 'gogogo']"););








    }
}
