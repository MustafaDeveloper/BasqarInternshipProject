package StepDefinitions;

import Pages._US_10_DialogContent;
import Pages._US_10_FormContent;
import Pages._US_10_LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class _US_10_BudgetFunctionality {
    _US_10_LeftNavigation leftNavigation = new _US_10_LeftNavigation();
    _US_10_DialogContent dialogContent = new _US_10_DialogContent();
    _US_10_FormContent formContent = new _US_10_FormContent();

    @When("^navigate to budget$")
    public void navigateToBudget() {
        leftNavigation.findElementAndClickFunction("budgetButton");
        leftNavigation.findElementAndClickFunction("budgetsSubMenu");
    }


    @Then("^create a budget with incomplete form$")
    public void createABudgetWithIncompleteForm() {
        dialogContent.findElementAndClickFunction("addButton");

        formContent.findElementAndClickFunction("descriptionClick");
        formContent.findElementAndSendKeysFunction("descriptionText", "aaa");
        formContent.findElementAndClickFunction("yearClick");
        formContent.findElementAndSendKeysFunction("yearNumber", "2020");

        formContent.findElementAndClickFunction("budgetGroup");
        formContent.findElementAndClickFunction("option1");

        formContent.findElementAndClickFunction("type");
        formContent.findElementAndClickFunction("option1");
    }


    @Then("^create a budget with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void createABudgetWithAnd(String description, String year) {
        dialogContent.findElementAndClickFunction("addButton");

        formContent.findElementAndClickFunction("descriptionClick");
        formContent.findElementAndSendKeysFunction("descriptionText", description);
        formContent.findElementAndClickFunction("yearClick");
        formContent.findElementAndSendKeysFunction("yearNumber", year);

        formContent.findElementAndClickFunction("budgetGroup");
        formContent.findElementAndClickFunction("option1");

        formContent.findElementAndClickFunction("school");
        formContent.findElementAndClickFunction("option1");

        formContent.findElementAndClickFunction("type");
        formContent.findElementAndClickFunction("option1");

        formContent.findElementAndClickFunction("saveButton");
        formContent.findElementAndClickFunction("approve");

        dialogContent.findElementAndClickFunction("yesButton");
        //formContent.findElementAndClickFunction("closeDialog");
    }


    @And("^error message should  be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "Error");
    }

    @And("^success message should  be displayed$")
    public void successMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "success");

    }


    @Then("^edit a budget$")
    public void editABudget() {
        dialogContent.findElementAndClickFunction("searchBudgetGroup");
        dialogContent.findElementAndClickFunction("searchDropList");
        dialogContent.findElementAndClickFunction("searchStatus");
        dialogContent.findElementAndClickFunction("searchDropList");

        dialogContent.findElementAndClickFunction("searchButton");

        dialogContent.findElementAndEditFunction("Group88");
        dialogContent.findElementAndClickFunction("unapprove");
        dialogContent.findElementAndClickFunction("yesButton");
        formContent.findElementAndClickFunction("closeDialog");

    }

    @Then("^delete a budget$")
    public void deleteABudget() {
        dialogContent.findElementAndDeleteFunction("Group88");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @And("^save button can not be clicked$")
    public void saveButtonNotClicked() {
        if (!formContent.findElementAndClickFunction("saveButton")) {
            System.out.println(" *****   Save Button could not be find...  *********");
        }
    }

}
