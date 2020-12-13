package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.ArrayList;
import java.util.List;

public class _US_10_DialogContent extends _US_00_Parent {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public _US_10_DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;


    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public List<WebElement> nameList;


    @FindBy(xpath = "//ms-delete-button/button")
    private List<WebElement> deleteBtnList;

    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement deleteButton;


    @FindBy(xpath = "//ms-edit-button/button")
    public List<WebElement> editBtnList;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(linkText = "Got it!")
    private List<WebElement> gotItBtns;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;


    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement forwardButton;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement userTypeDropdown;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    public List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//span[text()='Budget Group']")
    private WebElement searchBudgetGroup;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement searchStatus;

    @FindBy(xpath = "//*[@role='listbox']/mat-option")
    private WebElement searchDropList;

    //--- general page max eleman select buttons
    @FindBy(xpath = "(//mat-select[@role='combobox'])[4]")
    private WebElement pageSelectBtn;

    @FindBy(xpath = "//span[text()=' 1000 ']")
    private WebElement maxElementBtn;
    //-----------------------------------------------

    @FindBy(xpath = "//span[text()='Unapprove']")
    private WebElement unapprove;

    @FindBy(xpath = "//td[text()=' No data to show ']")
    private WebElement noData;

    @FindBy(xpath = "//div[@fxlayoutalign='start center']")
    private WebElement forTimeOut; // dashboard'da tiklayarak liste elemani gelene kadar zaman kazaniyor

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":
                // bu eleman yok ise çoklu olarak yinede bulduk
                // eğer gerçekten yok ise size 0 olacağı için
                // bekletmeye düşmesin diye fonksiyonu geri gönderdik.

                if (gotItBtns.size() == 0)
                    return;

                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;


            case "searchButton":
                myElement = searchButton;
                break;

            case "userTypeDropdown":
                myElement = userTypeDropdown;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "searchBudgetGroup":
                myElement = searchBudgetGroup;
                break;
            case "searchStatus":
                myElement = searchStatus;
                break;

            case "searchDropList":
                myElement = searchDropList;
                break;

            case "unapprove":
                myElement = unapprove;
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

            case "codeInput":
                myElement = codeInput;
                break;

            case "shortName":
                myElement = shortName;
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

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
        }

        verifyElementContainsText(myElement, msg);
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }


    public void findElementAndDeleteFunction(String deleteName) {

        editOrDelete(deleteBtnList, deleteName);
    }

    public void findElementAndEditFunction(String editName) {
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


    public void selectUserType(String userType) {

        for (WebElement n : userTypeAllOptions) {
            if (n.getText().contains(userType)) {
                clickFunction(n);
                break;
            }
        }
    }


}
