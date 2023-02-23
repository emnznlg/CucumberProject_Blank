package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DenemePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DenemeStepDefinition {

    DenemePage denemePage = new DenemePage();

    @When("user goes to Google url")
    public void user_goes_to_google_url() {
        Driver.getDriver().get(ConfigReader.getProperty("deneme_url"));
    }

    @When("user searches for iPhone")
    public void user_searches_for_iPhone() {
        denemePage.googleSearchBox.sendKeys("iPhone" + Keys.ENTER);
    }

    @Then("user verifies that the results related to iPhone")
    public void user_verifies_that_the_results_related_to_iPhone() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("iPhone"));
    }

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.closeDriver();
    }

}
