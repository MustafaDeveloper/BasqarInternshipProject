package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_09_FormContent extends _US_00_Parent {
    WebElement myElement;

    public _US_09_FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@formcontrolname='code']")
    private WebElement codeInput;


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "nameInput":
                myElement = nameInput;
                break;

            case "codeInput":
                myElement = codeInput;
                break;
        }

        sendKeysFunction(myElement, value);

    }
}
