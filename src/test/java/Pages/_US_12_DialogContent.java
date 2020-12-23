package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _US_12_DialogContent extends _US_00_Parent {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public _US_12_DialogContent() {
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

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;


    @FindBy(xpath = "//ms-delete-button/button")
    private List<WebElement> deleteBtnList;

    @FindBy(xpath = "//ms-delete-button/button") // kullandim
    public WebElement deleteButton;


    @FindBy(xpath = "//ms-edit-button/button")
    public List<WebElement> editButtonList;

    @FindBy(xpath = "//span[text()=' Yes ']") // kullandim
    private WebElement yesButton;

    @FindBy(linkText = "Got it!")
    private List<WebElement> gotItBtns;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;


    @FindBy(xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']") // kullandm
    private WebElement searchName;

    @FindBy(xpath = "//ms-search-button//button")  // kullandim
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

    @FindBy(xpath = "//span[text()='Unapprove']")
    private WebElement unapprove;

    // ****************************************************************

    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']/input")
    private WebElement discountInput;

    @FindBy(xpath = "//ms-text-field[@type='number']/input")
    private WebElement priorityCode;

    @FindBy (css = "//mat-select[@role='combobox']/div/div")   //(//mat-select//div)[4]
    private WebElement pageBtn;

    @FindBy (xpath = "//span[text()=' 1000 ']")
    private WebElement maxElement;

    @FindBy (xpath = "(//span[@class='mat-button-focus-overlay'])[9]")
    private WebElement editBtn;

    @FindBy (xpath = "//ms-text-field[@placeholder='DISCOUNT.TITLE.DESCRIPTION']/input")
    private WebElement discountSearch;

    @FindBy (xpath = "//div[@role='alertdialog']")
    private WebElement msjContainer2;

    @FindBy (xpath = "//td[text()='Okay']")
    private WebElement nameCheck;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper'])[41]")
    private WebElement next;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper'])[37]")
    private WebElement back;

    @FindBy (xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeBtn;

    @FindBy (xpath = "(//ms-edit-button[@class='ng-tns-c507-43 ng-star-inserted'])[1]")
    private WebElement addBtnnn;

    @FindBy (xpath = "//ms-edit-button/button")
    private WebElement addbuttonn;

    @FindBy (xpath = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input")
    private WebElement searchNameInput;

    @FindBy(xpath = "(//mat-select//div)[4]")
    private WebElement itemPerPageSelect;
    @FindBy(xpath = "//span[text()=' 10 ']")
    private WebElement itemPerPage;

    @FindBy(xpath = "//user-message-bell[@class='ng-star-inserted']/button/span")
    private WebElement zil;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement zilClose;


















    //















    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName){

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
                myElement = addButton; // kullandim
                break;

            case "saveButton":
                myElement = saveButton; //kullandim
                break;

            case "yesButton":
                myElement = yesButton;
                break;


            case "searchButton":
                myElement = searchButton; //kullandim
                break;

            case "userTypeDropdown":
                myElement = userTypeDropdown;
                break;

            case "deleteButton":
                myElement = deleteButton; // kullandim
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

                // *******************************************

            case "codeInput":
                myElement = codeInput;
                break;

            case "priorityCode":
                myElement = priorityCode;
                break;

            case "pageBtn":
                myElement = pageBtn;
                break;

            case "maxElement":
                myElement = maxElement;
                break;

            case "editBtn":
                myElement = editBtn;
                break;

            case "discountSearch":
                myElement = discountSearch;
                break;

            case "next":
                myElement = next;
                break;

            case "back":
                myElement = back;
                break;

            case "closeBtn":
                myElement = closeBtn;
                break;

            case "addBtnnn":
                myElement = addBtnnn;
                break;

            case "addbuttonn":
                myElement = addbuttonn;
                break;

            case "searchName":
                myElement = searchName;
                break;

            case "itemPerPageSelect":
                myElement = itemPerPageSelect;
                break;

            case "itemPerPage":
                myElement = itemPerPage;
                break;

            case "zil":
                myElement = zil;
                break;

            case "zilClose":
                myElement = zilClose;
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
                myElement = codeInput; // kullandim
                break;

            case "shortName":
                myElement = shortName;
                break;

                // *********************************************

            case "searchNameInput":
                myElement = searchNameInput;
                break;

            case "discountInput":
                myElement = discountInput;
                break;

            case "priorityCode":
                myElement = priorityCode;
                break;

            case "discountSearch":
                myElement = discountSearch;
                break;





        }
        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "msjContainer2":
                myElement = msjContainer2;
                break;

            case "nameCheck":
                myElement = nameCheck;
                break;
        }

        Assert.assertTrue(true,"Okay");

        verifyElementContainsText(myElement, msg);
        //wait.until(ExpectedConditions.invisibilityOf(myElement));
    }

    public void findElementAndDeleteFunction(String deleteName) {
        editOrDelete(deleteBtnList, deleteName);
    }

    public void findElementAndEditFunction(String editName) {
        editOrDelete(editButtonList, editName);
    }

    public void editOrDelete(List<WebElement> element, String name) {
        int i = 0;
        int returnNum = 0;
        if (nameList.size() != 0) {
            String currentName = "";

            //waitVisibleListAllElement(myListElement);
            do {
                currentName = nameList.get(i).getText();
                WebElement elm=element.get(i);
                i++;

                if (name.equalsIgnoreCase(currentName)) {
                    System.out.println(elm);
                    clickFunction(elm);
                    break;
                }
                if (i == 10 && forwardButton.isEnabled()) {
                    i = 0;
                    clickFunction(forwardButton);
                    //waitUntilInvisible(forwardButton);
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
    public void waitUntilinVisible(String ElementName){
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;
        }
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }

    public void checkElementName(String elementName)
    {
        List<String > elementStrName=new ArrayList<>();
        for (WebElement webElement : nameList) {
            elementStrName.add(webElement.getText());
        }
        Assert.assertTrue(elementStrName.contains(elementName));
    }

    public void findElementAndDeleteFunction1(String elementName)
    {
        // waitVisibleListAllElement(nameList);
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(i).getText().equals(elementName))
                clickFunction(deleteBtnList.get(i));

        }
    }



}
