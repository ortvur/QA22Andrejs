import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
    @Test
    public void openHomeCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://discovercars.com/");

        By.id("element-id");
        By.name("input-field-name");
        By.xpath(".//label[@for = 'is-drop-off']");




        

    }
}
