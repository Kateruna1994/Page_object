package blocks;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductPageBlock {


  private WebElement img;
  private WebElement nameProductEsWebElement;
  private String nameProductAsString;
  private String priceOld;
  private String priceNew;
  private String tax;
  private WebElement basket;
  private WebElement aadToWishList;
  private WebElement compareThisProduct;

  public ProductPageBlock (WebElement container) {

    try {
      this.img = container.findElement(By.xpath(".//img"));
    } catch (NoSuchElementException e) {
      this.img = null;
    }

    try {
      this.nameProductEsWebElement = container.findElement(By.xpath(
          ".//div[@class='caption']//a"));
      this.nameProductAsString = nameProductEsWebElement.getText();
    } catch (NoSuchElementException e) {
      this.nameProductEsWebElement = null;
      this.nameProductAsString = null;
    }

    try {
      this.priceOld = container.findElement(By.xpath(".//span[@class='price-old']")).getText();
    } catch (NoSuchElementException e) {
      this.priceOld = null;
    }

    try {
      this.priceNew = container.findElement(By.xpath("(.//span[@class='price-new']")).getText();
    } catch (NoSuchElementException e) {
      this.priceNew = null;
    }

    try {
      this.tax = container.findElement(By.xpath("(.//span[@class='price-tax']")).getText();
    } catch (NoSuchElementException e) {
      this.tax = null;
    }

    try {
      this.basket = container.findElement(By.xpath("(.//i[@class='fa fa-shopping-cart']"));
    } catch (NoSuchElementException e) {
      this.basket = null;
    }

    try {
      this.aadToWishList = container.findElement(
          By.xpath(".//button[@data-original-title='Add to Wish List']"));
    } catch (NoSuchElementException e) {
      this.aadToWishList = null;
    }

    try {
      this.compareThisProduct = container.findElement(By.xpath(".//i[@class='fa fa-exchange']"));
    } catch (NoSuchElementException e) {
      this.compareThisProduct = null;
    }

  }


}
