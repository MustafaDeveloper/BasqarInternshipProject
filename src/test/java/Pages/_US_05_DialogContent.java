package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class _US_05_DialogContent extends _US_00_Parent{
    {PageFactory.initElements(driver, this); }
    WebElement myElement;
    List<WebElement> myElementList;

    @FindBy(xpath = "//ms-add-button/div/button/span")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;
    @FindBy(xpath = " //span[text()='Active']")
    private WebElement activeslide;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    private WebElement orderInput;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button/button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;
    @FindBy(xpath = "//span[text()=' No ']")
    private WebElement noButton;

    @FindBy (xpath = "//ms-edit-button/button")
    private List<WebElement> editBtnList;

    @FindBy (xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

    @FindBy (xpath = "//ms-delete-button/button")
    private List<WebElement> deleteBtnList;


    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement msjContainer;

    @FindBy(xpath = "(//mat-select//div)[4]")
    private WebElement itemPerPageSelect;
    @FindBy(xpath = "//span[text()=' 100 ']")
    private WebElement itemPerPage;
    @FindBy(xpath = "//user-message-bell//button")
    private WebElement bellButton;
    @FindBy(xpath = "(//mat-toolbar-row//button)[2]")
    private WebElement closeButton;
    @FindBy(className = "cdk-overlay-container")
private WebElement Layer;
    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "addButton":
                myElement = addButton;
                break;
            case "bellButton":
                myElement = bellButton;
                break;
            case "closeButton":
                myElement = closeButton;
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
            case "noButton":
                myElement=noButton;
                break;
            case "Layer":
                myElement=Layer;
                break;

        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {
        switch (ElementName) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "shortNameInput":
                myElement = shortNameInput;
                break;
            case "orderInput":
                myElement = orderInput;
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

    public void waitUntilinVisible(String ElementName){
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;
        }
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }

}
