package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class SendQuotePage extends Utils {

    Faker faker = new Faker();
    WebDriver driver;

    private By email = By.id("email");
    private By username = By.id("username");
    private By password = By.id("password");
    private By confirmpassword = By.id("confirmpassword");
    private By sendemail = By.id("sendemail");
    private By message = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

    public SendQuotePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessSendQuote() {
        driver.findElement(By.id("sendquote")).click();
    }

    public void fillQuoteForm() {
        driver.findElement(email).sendKeys(faker.internet().emailAddress());
        driver.findElement(username).sendKeys(faker.name().username());
        driver.findElement(password).sendKeys("Pwd123");
        driver.findElement(confirmpassword).sendKeys("Pwd123");
    }

    public void sendButton() {
        driver.findElement(sendemail).click();
    }

    public void quoteSentSuccessfuly(String expectedMessage) {
        waitElementDisplayed(message, 10);
        Assert.assertEquals(expectedMessage, driver.findElement(message).getText());
    }
}
