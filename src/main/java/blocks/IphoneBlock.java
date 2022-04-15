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
public class IphoneBlock {

  private String name;
  private String price;
  private WebElement addToCartButton;
  private WebElement addWishList;
  private WebElement compareThisProduct;


  public IphoneBlock(WebElement container) {

    try {
      this.name = container.findElement(By.xpath(".//h1[text()='iPhone']")).getText();
    } catch (NoSuchElementException e) {
      this.name = null;
    }

    try {
      this.price = container.findElement(By.xpath(".//li/h2")).getText();
    } catch (NoSuchElementException e) {
      this.price = null;
    }

    try {
      this.addToCartButton = container.findElement(By.id("button-cart"));
    } catch (NoSuchElementException e) {
      this.addToCartButton = null;
    }

    try {
      this.addWishList = container.findElement(
          By.xpath(".// button[@class='btn btn-default']/i[@class='fa fa-heart']"));
    } catch (NoSuchElementException e) {
      this.addWishList = null;
    }

    try {
      this.compareThisProduct = container.findElement(
          By.xpath(".// button[@class='btn btn-default']/i[@class='fa fa-exchange']"));
    } catch (NoSuchElementException e) {
      this.compareThisProduct = null;
    }
  }


}
