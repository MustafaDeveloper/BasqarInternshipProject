package StepDefinitions;

import Pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class _US_12_AttestationsFunctionalitySteps {

    _US_12_LeftNavigation leftNavigation = new _US_12_LeftNavigation();
    _US_12_DialogContent dialogContent = new _US_12_DialogContent();
    _US_04_FormContent formContent = new _US_04_FormContent();


    @When("^Navigate to the Attestations page$")
    public void navigateToTheAttestationsPage() {
        leftNavigation.findElementAndClickFunction("humanResource");
        leftNavigation.findElementAndClickFunction("humanResourceSetup");
        leftNavigation.findElementAndClickFunction("attestations");

    }

    @Then("^input Attestation's name \"([^\"]*)\"$")
    public void inputAttestationSName(String name) {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput",name);
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @Then("^check the created \"([^\"]*)\" name$")
    public void checkTheCreatedName(String name) {
        dialogContent.findElementAndClickFunction("searchName");
        dialogContent.findElementAndSendKeysFunction("searchNameInput", name);
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("itemPerPageSelect");
        dialogContent.findElementAndClickFunction("itemPerPage");
        dialogContent.checkElementName("Okay");

    }

    @And("^success message should be displayed\\.$")
    public void successMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "success");
    }



    @When("^edit the created name$")
    public void editTheCreatedName() {
        leftNavigation.findElementAndClickFunction("nations");
        leftNavigation.findElementAndClickFunction("attestations");

        dialogContent.findElementAndClickFunction("addbuttonn");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @And("^Navigate to Attestations page$")
    public void navigateToAttestationsPage() {
        leftNavigation.findElementAndClickFunction("humanResource");
        leftNavigation.findElementAndClickFunction("humanResourceSetup");
        leftNavigation.findElementAndClickFunction("attestations");

    }

    @When("^delete teh created attestation name as \"([^\"]*)\"$")
    public void deleteTehCreatedAttestationNameAs(String name) {
        //dialogContent.findElementAndClickFunction("pageBtn");
        //dialogContent.findElementAndClickFunction("maxElement");
        //dialogContent.findElementAndClickFunction("itemPerPageSelect");
        //dialogContent.findElementAndClickFunction("itemPerPage");
        //dialogContent.findElementAndClickFunction("itemPerPage");
        dialogContent.findElementAndClickFunction("zil");
        dialogContent.findElementAndClickFunction("zilClose");
        dialogContent.findElementAndDeleteFunction1("Okay");
        dialogContent.findElementAndClickFunction("yesButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer", "success");

    }


}
