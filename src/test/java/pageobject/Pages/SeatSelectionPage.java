package pageobject.Pages;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class SeatSelectionPage {
    private final By SEAT = By.xpath(".//div[@class - 'seat']");
    private final By SELECTED_SEAT = By.xpath(".//div[@class = 'line']");
    private final By BOOK_BTN = By.id("book3");
    private BaseFunc baseFunc;

    public SeatSelectionPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectSaet(int seatNr) {
        baseFunc.waitForMineElementAmount(SEAT, 30);

        List<WebElement> seats = baseFunc.findElements(SEAT);



        boolean isSeatFound = false;
        for (WebElement we : seats) {
            if (Integer.parseInt(we.getText()) == seatNr) {
                we.click();
                baseFunc.click(we);
                isSeatFound = true;
                break;
            }
            Assertions.assertTrue(isSeatFound, "Seat Nr. " + seatNr " isn`t found");
        }
        public  int getSelectionSeatNr() {
            String selectedSeatInfo = baseFunc.findElement(SELECTED_SEAT).getText();
            return Integer.parseInt(StringUtils.getDigits(selectedSeatInfo));

        }
        public void book() {
            baseFunc.click(BOOK_BTN);
        }

    }




}

