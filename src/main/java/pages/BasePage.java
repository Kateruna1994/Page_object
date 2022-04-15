package pages;

import blocks.HeaderMenuBlock;
import blocks.MainMenuBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {

private static WebDriver driver;

  public static WebDriver getDriver() {
    return driver;
  }

  public static void setDriver(WebDriver webDriver) {
    driver = webDriver;
  }

  public void hoverTheButton(By locator){
    WebElement element = find(locator);
    Actions actions = new Actions(getDriver());
    actions.moveToElement(element).build().perform();
  }

  private MainMenuBlock mainMenuBlock = new MainMenuBlock(driver);

  public MainMenuBlock getMainMenuBlock() {
    return mainMenuBlock;
  }



  private HeaderMenuBlock headerMenuBlock = new HeaderMenuBlock(driver);

  public HeaderMenuBlock getHeaderMenuBlock() {
    return headerMenuBlock;
  }

  public WebElement find(By locator){
    return getDriver().findElement(locator);
  }
}
