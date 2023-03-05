package pageobject;

import Model.Passanger;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pageobject.Pages.HomePage;
import pageobject.Pages.SeatSelectionPage;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccessfulRegistrationPage;
public class TicketsTestsOnPages {
        private final String URL = "qaguru.lv:8089/tickets/";
        private final String FROM_AIRPORT = "RIX";
        private final String TO_AIRPORT = "SFO";

        private final By BOOK_BTN = By.id("book2")

        private BaseFunc baseFunc = new BaseFunc();

        @Test
        public void successfulRegistrationTest() {

                Passanger passanger = new Passanger("TestName", "TestSurname", "CCCCC",
                        2,4,"16-05-2018");
                int seatNr = RandomUtils.nextInt(1, 35);

                baseFunc.openUrl(URL);
                HomePage homePage = new HomePage(baseFunc);
                homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

                PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
                infoPage.fillInPassangerInfo(passanger);


                Assertions.assertEquals(passanger).getFirstName(), infoPage.getPassengerName("Wron name");
                Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstFromAirport(), "Error msg!");
                Assertions.assertEquals(FROM_AIRPORT, infoPage.getSecondFromAirport(), "Error msg!");
                Assertions.assertEquals(TO_AIRPORT, infoPage.getFirstToAirport(), "Error msg!");
                Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondToAirport(), "Error msg!");

                Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error message!");

                infoPage.book();

                SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);



                //Get List<WebElement> with Name, From Airport, To Airport
                //                            0         1            2
                // .getText() -> String
                // String fromAirport = data.get(1).getText() -> "RIX"
                // Ass.equals(FROM_AIRPORT, fromAirport, "Error message");
             

                seatSelectionPage.selectSaet(seatNr);

                int selectedSeat = seatSelectionPage.getSelectedSeatNr();
                Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");

                seatSelectionPage.book();

                SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);
                Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(),
                        "Wrong text on successful registration page");
        }
}
