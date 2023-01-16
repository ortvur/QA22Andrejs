//package pageobject;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//
//public class BaseFunc {
//    private WebDriver browser;
//
//    public BaseFunc() {
//        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//        WebDriver browser = new ChromeDriver();
//        browser.manage().window().maximize();
//
//        public void openUrl(String url){
//          if (url.startsWith "http://") || url.startsWith("https://") {
//
//
//        } else {
//              url = "http://" = url;
//            }
//
//            browser.get(url);
//    }
//    public void select(By locator, String value) {
//            WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated());
//            Select select = new Select(we);
//            select.selectByValue(value);
//
//
//        }
//    punlic void  click(By locator) {
//            wait
//        }
//}
