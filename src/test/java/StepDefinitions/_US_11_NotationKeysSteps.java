package StepDefinitions;

import Pages._US_06_DialogContent;
import Pages._US_06_LeftNavigation;
import Pages._US_11_DialogContent;
import Pages._US_11_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _US_11_NotationKeysSteps {
    _US_11_LeftNavigation leftNavigation=new _US_11_LeftNavigation();
    Pages._US_11_DialogContent dialogContent = new _US_11_DialogContent();
    @When("^navigate to Notation Keys  page$")
    public void navigateToNotationKeysPage() {
        leftNavigation.findElementAndClickFunction("humanResourcesButton");
          leftNavigation.findElementAndClickFunction("setupButton");
        leftNavigation.findElementAndClickFunction("notationKeysButton");

    }

    @Then("^create a new Notation Keys$")
    public void createANewNotationKeys() {
     dialogContent.findElementAndClickFunction("addButton");
       dialogContent.findElementAndSendKeysFunction("nameInput","group88");
       dialogContent.findElementAndSendKeysFunction("shortNameInput","88");
       dialogContent.findElementAndSendKeysFunction("multiplierInput","12");
       dialogContent.findElementAndClickFunction("applyButton");
    }

   @And("^success message  should be displayed$")
   public void successMessageShouldBeDisplayed1() {
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
      }

    @Then("^edit a Notation Keys$")
    public void editANotationKeys() {
        dialogContent.findElementAndSendKeysFunction("nameInputForSearch","group88");
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndEditFunction("group88");
        dialogContent.findElementAndSendKeysFunction("multiplierInput","2");
        dialogContent.findElementAndClickFunction("applyButton");
    }
    @And("^success message should be  displayed$")
    public void successMessageShouldBeDisplayed2() {
      dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
    }
    @Then("^delete a Notation Keys account$")
    public void deleteANotationKeysAccount() {
        dialogContent.findElementAndSendKeysFunction("nameInputForSearch","group88");
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndDeleteFunction("group88");
        dialogContent.findElementAndClickFunction("yesButton");

    }

    @And("^success  message  should be displayed$")
    public void successMessageShouldBeDisplayed3() {
       dialogContent.findElementAndVerifyContainsText("msjContainer","successfully deleted");
    }


}
