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

public class ProductMyWishListBlock {

  private WebElement img;
  private WebElement nameAsWebElement;
  private String nameAsString;
  private String model;
  private String stock;
  private String price;
  private WebElement addToCart;
  private WebElement remove;

  public ProductMyWishListBlock(WebElement container) {

    try {
      this.img = container.findElement(By.xpath(".//td[1]"));
    } catch (NoSuchElementException e) {
      this.img = null;
    }

    try {
      this.nameAsWebElement = container.findElement(By.xpath(".//td[2]"));
      this.nameAsString = nameAsWebElement.getText();
    } catch (NoSuchElementException e) {
      this.nameAsWebElement = null;
      this.nameAsString = null;
    }

    try {
      this.model = container.findElement(By.xpath(".//td[3]")).getText();
    } catch (NoSuchElementException e) {
      this.model = null;
    }

    try {
      this.stock = container.findElement(By.xpath(".//td[4]")).getText();
    } catch (NoSuchElementException e) {
      this.stock = null;
    }

    try {
      this.price = container.findElement(By.xpath(".//td[5]")).getText();
    } catch (NoSuchElementException e) {
      this.price = null;
    }

    try {
      this.addToCart = container.findElement(By.xpath(".//td/button"));
    } catch (NoSuchElementException e) {
      this.addToCart = null;
    }

    try {
      this.remove = container.findElement(By.xpath(".//tr//a//i"));
    } catch (NoSuchElementException e) {
      this.remove = null;
    }

  }
}

