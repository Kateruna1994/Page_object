package blocks;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import pages.MonitorsPage;

@Getter
@Setter
@EqualsAndHashCode

public class MainMenuBlock {

  private static WebDriver driver;

  private final By clickButton = By.xpath("//li[@class='dropdown']/a[text()='Components']");
  private final By clickMonitorButton = By.xpath
      ("//ul[@class='list-unstyled']//a[contains(text(),'Monitors')]");

  public MainMenuBlock(WebDriver webDriver) {
    driver = webDriver;
  }

  public MainPage pointToButton() {
    WebElement element = driver.findElement(clickButton);
    Actions actions = new Actions(driver);
    actions.moveToElement(element).build().perform();
    return new MainPage();
  }

  public MonitorsPage clickOnTheMonitorButton(){
    driver.findElement(clickMonitorButton).click();
    return new MonitorsPage();
  }


}
