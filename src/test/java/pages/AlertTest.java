package pages;

public class AlertTest extends BasePage {
    public AlertTest(){
        super(driver);
    }
    private String textField = "//tbody/tr[2]/td[2]/input[1]";
    private String submitElement = "//tbody/tr[3]/td[2]/input[1]";
    public void navigateToUrl(String url){
        navigateTo(url);
    }
    public void alertConfirmation(){
        acceptConfirmationAlert();
    }
    public void writeId(){
        write(textField, "1212");
    }
    public void clickSubmit(){
        clickElement(submitElement);
    }
    public String bringMeText(){
        return textFromAlert();
    }

}
