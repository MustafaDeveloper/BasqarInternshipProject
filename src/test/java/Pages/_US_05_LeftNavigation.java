package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_05_LeftNavigation extends _US_00_Parent {
    WebElement myElement;


    public _US_05_LeftNavigation() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpGeneral;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterButton;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gardeLevelsButton;



    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "setUpGeneral":
                myElement = setUpGeneral;
                break;

            case "parameterButton":
                myElement = parameterButton;
                break;

            case "gardeLevelsButton":
                myElement = gardeLevelsButton;
                break;

        }
        clickFunction(myElement);
    }
}




