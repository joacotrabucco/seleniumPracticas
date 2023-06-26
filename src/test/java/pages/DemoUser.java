package pages;
import static util.configReader.getUrlGuru;
import static util.configReader.getUsername;
import static util.configReader.getPassword;

import java.io.IOException;


public class DemoUser extends BasePage {
    private String userNameInput = "//input[@id='email']";
    private String passwordInput = "//input[@id='passwd']";
    private String submitButton = "//button[@id='SubmitLogin']";
    private String textAccess = "//h3[contains(text(),'Successfully Logged in...')]";

    
    public DemoUser(){
        super(driver);
    }

    public void navigateToGuru() throws IOException{
        navigateTo(getUrlGuru());
    }
    public void typeUsername() throws IOException{
        write(userNameInput, getUsername());
    }
    public void typePassword() throws IOException{
        write(passwordInput, getPassword());
    }
    public void pressLogginButton(){
        clickElement(submitButton);
    }
    public String comprueboString(){
        return textFromElement(textAccess);
    }

}
