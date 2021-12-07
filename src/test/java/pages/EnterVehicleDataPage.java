package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class EnterVehicleDataPage extends Utils {

    WebDriver driver;

    private By make = By.id("make");
    private By model = By.id("model");
    private By cylinder = By.id("cylindercapacity");
    private By engineperformance = By.id("engineperformance");
    private By dateofmanufacture = By.id("dateofmanufacture");
    private By numberofseats = By.id("numberofseats");
    private By handDrive = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span");
    private By numberofseatsmotorcycle = By.id("numberofseatsmotorcycle");
    private By fuel = By.id("fuel");
    private By payload = By.id("payload");
    private By totalweight = By.id("totalweight");
    private By listprice = By.id("listprice");
    private By licenseplatenumber = By.id("licenseplatenumber");
    private By annualmileage = By.id("annualmileage");
    private By next = By.id("nextenterinsurantdata");

    public EnterVehicleDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillVehicleForm() {

        String formCount = driver.findElement(By.cssSelector("#entervehicledata > .counter")).getText();

        if (formCount.equals("12")) {

            Select selectMake = new Select(driver.findElement(make));
            selectMake.selectByValue("Renault");

            Select selectModel = new Select(driver.findElement(model));
            selectModel.selectByValue("Scooter");

            driver.findElement(cylinder).sendKeys("555");
            driver.findElement(engineperformance).sendKeys("110");
            driver.findElement(dateofmanufacture).sendKeys("10/05/2019");

            Select selectSeats = new Select(driver.findElement(numberofseats));
            selectSeats.selectByValue("5");

            driver.findElement(handDrive).click();

            Select selectSeat = new Select(driver.findElement(numberofseatsmotorcycle));
            selectSeat.selectByValue("1");

            Select selectFuel = new Select(driver.findElement(fuel));
            selectFuel.selectByValue("Gas");

            driver.findElement(payload).sendKeys("1000");
            driver.findElement(totalweight).sendKeys("30000");
            driver.findElement(listprice).sendKeys("15000");
            driver.findElement(licenseplatenumber).sendKeys("ABC456");
            driver.findElement(annualmileage).sendKeys("25000");

        } else if (formCount.equals("7")) {

            Select selectMake = new Select(driver.findElement(make));
            selectMake.selectByValue("Renault");

            driver.findElement(engineperformance).sendKeys("110");
            driver.findElement(dateofmanufacture).sendKeys("10/05/2019");

            Select selectSeats = new Select(driver.findElement(numberofseats));
            selectSeats.selectByValue("5");

            Select selectFuel = new Select(driver.findElement(fuel));
            selectFuel.selectByValue("Gas");

            driver.findElement(listprice).sendKeys("15000");
            driver.findElement(licenseplatenumber).sendKeys("ABC456");
            driver.findElement(annualmileage).sendKeys("25000");
        }
    }

    public void nextButtonInsurant() {
        driver.findElement(next).click();

    }
}
