package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CommonPage;
import pages.EnterInsurantDataPage;
import runner.RunCucumberTest;

public class EnterInsurantDataSteps extends RunCucumberTest {

    EnterInsurantDataPage insurantPage = new EnterInsurantDataPage(driver);
    CommonPage commonPage = new CommonPage(driver);

    @Quando("^acesso a aba \"([^\"]*)\"$")
    public void acesso_a_aba(String tab) throws Throwable {
        commonPage.accessTab(tab);
        commonPage.getScreenTitle(tab);
    }

    @Então("^preencho o formulário de Insurant Data$")
    public void preencho_o_formulário_de_Insurant_Data() throws Throwable {
        insurantPage.fillInsurantForm();
    }

    @Quando("^clico em next para Product Data$")
    public void clico_em_next_para_Product_Data() throws Throwable {
        insurantPage.nextButtonProduct();
    }

}
