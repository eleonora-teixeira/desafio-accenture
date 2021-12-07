package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterProductDataPage {

    WebDriver driver;

    private By startdate = By.id("startdate");
    private By insurancesum = By.id("insurancesum");
    private By meritrating = By.id("meritrating");
    private By damageinsurance = By.id("damageinsurance");
    private By oprional_product = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.idealforms-field-checkbox > p > label:nth-child(2) > span");
    private By courtesycar = By.id("courtesycar");
    private By next = By.id("nextselectpriceoption");

    public EnterProductDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillProductForm() {
        driver.findElement(startdate).sendKeys("03/01/2022");

        Select selectSum = new Select(driver.findElement(insurancesum));
        selectSum.selectByValue("7000000");

        Select selectRaiting = new Select(driver.findElement(meritrating));
        selectRaiting.selectByValue("Bonus 9");

        Select selectDamage = new Select(driver.findElement(damageinsurance));
        selectDamage.selectByValue("Full Coverage");

        driver.findElement(oprional_product).click();

        Select selectCourtesy = new Select(driver.findElement(courtesycar));
        selectCourtesy.selectByValue("Yes");
    }

    public void nextButtonPrice() {
        driver.findElement(next).click();
    }
}
