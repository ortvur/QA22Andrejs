import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TicketsTests {
        private final By FROM = By.id("afrom");
        private final By TO = By.id("bfrom");
        private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

        private final By FIRST_NAME = By.id("name");
        private final By LAST_NAME = By.id("surname");
        private final By DISCOUNT = By.id("discount");
        private final By ADULTS = By.id("adults");
        private final By CHILDREN = By.id("children");
        private final By BAG = By.id("bugs");
        private final By FLIGHT = By.id("flight");

        private WebDriver browser;
        private WebDriverWait wait;

        @Test
        public void reservationCheck() {
            System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
            browser = new ChromeDriver();
            browser.manage().window().maximize();
            browser.get("http://www.qaguru.lv:8089/tickets/");

            wait = new WebDriverWait(browser, Duration.ofSeconds(10));

            select(FROM, "RIX");
            select(TO, "SFO");

            browser.findElement(GO_BTN).click();

            type(FIRST_NAME, "First Name");
            type(LAST_NAME, "Last Name");
            type(DISCOUNT, "Discount Code");
            type(ADULTS, "3");
            type(CHILDREN, "2");
            type(BAG, "1");
            select(FLIGHT, "13");

            //Student student = new Student();

//            student.setFirstName("Artis");setFirstName

            String text = "Artis is the best QA :)";
            String secondText = "Artis is a bit funny!";

            String firstName = text.split(" ")[0];
            String secondName = secondText.split(" ")[0];
            Assertions.assertEquals(firstName, secondName, "Incorrect name!");

            //Assertions.assertTrue(text.startsWith(student.getFirstName()), "Wrong Name!");
            //Assertions.assertTrue(secondText.startsWith(student.getFirstName()), "Wrong Name!");

//        Assertions.assertEquals(homePageFrom, reservationPageFrom, "Wrong airport!");
        }

        private void select(By locator, String value) {
            WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            Select select = new Select(we);
            select.selectByValue(value);
        }

        private void type(By locator, String text) {
            WebElement input = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            input.clear();
            input.sendKeys(text);
        }
}

