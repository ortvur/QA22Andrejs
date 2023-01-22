package pageobject;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccessfulRegistrationPage;

public class TicketsTestsOnPages {
    private final String URL = "qaguru.lv:8089/tickets/";
    @@ -17,6 +22,7 @@ public class TicketsTestsOnPages {
        public void successfulRegistrationTest() {
            Passenger passenger = new Passenger("TestName", "TestSurname", "CCCCCC", 2, 1, 4, "16-05-2018");
            int seatNr = RandomUtils.nextInt(1, 35);
            baseFunc.openUrl(URL);
            HomePage homePage = new HomePage(baseFunc);
            @@ -32,5 +38,19 @@ public void successfulRegistrationTest() {
                Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondToAirport(), "Error msg!");
                Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error message!");

                infoPage.book();
                SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
                seatSelectionPage.selectSeat(seatNr);

                int selectedSeat = seatSelectionPage.getSelectedSeatNr();
                Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");

                seatSelectionPage.book();

                SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);
                Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(),
                        "Wrong text on successful registration page");
            }
        }
