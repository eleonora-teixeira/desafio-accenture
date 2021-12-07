package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage {

    WebDriver driver;
    private By insurance = By.id("enterinsurantdata");
    private By product = By.id("enterproductdata");

    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessApplication() {
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    public void getScreenTitle(String expectedTitle){
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    public void accessTab(String tab) {
        if (tab.equals("Enter Insurant Data")){
            driver.findElement(insurance).click();
        }else if (tab.equals("Enter Product Data")){
            driver.findElement(product).click();
        }
    }
}
