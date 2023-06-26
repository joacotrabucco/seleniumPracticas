package steps;

import java.io.IOException;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DemoUser;

public class DemoGuruSteps {
    DemoUser demo = new DemoUser();
    
    @Given("^Navego al Url correcto$")
    public void navigateToUrlDemo() throws IOException{
        demo.navigateToGuru();
    }
    @When("^Pongo el usuario Correcto$")
    public void insertUserName() throws IOException{
        demo.typeUsername();
        
    }
    @And("^La contrasela Correcta$")
    public void insertPassword() throws IOException{
        demo.typePassword();
    }
    @And("^Press the login button$")
    public void submitLogin(){
        demo.pressLogginButton();
    }
    
    @Then("^Compruebo el msj de loggeo$")
    public void matchTheSingText(){
       Assert.assertEquals("Successfully Logged in...", demo.comprueboString());
    }


}
