package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Set;
public class _US_06_LeftNavigation extends _US_00_Parent{
    WebElement myElement;

    public _US_06_LeftNavigation(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]" )
    private WebElement setupButton;

    @FindBy(linkText = "Parameters")
    private WebElement parametersButton;

    @FindBy(linkText = "Document Types")
    private WebElement documentsTypesButton;

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName){

            case "setupButton":
                myElement = setupButton;
                break;

            case "parametersButton":
                myElement=parametersButton;
                break;

            case "documentsTypesButton":
                myElement = documentsTypesButton;
                break;

        }
        clickFunction(myElement);
    }


}
