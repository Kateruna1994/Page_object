package pages;

import org.openqa.selenium.By;

public class PersonalCabinetPage extends BasePage {

  private final By checkForText = By.xpath(
      "//div[@id='content']/h1[text()='Your Account Has Been Created!']");

  public String checkForTextYourAccountHasBeenCreated(){
   return find(checkForText).getText();

  }

}
