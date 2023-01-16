import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class FirstSeleniumTest {
    //@Test
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By TOP_LOCATION_LINK = By.xpath(".//div[@id = `nav-shop`]");


    public void openHomeCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://discovercars.com/");


        //WebDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10);

        //wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));
        browser.findElement(ACCEPT_COOKIES_BTN).click();

        //clickOnCountry(country);

        final By FILTER_OPTION = By.xpath(".//label[contains(@class, `my-checkbox`)]");

        for (WebElement we : browser.findElements(FILTER_OPTION)) {
            if (we.getAttribute("data text").equals("Honda")) {
                we.click();
                break;
            }
        }
    }
    //@Test
    public void amazonTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://amazon.de");
        //WebDriverWait = new WebDriverWait(browser, Duration.ofSeconds(10);

        //wait.until(ExpectedConditions.elementToBeClickable(AMAZON_ACCEPT_COOKIES_BTN);
        //browser.findElement(AMAZON_ACCEPT_COOKIES_BTN).click();

        //wait.until(ExpectedConditions.elementToBeClickable(AMAZON_ACCEPT_COOKIES_BTN);
        //browser.findElement(AMAZON_ACCEPT_COOKIES_BTN).click();

        //List<WebElement> menuItems = browser.findElements(AMAZON_MAIN_MENU_ITEM);
        //for (WebElement we: menuItems)
            //if (we.getText().equals(menuItemToSelect)) {
                //we.click();
       //         break;

     //           private final By AMAZON_ACCEPT_COOKIES_BTN;


    }

   //     menuItems.addAll
}

