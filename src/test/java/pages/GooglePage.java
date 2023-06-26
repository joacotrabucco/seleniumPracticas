package pages;
import static util.configReader.getUrl;

import java.io.IOException;

public class GooglePage extends BasePage{
    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]";
    private String searchTextField = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
    private String celdaAValidar = "";
    
    
    
    public GooglePage (){
        super(driver);
    }
    public void navigateToGoo() throws IOException{
        navigateTo(getUrl());
    }
    public void clickGoogleSearch (){
        clickElement(searchButton);

    }
    public void enterSearchCriteria(String critiria){
        write(searchTextField,critiria);

    }
    public String firstResult(){
        return textFromElement(celdaAValidar);
    }
    
    
}
    