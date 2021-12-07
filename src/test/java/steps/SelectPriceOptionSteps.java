package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CommonPage;

import pages.SelectPriceOptionPage;
import runner.RunCucumberTest;

public class SelectPriceOptionSteps extends RunCucumberTest {

    SelectPriceOptionPage pricePage = new SelectPriceOptionPage(driver);
    CommonPage commonPage = new CommonPage(driver);


    @Quando("^Seleciono o Price option \"([^\"]*)\"$")
    public void seleciono_o_Price_option(String price) throws Throwable {
        pricePage.selectPriceOptionGold(price);
    }

    @Então("^clico em next para Send Quote$")
    public void clico_em_next_para_Send_Quote() throws Throwable {
        pricePage.nextButtonQuote();
    }

    @Quando("^vejo que estou na aba Send Quote$")
    public void vejo_que_estou_na_aba_Send_Quote() throws Throwable {
        String expectedTitle = "Send Quote";
        commonPage.getScreenTitle(expectedTitle);
    }
}
