package StepDefinitions;

import Pages._US_07_DialogContent;
import Pages._US_07_LeftNavigation;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class _US_07_Stepdefs {
    _US_07_DialogContent dialogContent = new _US_07_DialogContent();
    _US_07_LeftNavigation leftNav = new _US_07_LeftNavigation();

    @When("^Click on the element in the left class$")
    public void clickOnTheElementInTheLeftClass(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            leftNav.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @Then("^Click on the element in the content class$")
    public void clickOnTheElementInTheContentClass(DataTable elements) {

        List<String> elementsToClick = elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            System.out.println(elementsToClick.get(i));
            dialogContent.findElementAndClickFunction(elementsToClick.get(i));
        }
    }

    @When("^User sending the keys in the form content class$")
    public void userSendingTheKeysInTheFormContentClass(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            System.out.println(elementsNameAndValue.get(i).get(0)); // elemanın adı
            System.out.println(elementsNameAndValue.get(i).get(1)); // elemanın gönderilecek değeri
            dialogContent.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Success message should be display$")
    public void success_message_should_be_display() {
        dialogContent.findElementAndVerifyContainsText("msjContainer", "successfully");
    }

    @Then("^Notification page control$")
    public void notificationPageControl() {
        dialogContent.findElementAndVerifyContainsText("notificationsCheck", "Notifications");

    }



    @Then("^Notification name page control$")
    public void notificationNamePageControl() {
        dialogContent.findElementAndVerifyContainsText("nameSearcControl", "Ali baba");
    }
}
