package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class SelectPriceOptionPage extends Utils {

    WebDriver driver;
    private By silver = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1) > span");
    private By gold  = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span");
    private By platinum = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(3) > span");
    private By ultimate = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
    private By next = By.id("nextsendquote");

    public SelectPriceOptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectPriceOptionGold(String price) {

        if (price.equals("Silver")){
            waitElementDisplayed(silver, 10);
            driver.findElement(silver).click();
        }else if (price.equals("Gold")){
            waitElementDisplayed(gold, 10);
            driver.findElement(gold).click();
        }else if (price.equals("Platinum")){
            waitElementDisplayed(platinum, 10);
            driver.findElement(platinum).click();
        }else if (price.equals("Ultimate")) {
            waitElementDisplayed(ultimate, 10);
            driver.findElement(ultimate).click();
        }
    }

    public void nextButtonQuote() {
        waitElementClickable(next, 2);
        driver.findElement(next).click();
    }
}
