package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_08_LeftNavigation  extends _US_00_Parent{
    WebElement myElement;

    public _US_08_LeftNavigation() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Inventory'])[1]")
    private WebElement inventoryButton;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement inventorySetupBtn;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement itemCategoriesButton;

    @FindBy (xpath = " //h3[text()='  Item Categories ']")
    private WebElement pageNameItem;

    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "inventoryButton":
                myElement = inventoryButton;
                break;

            case "inventorySetupBtn":
                myElement = inventorySetupBtn;
                break;

            case "itemCategoriesButton":
                myElement = itemCategoriesButton;
                break;

        }
        clickFunction(myElement);
    }

    public String getURL(){
        return driver.getCurrentUrl();
    }
    public String getpageName(){
        return pageNameItem.getText();
    }
}
