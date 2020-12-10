package StepDefinitions;

import Pages._US_02_NationalityPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class _US_02_NationalitiesSteps {
    _US_02_NationalityPage nationalityPage = new _US_02_NationalityPage();

    String createString;

    @When("^User should be able to create new Nationalites$")

    public void userShouldBeAbleToCreateNewNationalites() {

        createString = "Group8Nationalities_" + ""+((int)(Math.random()*1000));

        nationalityPage.findElementAndClickFunction("setUpGeneral");
        nationalityPage.findElementAndClickFunction("parameterButton");
        nationalityPage.findElementAndClickFunction("nationalitiesButton");
        nationalityPage.findElementAndClickFunction("addButton");
        nationalityPage.findElementAndSendKeysFunction("nameInput", createString);
        nationalityPage.findElementAndClickFunction("saveButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer", "successfully");
        nationalityPage.waitUntilunVisible(nationalityPage.msjContainer);


    }

    @Then("^User should not be able to create a Nationality that is exists with similar name$")
    public void userShouldNotBeAbleToCreateANationalityThatIsExistsWithSimilarName() {
        nationalityPage.findElementAndClickFunction("addButton");
        nationalityPage.findElementAndSendKeysFunction("nameInput", createString);
        nationalityPage.findElementAndClickFunction("saveButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer", "already exists");
        nationalityPage.findElementAndClickFunction("closeButton");


    }

    @Then("^User should be able to update an existant Nationality$")
    public void userShouldBeAbleToUpdateAnExistantNationality() {
        nationalityPage.findElementAndSendKeysFunction("inputSearchName", createString);
        nationalityPage.findElementAndClickFunction("searchButton");
        nationalityPage.findElementAndEditFunction(createString);
        nationalityPage.findElementAndSendKeysFunction("nameInput", createString+"2");
        nationalityPage.findElementAndClickFunction("saveButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer", "successfully");
        nationalityPage.waitUntilunVisible(nationalityPage.msjContainer);


    }

    @Then("^User should be able to delete an existant Nationality$")
    public void userShouldBeAbleToDeleteAnExistantNationality() {

        nationalityPage.findElementAndSendKeysFunction("inputSearchName", createString+"2");
        nationalityPage.findElementAndClickFunction("searchButton");
        nationalityPage.findElementAndDeleteFunction(createString+"2");
        nationalityPage.findElementAndClickFunction("yesButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer", "successfully");
        nationalityPage.waitUntilunVisible(nationalityPage.msjContainer);


    }
}
