package StepDefinitions;

import Pages._US_09_DialogContent;
import Pages._US_09_FormContent;
import Pages._US_09_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _US_09_BudgetSetupSteps {
    _US_09_DialogContent dialogContent = new _US_09_DialogContent();
    _US_09_LeftNavigation leftNavigation = new _US_09_LeftNavigation();
    _US_09_FormContent formContent = new _US_09_FormContent();

    String createString;

    @When("^User should be able to view Budget Projects page$")
    public void userShouldBeAbleToViewBudgetProjectsPage() {
        leftNavigation.findElementAndClickFunction("budgetButton");
        leftNavigation.findElementAndClickFunction("budgetSetupBtn");
        leftNavigation.findElementAndClickFunction("bugdgetProjects");
    }

    @Then("^User should be able to Budget Projects and view successfully validating the message$")
    public void userShouldBeAbleToBudgetProjectsAndViewSuccessfullyValidatingTheMessage() {
        createString = "Hanova" + ""+((int)(Math.random()*1000));

        dialogContent.findElementAndClickFunction("addButton");
        formContent.findElementAndSendKeysFunction("nameInput", createString);
        formContent.findElementAndSendKeysFunction("codeInput", "3.3");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer", "success");
    }

    @And("^User should be not able to add without Code$")
    public void userShouldBeNotAbleToAddWithoutCode() {
        dialogContent.findElementAndClickFunction("addButton");
        formContent.findElementAndSendKeysFunction("nameInput", createString);
        dialogContent.checkSaveButton();
        dialogContent.findElementAndClickFunction("closeButton");
    }

    @When("^User should be able to delete Budget Projects and view successfully validating the message$")
    public void userShouldBeAbleToDeleteBudgetProjectsAndViewSuccessfullyValidatingTheMessage() {

//        dialogContent.findElementAndClickFunction("pageSelectBtn");
//        dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndDeleteFunction2(createString);
        dialogContent.findElementAndClickFunction("yesButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer", "success");
    }
}
