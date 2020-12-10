package StepDefinitions;

import Pages._US_03_DialogContent;
import Pages._US_03_LeftNavigation;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _US_03_FeeSteps {
    _US_03_DialogContent dialogContent3 = new _US_03_DialogContent();
    _US_03_LeftNavigation leftNavigation3 = new _US_03_LeftNavigation();

    @Then("^go to Fees Page$")
    public void goToFeesPage() {
        leftNavigation3.findElementAndClickFunction("setupOne");
        leftNavigation3.findElementAndClickFunction("parameters");
        leftNavigation3.findElementAndClickFunction("fees");
    }

    @When("^Create a Fee Type name as \"([^\"]*)\" and code as \"([^\"]*)\" and priority as \"([^\"]*)\"$")
    public void createAFeeTypeNameAsAndCodeAsAndPriorityAs(String name, String code, String priority) {
        dialogContent3.findElementAndClickFunction("addfeetypebutton");
        dialogContent3.findElementAndSendKeysFunction("nameInput", name);
        dialogContent3.findElementAndSendKeysFunction("codeInput", code);
        dialogContent3.findElementAndSendKeysFunction("priorityInput", priority);
        dialogContent3.findElementAndClickFunction("saveButton");
    }

    @Then("^Success_03 message should be displayed$")
    public void successMessageShouldBeDisplayed() {
        dialogContent3.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String oldfee, String newfee) {
        dialogContent3.findElementAndSendKeysFunction("SearchNameInput", oldfee);
        dialogContent3.findElementAndClickFunction("SearchGeneral");
        dialogContent3.findElementAndEditFunction(oldfee);
        dialogContent3.findElementAndSendKeysFunction("nameInput", newfee);
        dialogContent3.findElementAndClickFunction("saveButton");

    }

    @When("^User delete the \"([^\"]*)\"$")
    public void userDeleteThe(String lastfee)  {
        dialogContent3.findElementAndSendKeysFunction("SearchNameInput",lastfee);
        dialogContent3.findElementAndClickFunction("SearchGeneral");
        dialogContent3.findElementAndDeleteFunction(lastfee);
       dialogContent3.findElementAndClickFunction("yesButton");

    }
}


