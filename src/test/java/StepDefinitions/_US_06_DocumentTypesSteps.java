package StepDefinitions;

import Pages._US_06_DialogContent;
import Pages._US_06_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _US_06_DocumentTypesSteps {
    _US_06_LeftNavigation leftNavigation=new _US_06_LeftNavigation();
    _US_06_DialogContent _US_06_DialogContent = new _US_06_DialogContent();
    @When("^navigate to Document types page$")
    public void navigateToDocumentTypesPage() {
        leftNavigation.findElementAndClickFunction("setupButton");
        leftNavigation.findElementAndClickFunction("parametersButton");
        leftNavigation.findElementAndClickFunction("documentsTypesButton");
    }

    @Then("^create a new Document$")
    public void createANewDocument() {
        _US_06_DialogContent.findElementAndClickFunction("addButton");
        _US_06_DialogContent.findElementAndSendKeysFunction("nameInput","group 08");
        _US_06_DialogContent.findElementAndClickFunction("StageInput");
        _US_06_DialogContent.findElementAndClickFunction("ExaminationButton");
        _US_06_DialogContent.findElementAndClickFunction("saveButton");
        _US_06_DialogContent.findElementAndClickFunction("saveButton");
    }

    @And("^success message should be displayed$")
    public void successMessageShouldBeDisplayedCreate() {
        _US_06_DialogContent.findElementAndVerifyContainsText("msjContainer","Document  successfully created");
    }

    @Then("^edit a Document$")
    public void editADocument() {
        leftNavigation.findElementAndClickFunction("setupButton");
        leftNavigation.findElementAndClickFunction("parametersButton");
        leftNavigation.findElementAndClickFunction("documentsTypesButton");
        _US_06_DialogContent.findElementAndSendKeysFunction("nameInputForSearch","group 08");
        _US_06_DialogContent.findElementAndClickFunction("searchButton");
        _US_06_DialogContent.findElementAndClickFunction("editButton");
        _US_06_DialogContent.findElementAndSendKeysFunction("nameInput","group 8");
        _US_06_DialogContent.findElementAndClickFunction("saveButton");

    }

    @And("^success message  should  be  displayed$")
    public void successMessageShouldBeDisplayedEdit() {
        _US_06_DialogContent.findElementAndVerifyContainsText("msjContainer","Document successfully  updated");
    }

    @Then("^delete a Document account$")
    public void deleteADocumentAccount() {
        leftNavigation.findElementAndClickFunction("setupButton");
        leftNavigation.findElementAndClickFunction("parametersButton");
        leftNavigation.findElementAndClickFunction("documentsTypesButton");
        _US_06_DialogContent.findElementAndSendKeysFunction("nameInputForSearch","group 8");
        _US_06_DialogContent.findElementAndClickFunction("deleteButton");
        _US_06_DialogContent.findElementAndClickFunction("yesButton");

    }

    @And("^success message should   be   displayed$")
    public void successMessageShouldBeDisplayedDelete() {
        _US_06_DialogContent.findElementAndVerifyContainsText("msjContainer","Document successfully  deleted");
    }

}
