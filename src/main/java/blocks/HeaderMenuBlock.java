package blocks;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import pages.WishListPage;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class HeaderMenuBlock {

  private static WebDriver driver;

  public HeaderMenuBlock(WebDriver webDriver) {
    driver = webDriver;

  }

  private final By clickOnWishListButton = By.id("wishlist-total");
  private final By clickOnCurrencyButton = By.xpath(
      "//button[@class='btn btn-link dropdown-toggle']");
  private final By clickOnEuroButton = By.xpath("//li/button[@name='EUR']");
  private final By clickOnPoundButton = By.xpath("//li/button[@name='GBP']");


  public WishListPage clickOnTheWishListButton() {
    driver.findElement(clickOnWishListButton).click();
    return new WishListPage();
  }


  public MainPage clickOnTheCurrentButton() {
    driver.findElement(clickOnCurrencyButton).click();
    return new MainPage();
  }

  public MainPage clickOnTheEuroButton(){
    driver.findElement(clickOnEuroButton).click();
    return new MainPage();
  }

  public MainPage clickOnThePoundButton(){
    driver.findElement(clickOnPoundButton).click();
    return new MainPage();
  }


}
