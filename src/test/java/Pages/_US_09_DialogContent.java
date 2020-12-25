package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _US_09_DialogContent extends _US_00_Parent{

    WebElement myElement;

    public _US_09_DialogContent(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindBy(xpath = "(//ms-delete-button/button)[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//mat-toolbar-row/button[2]")
    public WebElement closeButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement yesButton;

    //--- general page max eleman select buttons
    @FindBy (css = "mat-select[role='combobox']")
    private WebElement pageSelectBtn;

    @FindBy (xpath = "//span[text()=' 1000 ']")
    private WebElement maxElementBtn;

    @FindBy (xpath = "//ms-delete-button/button")
    private List<WebElement> deleteBtnList;
    @FindBy (xpath = "//ms-edit-button/button")
    private List<WebElement> editBtnList;
    @FindBy (xpath = "//tbody/tr/td[2]")
    private List<WebElement> nameList;

    @FindBy(xpath = "//div[@fxlayoutalign='start center']")
    private WebElement forTimeOut; // dashboard'da tiklayarak liste elemani gelene kadar zaman kazaniyor
    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement forwardButton;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName){

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "closeButton":
                myElement = closeButton;
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






    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

        }
        verifyElementContainsText(myElement, msg);
        wait.until(ExpectedConditions.invisibilityOf(myElement));
    }
    public void checkSaveButton (){
        Assert.assertTrue(saveButton.isEnabled()==false);
    }
}
