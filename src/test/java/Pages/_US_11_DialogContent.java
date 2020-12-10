package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class _US_11_DialogContent extends _US_00_Parent {
    WebElement myElement;

    public _US_11_DialogContent() {
        PageFactory.initElements(driver, this);
    }

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
    //_--------------------------------------------_
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/timesheet-multiplier-dialog/ms-dialog/div/ms-dialog-content/div/mat-form-field[1]/div/div[1]/div/input")
    private WebElement nameInput;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public List<WebElement> nameList;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/timesheet-multiplier-dialog/ms-dialog/div/ms-dialog-content/div/mat-form-field[2]/div/div[1]/div/input")
    private WebElement shortNameInput;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/timesheet-multiplier-dialog/ms-dialog/div/ms-dialog-content/div/mat-form-field[3]/div/div[1]/div/input")
    private WebElement multiplierInput;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/timesheet-multiplier-dialog/ms-dialog/div/ms-dialog-buttons/mat-dialog-actions/ms-button/button/span[1]/span")
    private WebElement applyButton;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/div/div/content/timesheet-multiplier/ms-browse/mat-card/ms-browse-search/div/mat-form-field[1]/div/div[1]/div/input")
    private WebElement nameInputForSearch;

    @FindBy(xpath = "//ms-edit-button/button")
    private WebElement editButton;

    @FindBy(xpath = "//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy (xpath = "//ms-edit-button/button")
    private List<WebElement> editBtnList;
//
//    @FindBy(xpath = "//ms-edit-button/button")
//    public List<WebElement> editButtonList;


    @FindBy(xpath = "//ms-delete-button/button")
    private List<WebElement> deleteBtnList;

    @FindBy(xpath = "//td[text()=' No data to show ']")
    private WebElement noData;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement forwardButton;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
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

            case "editButton":
                myElement = editButton;
                break;

            case "applyButton":
                myElement = applyButton;
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
                myElement = nameInput;
                break;

            case "nameInputForSearch":
                myElement = nameInputForSearch;
                break;

            case "shortNameInput":
                myElement = shortNameInput;
                break;

            case "multiplierInput":
                myElement = multiplierInput;
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
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }

    public void findElementAndDeleteFunction(String ElementName){
        waitVisibleListAllElement(nameList);
        for (int i=0; i<nameList.size();i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(deleteBtnList.get(i));
        }
    }
    public void findElementAndEditFunction(String ElementName){
        for (int i=0; i<nameList.size();i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(editBtnList.get(i));
        }
    }

    // }
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
