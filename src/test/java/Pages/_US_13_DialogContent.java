package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _US_13_DialogContent extends _US_00_Parent {
    WebElement myElement;

    public _US_13_DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addPositionButton;
    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement nameInput;
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement Save;
    @FindBy(xpath = "//mat-form-field//input")
    private WebElement searchNameInput;
    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchNameButton;
    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;


    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "addPositionButton":
                myElement = addPositionButton;
                break;
            case "Save":
                myElement = Save;
                break;
            case "searchNameButton":
                myElement = searchNameButton;
                break;
            case "editButton":
                myElement = editButton;
                break;


        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {
        switch (ElementName) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "searchNameInput":
                myElement = searchNameInput;
                break;


        }
        sendKeysFunction(myElement, value);
    }

   /* public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
        }
    }*/
}
