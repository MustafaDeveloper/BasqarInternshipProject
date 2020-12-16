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

    @FindBy(xpath = "//h3[text()='  Position Categories ']")
    private WebElement positionCategoryPageCheck;

    @FindBy(xpath = "//user-message-bell//button")
    private WebElement bellButton;
    @FindBy(xpath = "(//mat-toolbar-row//button)[2]")
    private WebElement closeButton;
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
    @FindBy(xpath = "//ms-edit-button//button//span")
    private WebElement editButton;
    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;
    @FindBy(xpath = "(//ms-table//td)[2]")
    private WebElement nameSearchControl;


    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "bellButton":
                myElement = bellButton;
                break;
            case "closeButton":
                myElement = closeButton;
                break;
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
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "yesButton":
                myElement = yesButton;
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

    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "positionCategoryPageCheck":
                myElement = positionCategoryPageCheck;
                break;
            case "nameSearchControl":
                myElement = nameSearchControl;
                break;


        }
        verifyElementContainsText(myElement,msg);
    }
}
