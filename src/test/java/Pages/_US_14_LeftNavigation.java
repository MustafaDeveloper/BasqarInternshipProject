package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class _US_14_LeftNavigation extends _US_00_Parent {
    WebElement myElement;

    public _US_14_LeftNavigation() {

        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//span[text()='Human Resources']")
    private WebElement humonButton;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private  WebElement setupButton;

    @FindBy(xpath = "//span[text()='Dismissal Articles']")
    private  WebElement dismissalButton;

    @FindBy(xpath = "//user-message-bell//button")
    private WebElement bellButton;

    @FindBy(xpath = "(//mat-toolbar-row//button)[2]")
    private WebElement closeButton;



    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "humonButton":
                myElement = humonButton;
                break;
            case "setupButton":
                myElement = setupButton;
                break;
            case "dismissalButton":
                myElement = dismissalButton;
                break;
            case "bellButton":
                myElement = bellButton;
                break;
            case "closeButton":
                myElement = closeButton;
                break;
        }
        clickFunction(myElement);
    }

    public void controlpageurl(String pageurl){


        Assert.assertTrue(pageurl.equals(driver.getCurrentUrl()));
    }










}
