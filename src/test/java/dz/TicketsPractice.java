package dz;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TicketsPractice {

    private WebDriver browser;
    private final By DESTANATION_FROM = By.xpath(".//span[@class = 'bTxt']['RIX']");
    private final By DESTANATION_TO = By.xpath(".//span[@class = 'bTxt']['SFO']");

    String text = "RIX";
    String secondText = "SFO";

    Select destanationFrom = new Select(browser.findElement(DESTANATION_FROM));
    destanationFrom.selectByValue("RIX");

    browser.findElement(DESTANATION_FROM).clear();
browser.findElement(DESTANATION_FROM).sendKeys("RIX");

Select destanationTo = new Select(browser.findElement(DESTANATION_TO));
destanationTO.selectByValue("SFO");
 browser.findElement(DESTANATION_TO).clear();
browser.findElement(DESTANATION_TO).sendKeys("SFO");



    Assertions.assertEquals("RIX", browser.findElement(DESTANATION_FROM).getText());

}
