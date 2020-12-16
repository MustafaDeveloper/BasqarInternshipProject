package StepDefinitions;



import Pages._US_13_DialogContent;
import Pages._US_13_LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _US_13_Stepdefs {
    _US_13_DialogContent dialogContent = new _US_13_DialogContent();
    _US_13_LeftNavigation leftNav = new _US_13_LeftNavigation();




    @When("^Click on the element in the left classe$")
    public void clickOnTheElementInTheLeftClasse(DataTable elements)
    { List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Send keys new Position Category in the content$")
    public void sendKeysNewPositionCategoryinthecontent(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }


    @Then("^Click on the element  Position Category the content class$")
    public void clickOnTheElementPositionCategoryTheContentClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @And("^Position Category page  control$")
    public void positionCategoryPageControl() {
        dialogContent.findElementAndVerifyContainsText("positionCategoryPageCheck","Position");
    }

    @And("^Position Category page search name control$")
    public void positionCategoryPageSearchNameControl() {
        dialogContent.findElementAndVerifyContainsText("nameSearchControl","Grup8Categories");
    }
}
