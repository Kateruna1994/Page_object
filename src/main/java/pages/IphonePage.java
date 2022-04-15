package pages;

import blocks.IphoneBlock;
import blocks.ProductMyWishListBlock;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IphonePage extends BasePage {

  public final By productContainer = By.xpath("//div[@class='row']");

  public List<IphoneBlock> getIphonePriceFromDollarPrice() {
    List<IphoneBlock> products = new ArrayList<>();
    List<WebElement> containers = getDriver().findElements(productContainer);
    for (WebElement container : containers) {
      IphoneBlock iphoneBlock = new IphoneBlock(container);
      products.add(iphoneBlock);
    }
    return products;
  }

  public String getPriceAll(){
    List<IphoneBlock> products = getIphonePriceFromDollarPrice();
    IphoneBlock iphoneBlock = new IphoneBlock(find(productContainer));
    return iphoneBlock.getPrice();
  }

  }

