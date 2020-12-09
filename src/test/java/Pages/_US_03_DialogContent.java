package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class _US_03_DialogContent extends _US_00_Parent {
    WebElement myElement;

    public _US_03_DialogContent() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//ms-add-button[@tooltip='FEE_TYPES.TITLE.ADD']//button")
    private WebElement addfeetypebutton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement priorityInput;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;
    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement SearchNameInput;
    @FindBy(xpath = "(//div[@fxlayout='row'])[8]//button")
    private WebElement SearchGeneral;
    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;
    @FindBy(tagName = "ms-edit-button")
    private List<WebElement> editBtnList;

    @FindBy(tagName = "ms-delete-button")
    private List<WebElement> deleteBtnList;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "addfeetypebutton":
                myElement = addfeetypebutton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "SearchGeneral":
                myElement = SearchGeneral;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String Elementname, String value) {
        switch (Elementname) {
            case "nameInput":
                myElement = nameInput;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
            case "priorityInput":
                myElement = priorityInput;
                break;
            case "SearchNameInput":
                myElement = SearchNameInput;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findElementAndVerifyContainsText(String Elementname, String mesaj) {
        switch (Elementname) {
            case "msjContainer":
                myElement = msjContainer;
                break;
        }
        verifyElementContainsText(myElement, mesaj);
    }

    public void findElementAndEditFunction(String ElementName) {
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(editBtnList.get(i));
        }
    }

    public void findElementAndDeleteFunction(String ElementName) {
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getText().equals(ElementName))
                clickFunction(deleteBtnList.get(i));
        }
    }


}

