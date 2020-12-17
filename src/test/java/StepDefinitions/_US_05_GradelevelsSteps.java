package StepDefinitions;

import Pages._US_05_DialogContent;
import Pages._US_05_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;

public class _US_05_GradelevelsSteps {
    WebDriver driver;
    _US_05_LeftNavigation leftNavigation = new _US_05_LeftNavigation();
    _US_05_DialogContent dialogContent = new _US_05_DialogContent();
    @When("^Navigate to Grade levels  page$")
   public void navigateToGradelevelsPage() throws InterruptedException {

        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
        leftNavigation.findElementAndClickFunction("gardeLevelsButton");


    }
    @Then("^Create a Grade$")
    public void CreateAGrade() throws InterruptedException {

       dialogContent.findElementAndClickFunction("addButton");

        dialogContent.findElementAndSendKeysFunction("nameInput","nalan");
        dialogContent.findElementAndSendKeysFunction("shortNameInput","n7");
       dialogContent.findElementAndSendKeysFunction("orderInput","1");
        dialogContent.findElementAndClickFunction("saveButton");

    }
 @And("^Success message  should be displayed$")
    public void Successmessageshouldbedisplayed(){
      dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
     dialogContent.waitUntilinVisible("msjContainer");
  }
    @Then("^Edit a Grade levels$")
    public void EditaGradelevels() throws InterruptedException {

       dialogContent.findElementAndEditFunction("nalan");

        dialogContent.findElementAndSendKeysFunction("nameInput","nalan8");

        dialogContent.findElementAndClickFunction("activeslide");

        dialogContent.findElementAndClickFunction("saveButton");

    }

    @Then("^Success message should be  displayed$")
    public void SuccessMessageshouldbedisplayed() throws InterruptedException {


    dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilinVisible("msjContainer");
    }

    @Then("^Delete a Grade levels$")
    public void DeleteaGradelevels() throws InterruptedException {

        dialogContent.findElementAndDeleteFunction("nalan8");

        dialogContent.findElementAndClickFunction("deleteButton");

        dialogContent.findElementAndClickFunction("deleteButton");

dialogContent.findElementAndClickFunction("Layer");
        dialogContent.findElementAndClickFunction("yesButton");



    }
    @And("^Success  message  should be displayed$")
    public void SuccessMessageShouldbedisplayed(){
      dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilinVisible("msjContainer");
    }
}

