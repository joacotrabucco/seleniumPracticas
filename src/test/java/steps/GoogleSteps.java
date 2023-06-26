package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^I am on the google search page$")
    public void navigateToGoogle() throws Exception{
        google.navigateToGoo();
        
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        google.enterSearchCriteria("google");
    }

    @And("^click on the search button$")
    public void clickSearchButton(){
        google.clickGoogleSearch();
    }

    @Then("^the results match the criteria")
    public void validateResults(){
        Assert.assertEquals("texto que esperamos", google.firstResult());
    }
}