package pages;

import blocks.ProductMyWishListBlock;
import blocks.ProductPageBlock;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishListPage extends BasePage{

  private final By productContainer = By.xpath("//table//tbody//tr");

  public List<ProductMyWishListBlock> getMonitorsNameFromMyWishList(){
    List<ProductMyWishListBlock> products = new ArrayList<>();
    List<WebElement> containers = getDriver().findElements(productContainer);
    for (WebElement container : containers){
      ProductMyWishListBlock productMyWishListBlock = new ProductMyWishListBlock(container);
      products.add(productMyWishListBlock);
    }
    return products;
  }

  public List<String> getNameProductsWishList() {
    List<String> namesProductsWishList = new ArrayList<>();
    List<ProductMyWishListBlock> products = getMonitorsNameFromMyWishList();
    for (ProductMyWishListBlock product : products) {
      namesProductsWishList.add(product.getNameAsString());
    }
    return namesProductsWishList;
  }



}
