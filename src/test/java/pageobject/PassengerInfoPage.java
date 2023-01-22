package pageobject;

import org.openqa.selenium.By;

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

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void passengerInfoPage (Passenger passenger){
        baseFunc.type(FROM, passenger.getFrom());

    }
}
