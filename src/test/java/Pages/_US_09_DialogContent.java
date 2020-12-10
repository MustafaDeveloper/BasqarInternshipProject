package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class _US_09_DialogContent extends _US_00_Parent{

    WebElement myElement;

    public _US_09_DialogContent(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//mat-toolbar-row/button[2]")
    public WebElement closeButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement yesButton;

    //--- general page max eleman select buttons
    @FindBy (css = "mat-select[role='combobox']")
    private WebElement pageSelectBtn;

    @FindBy (xpath = "//span[text()=' 1000 ']")
    private WebElement maxElementBtn;


    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName){

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "closeButton":
                myElement = closeButton;
                break;

                case "yesButton":
                myElement = yesButton;
                break;

            case "pageSelectBtn":
                myElement = pageSelectBtn;
                break;

            case "maxElementBtn":
                myElement = maxElementBtn;
                break;


        }
        clickFunction(myElement);
    }

    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

        }
        verifyElementContainsText(myElement, msg);
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }
    public void checkSaveButton (){
        Assert.assertTrue(saveButton.isEnabled()==false);
    }
}
