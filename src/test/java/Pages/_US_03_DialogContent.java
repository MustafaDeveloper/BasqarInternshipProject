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
//    @FindBy(tagName = "ms-edit-button")
//    private List<WebElement> editBtnList;

    @FindBy(tagName = "ms-delete-button")
    private List<WebElement> deleteBtnList;

    @FindBy(xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

    //--- general page max eleman select buttons
    @FindBy(css = "mat-select[role='combobox']")
    private WebElement pageSelectBtn;

    @FindBy(xpath = "//span[text()=' 1000 ']")
    private WebElement maxElementBtn;
    //-----------------------------------------------

    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement forwardButton;

    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@fxlayoutalign='start center']")
    private WebElement forTimeOut; // dashboard'da tiklayarak liste elemani gelene kadar zaman kazaniyor

    @FindBy(xpath = "//ms-edit-button/button")
    public List<WebElement> editBtnList;

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

            case "maxElementBtn":
                myElement = maxElementBtn;
                break;

            case "pageSelectBtn":
                myElement = pageSelectBtn;
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
    public void findElementAndDeleteFunction2(String deleteName) {

        editOrDelete(deleteBtnList, deleteName);
    }

    public void findElementAndEditFunction2(String editName) {
        editOrDelete(editBtnList, editName);
    }

    public void editOrDelete(List<WebElement> element, String name) {
        int i = 0;
        int returnNum = 0;
        boolean key = false;

        clickFunction(forTimeOut); // dashboard'da tiklayarak liste elemani gelene kadar zaman kazaniyor

        if (nameList.size() != 0) {
            String currentName = "";

            //waitVisibleListAllElement(myListElement);
            do {
                if (i == 0 && key == true) {
                    clickFunction(forTimeOut); //dashboard'da tiklayarak liste elemani gelene kadar zaman kazaniyor
                }
                currentName = nameList.get(i).getText();
                WebElement elm = element.get(i);
                i++;

                if (name.equalsIgnoreCase(currentName)) {
                    System.out.println(elm);
                    clickFunction(elm);
                    break;
                }
                if (i == 10 && forwardButton.isEnabled()) {
                    i = 0;
                    clickFunction(forwardButton);
                    key = true;
                }

            } while (!name.equals(currentName) && i < nameList.size());

        } else {
            System.out.println(" silinecek eleman bulunamadi....");
        }
    }



}

