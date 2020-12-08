package StepDefinitions;

import Pages._US_02_NationalityPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _US_02_NationalitiesSteps {
    _US_02_NationalityPage nationalityPage=new _US_02_NationalityPage();

    @When("^User should be able to create new Nationalites$")
    public void userShouldBeAbleToCreateNewNationalites()  {
        nationalityPage.findElementAndClickFunction("setUpGeneral");
        nationalityPage.findElementAndClickFunction("parameterButton");
        nationalityPage.findElementAndClickFunction("nationalitiesButton");
        nationalityPage.findElementAndClickFunction("addButton");
        nationalityPage.findElementAndSendKeysFunction("nameInput", "Group8Nationalities1");
        nationalityPage.findElementAndClickFunction("saveButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer","successfully");
        nationalityPage.waitUntilunVisible(nationalityPage.msjContainer);


    }

    @Then("^User should not be able to create a Nationality that is exists with similar name$")
    public void userShouldNotBeAbleToCreateANationalityThatIsExistsWithSimilarName()  {
        nationalityPage.findElementAndClickFunction("addButton");
        nationalityPage.findElementAndSendKeysFunction("nameInput", "Group8Nationalities1");
        nationalityPage.findElementAndClickFunction("saveButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer","error");
        nationalityPage.findElementAndClickFunction("closeButton");


    }

    @Then("^User should be able to update an existant Nationality$")
    public void userShouldBeAbleToUpdateAnExistantNationality()  {
        nationalityPage.findElementAndSendKeysFunction("inputSearchName","Group8Nationalities1" );
        nationalityPage.findElementAndClickFunction("searchButton");
        nationalityPage.findElementAndEditFunction("Group8Nationalities1");
        nationalityPage.findElementAndSendKeysFunction("nameInput","Group8Nationalities2");
        nationalityPage.findElementAndClickFunction("saveButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer","successfully");
        nationalityPage.waitUntilunVisible(nationalityPage.msjContainer);


    }

    @Then("^User should be able to delete an existant Nationality$")
    public void userShouldBeAbleToDeleteAnExistantNationality()  {

        nationalityPage.findElementAndSendKeysFunction("inputSearchName","Group8Nationalities2" );
        nationalityPage.findElementAndClickFunction("searchButton");
        nationalityPage.findElementAndDeleteFunction("Group8Nationalities2");
        nationalityPage.findElementAndClickFunction("yesButton");
        nationalityPage.findElementAndVerifyContainsText("msjContainer","successfully");
        nationalityPage.waitUntilunVisible(nationalityPage.msjContainer);





    }
}
