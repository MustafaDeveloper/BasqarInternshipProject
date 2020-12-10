package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class _US_02_NationalityPage extends _US_00_Parent {
    WebElement myElement;


    public _US_02_NationalityPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpGeneral;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterButton;

   @FindBy(xpath = "//span[text()='Nationalities']")
   private WebElement nationalitiesButton;

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement addButton;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement nameInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement msjContainer;

    @FindBy(xpath = "(//mat-toolbar//button)[6]")
    private WebElement closeButton;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement inputSearchName;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-edit-button/button")
    private List <WebElement> editButtonList;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

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
            case "setUpGeneral":
                myElement = setUpGeneral;
                break;

            case "parameterButton":
                myElement = parameterButton;
                break;

            case "nationalitiesButton":
                myElement = nationalitiesButton;
                break;


            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "closeButton":
                myElement = closeButton;
                break;

            case "searchButton":
                myElement = searchButton;
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
        wait.until(ExpectedConditions.invisibilityOf(myElement));

    }
    public void waitUntilunVisible(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
