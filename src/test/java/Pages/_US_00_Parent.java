package Pages;

import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class _US_00_Parent {
   WebDriver driver;
WebDriverWait wait;

    public _US_00_Parent() {
        driver= Driver.getDriver();
        wait = new WebDriverWait(driver,10);
    }
    public void navigateRefresh(){
        driver.navigate().refresh();
    }

    public void clickFunction(WebElement element){
        //elemana kadar scroll yap
 scrollToElement(element);
        //eleman clickable olana kadar bekle
        waitUntilClickable(element);
        //click yap
        element.click();
    }

    public  void sendKeysFunction(WebElement element,String value){
        //elemana kadar scroll yap
        scrollToElement(element);
        //eleman görünür olana kadar bekle
        waitUntilVisible(element);
        //elemana clear yap
        element.clear();
        //value yi gönder
        element.sendKeys(value);
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

  public void scrollToElement(WebElement element)
  {
      JavascriptExecutor js= (JavascriptExecutor)driver;
      js.executeScript("arguments[0].scrollIntoView();",element);
  }
 public void verifyElementContainsText(WebElement element, String text){
        waitUntilVisible(element);
        System.out.println(element.getText());
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }
    public void waiting(int ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
