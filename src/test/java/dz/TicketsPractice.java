package dz;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TicketsPractice {

 @Test
 private WebDriver browser;

 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
 WebDriver browser = new ChromeDriver();
 browser.manage().window().maximize();

        browser.get("http://qaguru.lv:8089/tickets/");
    WebDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10);


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
