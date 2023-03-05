package pageobject;

import Model.Passanger;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PassengerInfoPage {
    private final By FIRST_NAME = By.id("name");
    private final By LAST_NAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAG = By.id("bugs");

    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");

    private final By RESERVATION_INFO = By.xpath(".//span[@class = 'bTxt']");
    private final By RESPONSE_BLOCK = By.id("response");

    private final By BOOK_BTN = By.id("book2");

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
      public void fillInPassangerInfo(Passanger passanger) {
        //baseFunc.type(FIRST_NAME, passenger.getFirstName());
        baseFunc.type(FIRST_NAME, passanger.getFirstName());
        baseFunc.type(LAST_NAME, passanger.getLastName());
        baseFunc.type(DISCOUNT, passanger.getDiscount());
        baseFunc.type(ADULTS, passanger.getPeopleCount());
        baseFunc.type(CHILDREN, passanger.getChildCount());
        baseFunc.type(BAG, passanger.getBagCount());
        //baseFunc.selectByText(FLIGHT, passenger.getDate());

        baseFunc.click(GET_PRICE_LINK);
        baseFunc.waitForElementsCountToBe(RESERVATION_INFO, 5);
    }

    public String getFirstFromAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(0).getText();
    }

    public String getFirstToAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(1).getText();
    }

    public String getSecondFromAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(3).getText();
    }

    public String getSecondToAirport() {
        return baseFunc.findElements(RESERVATION_INFO).get(4).getText();
    }

    public String getPassengerName() {
        String name = baseFunc.findElements(RESERVATION_INFO).get(2).getText(); //Dima!
        return name.substring(0, name.length() - 1);
    }

    public String getPrice() {
        String text = baseFunc.findElement(RESPONSE_BLOCK).getText();

        return StringUtils.substringBetween(text, "for", "EUR" );
    }

    public void book() {
        baseFunc.click(BOOK_BTN);
    }



}
