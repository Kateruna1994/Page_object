package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;

public class RegisterAccountPage extends BasePage {

  private final By clickFieldUserName = By.id("input-firstname");
  private final By clickFieldLastName = By.id("input-lastname");
  private final By clickFieldEmail = By.id("input-email");
  private final By clickFieldPhone = By.id("input-telephone");
  private final By clickFieldPassword = By.id("input-password");
  private final By clickFieldPasswordConfirm = By.id("input-confirm");
  private final By clickOnTheCheckBox = By.xpath("//input[@type='checkbox']");
  private final By clickOnButtonContinue = By.xpath("//input[@value='Continue']");
  private final By checkIfItIsFilledFieldFirstName = By.xpath(
      "//div[contains(@class,'sm-10')]/div[text()='First Name must be between 1 and 32 characters!']");
  private final By clickOnTheEmailButton = By.id("input-email");
  private final By clickOnThePasswordButton = By.id("input-password");
  private final By clickOnLoginButton = By.xpath("//input[@value='Login']");


  public RegisterAccountPage enterFirstName(String name) {
    find(clickFieldUserName).sendKeys(name);
    return this;
  }

  public RegisterAccountPage enterLastName(String lastName) {
    find(clickFieldLastName).sendKeys(lastName);
    return this;
  }

  public RegisterAccountPage enterEmail(String email) {
    find(clickFieldEmail).sendKeys(email);
    return this;
  }

  public RegisterAccountPage enterPhone(String phone) {
    find(clickFieldPhone).sendKeys(phone);
    return this;
  }

  public RegisterAccountPage enterPassword(String password) {
    find(clickFieldPassword).sendKeys(password);
    return this;
  }

  public RegisterAccountPage enterPasswordConfirm(String passwordConfirm) {
    find(clickFieldPasswordConfirm).sendKeys(passwordConfirm);
    return this;
  }

  public RegisterAccountPage clickOnThePrivacyPolicyCheckBox() {
    find(clickOnTheCheckBox).click();
    return this;
  }

  public PersonalCabinetPage clickOnTheContinueButton() {
    find(clickOnButtonContinue).click();
    return new PersonalCabinetPage();
  }

  public RegisterAccountPage clickButtonContinueAndCheckForError() {
    find(clickOnButtonContinue).click();
    return this;
  }

  public String checkIfTheTestWillAppearUnderTheFieldFirstname(){
    return find(checkIfItIsFilledFieldFirstName).getText();
  }

  public RegisterAccountPage enterMyEmail(String email){
    find(clickOnTheEmailButton).sendKeys(email);
    return this;
  }

  public RegisterAccountPage enterMyPassword(String password){
    find(clickOnThePasswordButton).sendKeys(password);
    return this;
  }

  public MyAccountPage clickOnTheLoginButton(){
    find(clickOnLoginButton).click();
    return new MyAccountPage();
  }


}
