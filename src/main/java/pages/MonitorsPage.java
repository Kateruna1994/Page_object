package pages;

import blocks.ProductPageBlock;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MonitorsPage extends BasePage {

  private final By productContainer = By.xpath("//div[@class='product-thumb']");

  public List<ProductPageBlock> getMonitorsFromMainPageBlock(){
    List<ProductPageBlock> products = new ArrayList<>();
    List<WebElement> containers = getDriver().findElements(productContainer);
    for (WebElement container : containers){
      ProductPageBlock productMainPageBlock = new ProductPageBlock(container);
      products.add(productMainPageBlock);
    }
    return products;
  }

  public MonitorsPage clickOnTheMonitorsAndTakeThemWishList(String nameMonitors){
    List<ProductPageBlock> productMainPageBlocks = getMonitorsFromMainPageBlock();
    for (ProductPageBlock product : productMainPageBlocks) {
      if (product.getNameProductAsString().equals(nameMonitors)) {
        product.getAadToWishList().click();
      }
    }
    return this;
  }


}
