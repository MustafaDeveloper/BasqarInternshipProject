package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class _US_06_DialogContent extends _US_00_Parent{
    WebElement myElement;
    public _US_06_DialogContent(){ PageFactory.initElements(driver,this); }

    // Login Elements
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;

    //---------------------------------

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/ng-component/ms-dialog/div/ms-dialog-content/div/mat-form-field[2]")
    private WebElement StageInput;

    @FindBy (xpath = "//span[text()=' Examination ']")
    private WebElement ExaminationButton;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement saveButton;

    @FindBy (xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement nameInputForSearch;

    @FindBy (xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(xpath= "//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy (xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "/html/body/div[2]/div[1]")
    private WebElement DocumentSpace;

    @FindBy(xpath = "/html/body/div[2]/div[3]")
    private  WebElement sayfa;



    public void findElementAndClickFunction(String ElementName){

        switch (ElementName){
            case "loginButton":
                myElement = loginButton;
                break;
            case "gotItBtn":
                if (gotItBtns.size() == 0)
                    return;

                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "StageInput":
                myElement = StageInput;
                break;

            case "ExaminationButton":
                myElement = ExaminationButton;
                break;

            case "editButton":
                myElement = editButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

            case"DocumentSpace":
                myElement=DocumentSpace;
                break;

            case "sayfa":
                myElement=sayfa;
                break;

        }
        clickFunction(myElement);
    }
    public void findElementAndSendKeysFunction(String ElementName, String value) {


        switch (ElementName) {

            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "nameInput":
                myElement=nameInput;
                break;

            case "nameInputForSearch":
                myElement=nameInputForSearch;
                break;
        }
        sendKeysFunction(myElement, value);
    }
    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;
        }

        verifyElementContainsText(myElement, msg);

    }



    public String getMainPageID() {
        String mainPageid = driver.getWindowHandle();
        return mainPageid;
    }

    public void changePageAndAssert(String anaSaydaID, String title) {
        Set<String> pageIDs = driver.getWindowHandles();
        for (String pageID : pageIDs) {
            if (!pageID.equals(anaSaydaID))
                driver.switchTo().window(pageID);
        }

        String newPageUrl = driver.getCurrentUrl();

        Assert.assertTrue(newPageUrl.contains(title));
        driver.close();
        driver.switchTo().window(anaSaydaID);

    }
}




