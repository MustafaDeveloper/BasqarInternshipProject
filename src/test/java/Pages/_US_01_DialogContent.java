package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;


public class _US_01_DialogContent extends _US_00_Parent {

    WebElement myElement;
    List<WebElement> myElementList;

    public _US_01_DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//mat-chip-list//input")
    private WebElement userTypeButton;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> optionList;

    @FindBy(xpath = "//ms-save-button/button")
    private WebElement saveButton;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button/button")
    private List<WebElement> deleteBtnList;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

    @FindBy(xpath = "//ms-edit-button/button")
    private List<WebElement> editBtnList;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    //--- general page max eleman select buttons
    @FindBy(css = "mat-select[role='combobox']")
    private WebElement pageSelectBtn;

    @FindBy(xpath = "//span[text()=' 1000 ']")
    private WebElement maxElementBtn;
    //-----------------------------------------------

    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement msjContainer;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "addButton":
                myElement = addButton;
                break;
            case "userTypeButton":
                myElement = userTypeButton;
                break;
            case "optionList":
                int i = (int) (Math.random() * optionList.size());
                myElement = optionList.get(i);
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "searchButton":
                myElement = searchButton;
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
            case "msjContainer":
                myElement = msjContainer;
                break;
        }
        verifyElementContainsText(myElement, msg);
    }

    public void findElementAndDeleteFunction(String ElementName) {
        waitVisibleListAllElement(nameList);
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(deleteBtnList.get(i));
        }
    }

    public void findElementAndEditFunction(String ElementName) {
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(editBtnList.get(i));
        }
    }

    public void findElementAndVerifyName(String ElementName) {
        List<String> nameListText = new ArrayList<>();
        for (WebElement webElement : nameList) {
            nameListText.add(webElement.getText());
        }
        Assert.assertTrue(nameListText.contains(ElementName));
    }

    public void waitUntilinVisible(String ElementName) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;
        }
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }

    public void waitUntilunVisible(WebElement element) {

        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public WebElement getElement(String element) {
        switch (element) {
            case "addButton":
                myElement = addButton;
                break;
            case "userTypeButton":
                myElement = userTypeButton;
                break;
            case "optionList":
                int i = (int) (Math.random() * optionList.size());
                myElement = optionList.get(i);
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "searchButton":
                myElement = searchButton;
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

            case "msjContainer":
                myElement = msjContainer;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "searchNameInput":
                myElement = searchNameInput;
                break;

        }
            return myElement;
        }


    public List<WebElement> getListElement(String element) {

        switch (element) {


            case "deleteBtnList":
                myElementList = deleteBtnList;
                break;



        }
        return myElementList;
    }
}

