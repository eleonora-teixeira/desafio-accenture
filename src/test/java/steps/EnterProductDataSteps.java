package steps;


import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CommonPage;
import pages.EnterProductDataPage;
import runner.RunCucumberTest;

public class EnterProductDataSteps extends RunCucumberTest {

    EnterProductDataPage productPage = new EnterProductDataPage(driver);
    CommonPage commonPage = new CommonPage(driver);

    @Então("^preencho o formulário de Product Data$")
    public void preencho_o_formulário_de_Product_Data() throws Throwable {
        productPage.fillProductForm();
    }

    @Quando("^clico em next para Select Price Option$")
    public void clico_em_next_para_Select_Price_Option() throws Throwable {
        productPage.nextButtonPrice();
    }

}
