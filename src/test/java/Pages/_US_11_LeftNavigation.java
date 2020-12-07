package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_11_LeftNavigation extends _US_00_Parent {

        WebElement myElement;

        public _US_11_LeftNavigation() {
            PageFactory.initElements(driver, this);
        }

        @FindBy(linkText = "Human Resources")
        private WebElement humanResourcesButton;

        @FindBy(xpath = "(//span[text()='Setup'])[3]")
        private WebElement setupButton;

        @FindBy(linkText = "Notation Keys")
        private WebElement notationKeysButton;

        public void findElementAndClickFunction(String ElementName) {

            switch (ElementName) {

                case "humanResourcesButton":
                    myElement = humanResourcesButton;
                    break;

                case "setupButton":
                    myElement = setupButton;
                    break;

                case "notationKeysButton":
                    myElement = notationKeysButton;
                    break;


            }
            clickFunction(myElement);
        }
    }


