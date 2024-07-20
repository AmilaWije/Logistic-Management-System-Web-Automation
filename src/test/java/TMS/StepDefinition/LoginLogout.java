package TMS.StepDefinition;

import TMS.PageObject.LoginLogoutPO;
import Utility.PropertyFileHandler;
import Utility.WebDriverHelper;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginLogout extends LoginLogoutPO {
    LoginLogoutPO lLPO = new LoginLogoutPO();

    @Given("I open URL as {string}")
    public void i_open_url_as(String URL)throws InterruptedException {
        WebDriverHelper.getWebDriverHelper().openURL(PropertyFileHandler.readProperty(URL));
    }

    @When("User enter Username as {string}")
    public void user_enter_Username_as(String userName) throws InterruptedException {
        lLPO.enterUsername(PropertyFileHandler.readProperty(userName));
    }

    @Then("User enter Password as {string}")
    public void user_enter_Password_as(String  password) throws InterruptedException {
        lLPO.enterPassword(PropertyFileHandler.readProperty(password));
    }

    @And("User click login button")
    public void user_click_login_button() throws InterruptedException {
        lLPO.clickLoginBtn();
    }
}
