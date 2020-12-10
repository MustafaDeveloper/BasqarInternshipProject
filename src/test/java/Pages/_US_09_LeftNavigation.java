package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_09_LeftNavigation extends _US_00_Parent{
    WebElement myElement;

    public _US_09_LeftNavigation(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budgetButton;

    @FindBy (xpath = "(//span[text()='Setup'])[6]")
    private WebElement budgetSetupBtn;

    @FindBy (xpath = "(//span[text()='Budget Projects'])[1]")
    private WebElement bugdgetProjects;

    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {

            case "budgetButton":
                myElement = budgetButton;
                break;

            case "budgetSetupBtn":
                myElement = budgetSetupBtn;
                break;

            case "bugdgetProjects":
                myElement = bugdgetProjects;
                break;

        }
        clickFunction(myElement);
    }
}
