package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.AlertTest;

public class AlertTestSteps {
    
    AlertTest alert = new AlertTest();

    @Given("^Navigate to (.+)$")
    public void navigateToUrlTest(String url){
        alert.navigateToUrl(url);
    }
    @When("^Enter usersID into input delete Customer by Id$")
    public void insertUserID(){
        alert.writeId();
        
    }
    @And("^Click submit bottom$")
    public void clickSubmitBottom(){
        alert.clickSubmit();
    }
    @And("^Accept the confirmation alert$")
    public void acceptConfirmation(){
        alert.alertConfirmation();
    }
    
    
    @Then("^Fijarte que la simple alert diga (.+)$")
    public void matchTheSingText(String textMatch){
       Assert.assertEquals(textMatch, alert.bringMeText());

    }
    @And("^Accept the simple alert$")
    public void acceptSimpleAlert(){
        alert.alertConfirmation();
    }
}
