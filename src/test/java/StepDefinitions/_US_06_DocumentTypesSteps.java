package StepDefinitions;

import Pages._US_06_DialogContent;
import Pages._US_06_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _US_06_DocumentTypesSteps {
    _US_06_LeftNavigation leftNavigation = new _US_06_LeftNavigation();
    _US_06_DialogContent _US_06_DialogContent = new _US_06_DialogContent();
    Robot robot;
    String randomString;

    @When("^navigate to Document types page$")
    public void navigateToDocumentTypesPage() {
        leftNavigation.findElementAndClickFunction("setupButton");
        leftNavigation.findElementAndClickFunction("parametersButton");
        leftNavigation.findElementAndClickFunction("documentsTypesButton");
    }

    @Then("^create a new Document$")
    public void createANewDocument() throws AWTException {
        randomString = "Group8Nationalities_" + ""+((int)(Math.random()*1000));
        _US_06_DialogContent.findElementAndClickFunction("addButton");
        _US_06_DialogContent.findElementAndSendKeysFunction("nameInput", randomString);
        _US_06_DialogContent.findElementAndClickFunction("StageInput");
        _US_06_DialogContent.findElementAndClickFunction("ExaminationButton");
     //   _US_06_DialogContent.findElementAndClickFunction("newDocumentTag1");

        robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);


        _US_06_DialogContent.   findElementAndClickFunction("saveButton");
    }

    @And("^success message should be displayed$")
    public void successMessageShouldBeDisplayedCreate() {
        _US_06_DialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @Then("^edit a Document$")
    public void editADocument() throws AWTException {


        _US_06_DialogContent.findElementAndSendKeysFunction("nameInputForSearch", randomString);
        _US_06_DialogContent.findElementAndClickFunction("searchButton");

        _US_06_DialogContent.findElementAndEditFunction(randomString);
        _US_06_DialogContent.findElementAndSendKeysFunction("nameInput", (randomString+"888"));

        _US_06_DialogContent.findElementAndClickFunction("saveButton");

    }

    @And("^success message  should  be  displayed$")
    public void successMessageShouldBeDisplayedEdit() {
        _US_06_DialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @Then("^delete a Document account$")
    public void deleteADocumentAccount() {

        _US_06_DialogContent.findElementAndSendKeysFunction("nameInputForSearch", (randomString+"888"));
        _US_06_DialogContent.findElementAndClickFunction("searchButton");

        _US_06_DialogContent.findElementAndDeleteFunction((randomString+"888"));
        _US_06_DialogContent.findElementAndClickFunction("yesButton");
    }

    @And("^success message should   be   displayed$")
    public void successMessageShouldBeDisplayedDelete() {
        _US_06_DialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

}
