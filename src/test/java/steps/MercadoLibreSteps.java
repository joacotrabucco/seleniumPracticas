package steps;



import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.MercadoLibre;

public class MercadoLibreSteps {
    
    MercadoLibre mercadoLibre = new MercadoLibre();

    @Given("^Navego al inicio de ML$")
    public void navigateToMercadoLibre(){
        mercadoLibre.navigateToML();
    }
    
    @When("Clickeo el primer articulo recomendado")
    public void clickFirstArticle (){
        mercadoLibre.clickArticle();
    }
    @And("Clickeo en comprar")
    public void clickButtonOfBuy (){
        mercadoLibre.clickButtonCookie();
        mercadoLibre.clickButton();
        
    }
    @Then("Compruebo msj ¡Hola! Para comprar, ingresá a tu cuenta")
    public void assertIfTextMatch () {
        Assert.assertEquals("¡Hola! Para comprar, ingresá a tu cuenta", mercadoLibre.getText());
    }
}
