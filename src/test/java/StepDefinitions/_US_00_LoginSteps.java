package StepDefinitions;



import Pages._US_10_DialogContent;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class _US_00_LoginSteps {

    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {
        driver = Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^Enter username and password and click Login button$")
    public void enter_username_and_password_and_click_Login_button() {
        _US_10_DialogContent dialogContent=new _US_10_DialogContent();

        dialogContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");
        dialogContent.findElementAndSendKeysFunction("password","TechnoStudy123@");
        dialogContent.findElementAndClickFunction("loginButton");
        dialogContent.findElementAndClickFunction("gotItBtn");



    }

}

