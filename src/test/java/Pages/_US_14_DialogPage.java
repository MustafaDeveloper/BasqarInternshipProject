package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _US_14_DialogPage extends _US_00_Parent{

    WebElement myElement;

    public _US_14_DialogPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addButton;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']/input")
    private WebElement descInput;


    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;


    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement msjContainer;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement inputSearchName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

    @FindBy (css = "mat-select[role='combobox']")
    private WebElement pageSelectBtn;

    @FindBy (xpath = "//span[text()=' 1000 ']")
    private WebElement maxElementBtn;

    @FindBy(xpath = "//ms-edit-button/button")
    private List <WebElement> editButtonList;

    @FindBy(xpath = "//ms-delete-button/button")
    private List<WebElement> deleteButtonList;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    public void findElementAndEditFunction(String elementName){
        for (int i = 0; i < nameList.size(); i++) {
            if(    nameList.get(i).getText().equals(elementName))
                clickFunction(editButtonList.get(i));
        }
    }

    public void findElementAndDeleteFunction(String elementName){
        for (int i = 0; i < nameList.size(); i++) {
            if(    nameList.get(i).getText().equals(elementName))
                clickFunction(deleteButtonList.get(i));
        }
    }

    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;
            case "searchButton":
                myElement = searchButton;
                break;
            case "pageSelectBtn":
                myElement = pageSelectBtn;
                break;
            case "maxElementBtn":
                myElement = maxElementBtn;
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

            case "descInput":
                myElement = descInput;
                break;

            case "inputSearchName":
                myElement = inputSearchName;
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
        verifyElementContainsText(myElement,msg);
    }
    public void waitUntilunVisible(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void elementNameControl(String elementName){
        List<String > elementNameStringList=new ArrayList<>();
        List<WebElement> controlList=waitVisibleListAllElement(nameList);
        for (WebElement webElement : controlList) {
            elementNameStringList.add(webElement.getText());
        }
        Assert.assertTrue(elementNameStringList.contains(elementName));

    }




}





