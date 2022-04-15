package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

  private final By checkTextVerification = By.xpath("//div[@id='content']/h2[text()='My Account']");


  public String checkTheitleAppearsOnTheLeftMenu(){
    return find(checkTextVerification).getText();
  }

}
