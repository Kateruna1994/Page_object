package pages;

import org.openqa.selenium.By;

public class MainPage extends BasePage {

  private final By clickButton = By.xpath("//a[@title='My Account']");
  private final By clickButtonRegister = By.xpath
      ("//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']");
  private final By pointCurrencyButtonFromDollar = By.xpath(
      "//button[@class='btn btn-link dropdown-toggle']/strong");
  private final By clickLoginButton = By.xpath(
      "//ul[contains(@class,'dropdown-menu-right')]//a[text()='Login']");
  private final By clickOnProductIphone = By.xpath("//h4/a[text()='iPhone']");


  public MainPage clickButtonMyAccount() {
    find(clickButton).click();
    return this;
  }

  public RegisterAccountPage clickRegisterAccountButton() {
    find(clickButtonRegister).click();
    return new RegisterAccountPage();
  }

  public RegisterAccountPage clickOnTheLoginButton() {
    find(clickLoginButton).click();
    return new RegisterAccountPage();
  }

public String pointToTheCurrencyFromDollar(){
    return find(pointCurrencyButtonFromDollar).getText();
}

  public IphonePage clickOnTheProductIphone(){
    find(clickOnProductIphone).click();
    return new IphonePage();
  }

  public void cheangeCurencyToEuro(){
    getHeaderMenuBlock().clickOnTheCurrentButton().getHeaderMenuBlock().clickOnTheEuroButton();
  }

//  public void cheangeCurencyToEuro(){
//    getHeaderMenuBlock().clickOnTheCurrentButton().getHeaderMenuBlock().clickOnTheEuroButton();
//  }





}
