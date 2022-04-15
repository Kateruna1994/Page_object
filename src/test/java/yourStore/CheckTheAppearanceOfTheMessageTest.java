package yourStore;

import com.github.javafaker.Faker;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;
import pages.IphonePage;
import pages.MainPage;

public class CheckTheAppearanceOfTheMessageTest extends BaseTest {

  @Test //Task 1
  public void messageAppearsTest() {

    String expectedResult = "Your Account Has Been Created!";
    MainPage mainPage = new MainPage();

    Faker faker = new Faker();
    String password = faker.internet().password();

    String checkIfTheTextAppears = mainPage.clickButtonMyAccount()
        .clickRegisterAccountButton()
        .enterFirstName(faker.name().firstName())
        .enterLastName(faker.name().lastName())
        .enterEmail(faker.internet().emailAddress())
        .enterPhone(faker.phoneNumber().cellPhone())
        .enterPassword(password)
        .enterPasswordConfirm(password)
        .clickOnThePrivacyPolicyCheckBox()
        .clickOnTheContinueButton()
        .checkForTextYourAccountHasBeenCreated();

    Assertions.assertThat(checkIfTheTextAppears)
        .as("Text should be" + " " + expectedResult)
        .isEqualTo(expectedResult);

  }

  @Test
  public void checkFirstNameTest() {
    MainPage mainPage = new MainPage();
    String expectedResultAfterClickContinue = "First Name must be between 1 and 32 characters!";
    Faker faker = new Faker();
    String password = faker.internet().password();

    String actualResultCheckIfTheTestWillAppearUnderTheFieldFirstName = mainPage.clickButtonMyAccount()
        .clickRegisterAccountButton()
        .enterLastName(faker.name().lastName())
        .enterEmail(faker.internet().emailAddress())
        .enterPhone(faker.phoneNumber().cellPhone())
        .enterPassword(password)
        .enterPasswordConfirm(password)
        .clickOnThePrivacyPolicyCheckBox()
        .clickButtonContinueAndCheckForError()
        .checkIfTheTestWillAppearUnderTheFieldFirstname();

    Assertions.assertThat(actualResultCheckIfTheTestWillAppearUnderTheFieldFirstName)
        .as("After click button Continues should be " + expectedResultAfterClickContinue)
        .isEqualTo(expectedResultAfterClickContinue);

  }

  @Test
  public void checkThatTitleAppearsOnTheLeftMenuTest() {
    MainPage mainPage = new MainPage();
    String expectedResultCheckTitle = "My Account";

    String actualResultCheckTitle = mainPage.clickButtonMyAccount()
        .clickOnTheLoginButton()
        .enterMyEmail("ketringoncharuk1994@gmail.com")
        .enterMyPassword("chuhchuh2022")
        .clickOnTheLoginButton()
        .checkTheitleAppearsOnTheLeftMenu();

    Assertions.assertThat(actualResultCheckTitle)
        .as(expectedResultCheckTitle + " Should be on the left menu")
        .isEqualTo(expectedResultCheckTitle);

  }

  @Test
  public void CheckThatThereAreTwoItemsInTheWishList() {

    MainPage mainPage = new MainPage();
    String actualResultMonitor1 = "Samsung SyncMaster 941BW";
    String actualResultMonitor2 = "Apple Cinema 30\"";

    List<String> actualResultNameMonitors = mainPage.clickButtonMyAccount()
        .clickOnTheLoginButton()
        .enterMyEmail("ketringoncharuk1994@gmail.com")
        .enterMyPassword("chuhchuh2022")
        .clickOnTheLoginButton()
        .getMainMenuBlock().pointToButton()
        .getMainMenuBlock().clickOnTheMonitorButton()
        .clickOnTheMonitorsAndTakeThemWishList(actualResultMonitor2)
        .clickOnTheMonitorsAndTakeThemWishList(actualResultMonitor1)
        .getHeaderMenuBlock().clickOnTheWishListButton()
        .getNameProductsWishList();

    SoftAssertions softAssertions = new SoftAssertions();
    softAssertions.assertThat(actualResultNameMonitors)
        .as("There should be two monitors in the letter, namely " + actualResultMonitor1,
            actualResultMonitor2)
        .containsExactlyInAnyOrder(actualResultMonitor1, actualResultMonitor2);
  }

  @Test
  public void check() {

    MainPage mainPage = new MainPage();
    IphonePage iphonePage = new IphonePage();
    String expectedCuastDollar = "123.20";
    String euro = "106.04";

    String actualResultPointToTheCurrencyFromDollar = mainPage.pointToTheCurrencyFromDollar();

    Assertions.assertThat(iphonePage.getPriceAll())
        .as("")
        .isEqualTo(expectedCuastDollar);

    mainPage.cheangeCurencyToEuro();

    Assertions.assertThat(iphonePage.getPriceAll())
        .as("")
        .isEqualTo(euro);






  }

}
