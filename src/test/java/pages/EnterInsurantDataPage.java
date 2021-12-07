package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantDataPage {

    Faker faker = new Faker();
    WebDriver driver;

    private By firstname = By.id("firstname");
    private By lastname = By.id("lastname");
    private By birthdate = By.id("birthdate");
    private By gender = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
    private By streetaddress = By.id("streetaddress");
    private By country = By.id("country");
    private By zipcode = By.id("zipcode");
    private By city = By.id("city");
    private By occupation = By.id("occupation");
    private By hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.idealforms-field > p > label:nth-child(5) > span");
    private By next = By.id("nextenterproductdata");

    public EnterInsurantDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInsurantForm() {
        driver.findElement(firstname).sendKeys(faker.name().firstName());
        driver.findElement(lastname).sendKeys(faker.name().lastName());
        driver.findElement(birthdate).sendKeys("04/06/1985");
        driver.findElement(gender).click();
        driver.findElement(streetaddress).sendKeys(faker.address().fullAddress());

        Select selectCountry = new Select(driver.findElement(country));
        selectCountry.selectByValue("Brazil");

        driver.findElement(zipcode).sendKeys("11111");
        driver.findElement(city).sendKeys(faker.address().city());

        Select selectOccupation = new Select(driver.findElement(occupation));
        selectOccupation.selectByValue("Employee");

        driver.findElement(hobbies).click();
    }

    public void nextButtonProduct() {
        driver.findElement(next).click();
    }
}
