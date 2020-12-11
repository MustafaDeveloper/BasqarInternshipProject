package StepDefinitions;

import Pages._US_04_DialogContent;
import Pages._US_04_FormContent;
import Pages._US_04_LeftNavigation;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class _US_04_DiscountsFunctionalitySteps {

    WebDriver driver;

    _US_04_LeftNavigation leftNavigation = new _US_04_LeftNavigation();
    _US_04_DialogContent dialogContent = new _US_04_DialogContent();
    _US_04_FormContent formContent = new _US_04_FormContent();


    @When("^Navigate to the Discounts page$")
    public void navigateToTheDiscountsPage() {
        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
        leftNavigation.findElementAndClickFunction("discounts");
    }


    @Then("^input discount's name is \"([^\"]*)\" code is \"([^\"]*)\" and priority is \"([^\"]*)\"$")
    public void inputDiscountSNameIsCodeIsAndPriorityIs(String name, String code, String priority) {

        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("discountInput",name);
        dialogContent.findElementAndClickFunction("discountInput");
        dialogContent.findElementAndSendKeysFunction("codeInput",code);
        dialogContent.findElementAndClickFunction("priorityCode");
        dialogContent.findElementAndSendKeysFunction("priorityCode",priority);
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer2","success");
        //dialogContent.waitUntilinVisible("msjContainer");
    }

    @And("^Navigate to Discounts page$")
    public void navigateToDiscountsPage() {
        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
        leftNavigation.findElementAndClickFunction("discounts");
        leftNavigation.findElementAndClickFunction("discounts");

    }

    @When("^delete created the discount name as \"([^\"]*)\"$")
    public void deleteCreatedTheDiscountNameAs(String name) {

        dialogContent.findElementAndSendKeysFunction("discountSearch",name);
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndDeleteFunction("New Year 2021");
        dialogContent.findElementAndClickFunction("yesButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer2","success");
        //dialogContent.waitUntilinVisible("msjContainer");
    }
}
