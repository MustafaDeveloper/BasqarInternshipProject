package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_07_LeftNavigation extends _US_00_Parent{
    WebElement myElement;

    public _US_07_LeftNavigation(){ PageFactory.initElements(driver,this);}
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setUpGeneral;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterButton;

    @FindBy(xpath = " (//span[text()='Fees'])[1]")
    private WebElement feesButton;



}
