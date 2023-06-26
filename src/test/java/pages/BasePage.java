package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static{
        System.setProperty("webdriver.chrome.driver", "C:/Joaquin/Workspace/chromedriver_win32/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver (chromeOptions);
        driver.manage().window().maximize();
        wait = new WebDriverWait (driver, 10);
        }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait (driver, 10);
    }
    public static void navigateTo(String url){
        driver.get(url);
    }
    public static void closeBrowser(){
        driver.quit();
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    
    public void clickElement (String locator){
        Find(locator).click();
    }
    public void write(String locator, String textToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }
    public void selectFromDropdownByValue (String locator, String valueToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByValue(valueToSelect);
    }
    public void selectFromDropdownByIndex (String locator, int valueToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByIndex(valueToSelect);
    }
    public void selectFromDropdownByVisibleText (String locator, String valueToSelect){
        Select dropdown = new Select (Find(locator));
        dropdown.selectByVisibleText(valueToSelect);
    }
    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));

    }
    public void doubleClick(String locator){
        action.doubleClick(Find(locator));

    }
    public void rightClick(){
        action.contextClick(Find(null));
    
    }
    //grillas estaticas
    public String getValueFromTable(String locator, int row, int column){
        String cellINeed = locator+"/body[1]/div[1]/div[1]/table[1]/tbody[1]/tr["+row+"]/td["+column+"]";
        return Find(cellINeed).getText();
    }
    public void setValueOnTable(String locator, int row, int column,String stringToSend){
        String cellToFill = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        Find(cellToFill).sendKeys(stringToSend);

    }



    public void switchToiFrame(int iFrameIndex){
        driver.switchTo().frame(0);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
    public void dismissAlert(){
        try{
            driver.switchTo().alert().dismiss();
        }catch(NoAlertPresentException e){
            e.printStackTrace();
        }
    }
    
    public String textFromElement(String locator){
        return Find(locator).getText();
    }
    public String textFromAlert(){
        return driver.switchTo().alert().getText();
    }
    public boolean elementIsEnabled(String locator){
        return Find(locator).isEnabled();
        //Ej si el elemento (boton) esta disponible para clickear
    }
    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
        //si el elemento esta siendo mostrado true sino false
    }
    public boolean elementIsSelected(String locator){
        return Find(locator).isSelected();
        //si el elemento selected esta seleccionado
    }
    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator));
    }
    public void acceptConfirmationAlert (){
        try{
            driver.switchTo().alert().accept();
        }catch(NoAlertPresentException e){
            e.printStackTrace();
        }
    }
}
//en los steps debemos hacer las validaciones
// en los pages navegamos o modelamos la pag