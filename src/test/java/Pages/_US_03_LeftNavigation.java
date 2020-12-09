package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_03_LeftNavigation extends _US_00_Parent {
    WebElement myElement;
    public _US_03_LeftNavigation(){
        PageFactory.initElements(driver,this);}

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    public void findElementAndClickFunction(String elementName) {
        switch (elementName) {
            case "setupOne":
                myElement = setupOne;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "fees":
                myElement = fees;
                break;
}
clickFunction(myElement);
    }}