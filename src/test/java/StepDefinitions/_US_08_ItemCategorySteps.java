package StepDefinitions;

import Pages._US_08_DialogContent;
import Pages._US_08_LeftNavigation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class _US_08_ItemCategorySteps {
    _US_08_LeftNavigation leftNavigation=new _US_08_LeftNavigation();
    _US_08_DialogContent dialogContent=new _US_08_DialogContent();


    @When("^User should be able to view Item Categories Page$")
    public void userShouldBeAbleToViewItemCategoriesPage() {
        leftNavigation.findElementAndClickFunction("inventoryButton");
        leftNavigation.findElementAndClickFunction("inventorySetupBtn");
        leftNavigation.findElementAndClickFunction("itemCategoriesButton");
        String itemCatPageAdress="https://test.basqar.techno.study/item-category/list";
        String pageName="Item Categories";
        Assert.assertTrue(leftNavigation.getpageName().contains(pageName));
        String pageURL=leftNavigation.getURL();
        System.out.println(pageURL);
        Assert.assertTrue(pageURL.equals(itemCatPageAdress));

    }

    @Then("^User  should be able to create new Item Categorie  and view  successfully validating the message$")
    public void userShouldBeAbleToCreateNewItemCategorieAndViewSuccessfullyValidatingTheMessage() {
        dialogContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("nameInput","Group8Item1");
        dialogContent.findElementAndClickFunction("userTypeButton");
        dialogContent.findElementAndClickFunction("optionList");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfull");
        dialogContent.waitUntilinVisible("msjContainer");

    }

    @And("^searching by  name, the results should be matched the search terms\\.$")
    public void searchingByNameTheResultsShouldBeMatchedTheSearchTerms() {
        dialogContent.findElementAndSendKeysFunction("searchNameInput","Group8Item1");
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("pageSelectBtn");
        dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndVerifyName("Group8Item1");
    }

    @Then("^User should be able to edit Item Categorie and view  successfully validating the message$")
    public void userShouldBeAbleToEditItemCategorieAndViewSuccessfullyValidatingTheMessage() {
        dialogContent.findElementAndSendKeysFunction("searchNameInput","Group8Item1");
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("pageSelectBtn");
        dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndDeleteFunction("Group8Item2");
        dialogContent.findElementAndEditFunction("Group8Item1");
        dialogContent.findElementAndSendKeysFunction("nameInput","Group8Item2");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfull");
        dialogContent.waitUntilinVisible("msjContainer");

    }

    @Then("^User should be able to delete  Item Categorie and view  successfully validating the message$")
    public void userShouldBeAbleToDeleteItemCategorieAndViewSuccessfullyValidatingTheMessage() {
        dialogContent.findElementAndSendKeysFunction("searchNameInput","Group8Item2");
        dialogContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("pageSelectBtn");
        dialogContent.findElementAndClickFunction("maxElementBtn");
        dialogContent.findElementAndDeleteFunction("Group8Item2");
        dialogContent.findElementAndClickFunction("yesButton");
        dialogContent.findElementAndVerifyContainsText("msjContainer","successfull");
        dialogContent.waitUntilinVisible("msjContainer");
    }




}
