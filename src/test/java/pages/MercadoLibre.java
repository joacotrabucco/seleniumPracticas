package pages;

public class MercadoLibre extends BasePage {
    private String url = "https://www.mercadolibre.com.ar/";
    private String article1 = "//body/main[@id='root-app']/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]";
    private String buyButton = "//span[contains(text(),'Comprar ahora')]";
    private String aceptarCookie = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/button[1]";
    private String textToValidate = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h1[1]";
    
    public MercadoLibre(){
        super(driver);
    }

    public void navigateToML (){
        navigateTo(url);
    }
    public void clickArticle (){
        clickElement(article1);
    }
    public void clickButtonCookie(){
        clickElement(aceptarCookie);
    }
    public void clickButton (){
        
        clickElement(buyButton);
    }
    public String getText () {
        return textFromElement(textToValidate);
    }
}
