package StepDefinitions;

import Pages._US_05_DialogContent;
import Pages._US_05_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _US_05_GradeLevelsSteps {
    WebDriver driver;
    _US_05_LeftNavigation leftNavigation = new _US_05_LeftNavigation();
    _US_05_DialogContent dialogContent = new _US_05_DialogContent();
    String createString;

    @When("^Navigate to Grade levels  page$")
   public void navigateToGradelevelsPage() {

        leftNavigation.findElementAndClickFunction("setUpGeneral");
        leftNavigation.findElementAndClickFunction("parameterButton");
        leftNavigation.findElementAndClickFunction("gardeLevelsButton");


    }
    @Then("^Create a Grade$")
    public void CreateAGrade() {
        createString = "Group8_" + ""+((int)(Math.random()*1000));
        leftNavigation.findElementAndClickFunction("gardeLevelsButton");
       dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput",createString);
        dialogContent.findElementAndSendKeysFunction("shortNameInput",(createString+"n7"));
       dialogContent.findElementAndSendKeysFunction("orderInput","1");
        dialogContent.findElementAndClickFunction("saveButton");

    }
 @And("^Success message  should be displayed$")
    public void Successmessageshouldbedisplayed(){
      dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
     dialogContent.waitUntilinVisible("msjContainer");
  }
    @Then("^Edit a Grade levels$")
    public void EditaGradelevels()  {

       dialogContent.findElementAndEditFunction2(createString);
        dialogContent.findElementAndSendKeysFunction("nameInput",(createString+"88"));
        dialogContent.findElementAndClickFunction("activeslide");
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @Then("^Success message should be  displayed$")
    public void SuccessMessageshouldbedisplayed()  {
    dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilinVisible("msjContainer");
    }

    @Then("^Delete a Grade levels$")
    public void DeleteaGradelevels() throws InterruptedException, AWTException {
        dialogContent.findElementAndDeleteFunction2((createString+"88"));
        dialogContent.findElementAndClickFunction("yesButton");

    }
    @And("^Success  message  should be displayed$")
    public void SuccessMessageShouldbedisplayed(){
      dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilinVisible("msjContainer");
    }
}

