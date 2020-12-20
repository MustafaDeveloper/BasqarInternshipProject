package StepDefinitions;

import Pages._US_14_DialogPage;
import Pages._US_14_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _US_14_DismissalSteps {
    _US_14_LeftNavigation leftNavigation=new _US_14_LeftNavigation();
    _US_14_DialogPage dialogPage=new _US_14_DialogPage();

    @Then("^User should be able to view Dismissal Articles page$")
    public void userShouldBeAbleToViewDismissalArticlesPage() {
        leftNavigation.findElementAndClickFunction("humonButton");
        leftNavigation.findElementAndClickFunction("setupButton");
        leftNavigation.findElementAndClickFunction("dismissalButton");
        leftNavigation.findElementAndClickFunction("bellButton");
        leftNavigation.findElementAndClickFunction("closeButton");
        leftNavigation.controlpageurl("https://test.basqar.techno.study/dismissal-article/list");

    }



    @And("^User  should be able to create Dismissal Articles and view  successfully validating the message$")
    public void userShouldBeAbleToCreateDismissalArticlesAndViewSuccessfullyValidatingTheMessage() {

        dialogPage.findElementAndClickFunction("addButton");
        dialogPage.findElementAndSendKeysFunction("nameInput","Group8Ar1");
        dialogPage.findElementAndSendKeysFunction("descInput","Random");
        dialogPage.findElementAndClickFunction("saveButton");
        dialogPage.findElementAndVerifyContainsText("msjContainer","success");
        dialogPage.waitUntilunVisible(dialogPage.msjContainer);

    }

    @When("^searching by  name , the results should be matched the search terms\\.$")
    public void searchingByNameTheResultsShouldBeMatchedTheSearchTerms() {
        dialogPage.findElementAndSendKeysFunction("inputSearchName","Group8Ar1");
        dialogPage.findElementAndClickFunction("searchButton");

        dialogPage.findElementAndClickFunction("pageSelectBtn");
        dialogPage.findElementAndClickFunction("maxElementBtn");
        dialogPage.elementNameControl("Group8Ar1");


    }

    @Then("^User should  be able to edit Dismissal Articles  and view  successfully validating the message$")
    public void userShouldBeAbleToEditDismissalArticlesAndViewSuccessfullyValidatingTheMessage() {
        dialogPage.findElementAndEditFunction("Group8Ar1");
        dialogPage.findElementAndSendKeysFunction("nameInput","Group8Ar2");
        dialogPage.findElementAndClickFunction("saveButton");
        dialogPage.findElementAndVerifyContainsText("msjContainer","success");
        dialogPage.waitUntilunVisible(dialogPage.msjContainer);

    }

    @And("^User should be able to delete  Dismissal Articles and view  successfully validating the message$")
    public void userShouldBeAbleToDeleteDismissalArticlesAndViewSuccessfullyValidatingTheMessage() {
        dialogPage.findElementAndSendKeysFunction("inputSearchName","Group8Ar2");
        dialogPage.findElementAndClickFunction("searchButton");
        dialogPage.findElementAndClickFunction("pageSelectBtn");
        dialogPage.findElementAndClickFunction("maxElementBtn");
        dialogPage.findElementAndDeleteFunction("Group8Ar2");
        dialogPage.findElementAndClickFunction("yesButton");
        dialogPage.findElementAndVerifyContainsText("msjContainer","success");
        dialogPage.waitUntilunVisible(dialogPage.msjContainer);
    }
}
