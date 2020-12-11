package StepDefinitions;

import Pages._US_01_DialogContent;
import Pages._US_01_LeftNavigation;
import Pages._US_02_NationalityPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _US_01_CitizenshipsPageSteps {
    _US_01_LeftNavigation leftNavigation = new _US_01_LeftNavigation();
    _US_01_DialogContent dialogContent = new _US_01_DialogContent();
    String createString1;
    String createString2;


    @When("^Navigate to citizionshippage$")
    public void navigateToCitizionshippage() {
        leftNavigation.findElementAndClickFunction("setupOne");
        leftNavigation.findElementAndClickFunction("parameters");
        leftNavigation.findElementAndClickFunction("citizenships");


    }


    @When("^User should be able to create new citizionships with required informations$")

    public void createCitizionships() {
        int random1 = ((int) (Math.random() * 1000));
        int random2 = ((int) (Math.random() * 1000));

        createString1 = "Group8_citizionships" + "" + random1;

        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput", createString1);
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
        dialogContent.waitUntilinVisible("msjContainer");


    }

    @Then("^User should be able to update an existant citizenship$")
    public void updateAnExistantCitizenship() {
        dialogContent.findElementAndSendKeysFunction("searchNameInput",createString1);
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("pageSelectBtn");
        dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndEditFunction(createString2);
        dialogContent.findElementAndSendKeysFunction("nameInput",createString2);
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilinVisible("msjContainer");
    }

    @Then("^User should be able to delete an existant citizenship$")
    public void deleteAnExistantCitizenship() {
        dialogContent.findElementAndSendKeysFunction("searchNameInput",createString2);
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("pageSelectBtn");
        dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndDeleteFunction(createString2);

        dialogContent.findElementAndVerifyContainsText("msjContainer","successfully");
        dialogContent.waitUntilinVisible("msjContainer");


    }


    @And("^User should not be able to delete non existant citizenship$")
    public void userShouldNotBeAbleToDeleteNonExistantCitizenship() {
        dialogContent.findElementAndSendKeysFunction("searchNameInput",createString2);
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("pageSelectBtn");
        dialogContent.findElementAndClickFunction("maxElementBtn");
        if(dialogContent.getListElement("deleteBtnList").size()==0){
            System.out.println("============ silinecek element bulunamadi. Test gecti! ============");
        }


    }
}
