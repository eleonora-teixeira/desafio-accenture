package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.EnterVehicleDataPage;
import runner.RunCucumberTest;

public class EnterVehicleDataSteps extends RunCucumberTest {

    EnterVehicleDataPage vehiclePage = new EnterVehicleDataPage(driver);
    CommonPage commonPage = new CommonPage(driver);

    @Dado("^que acesso o site tricentis$")
    public void que_acesso_o_site_tricentis() throws Throwable {
        commonPage.accessApplication();
    }

    @Quando("^quando estou na aba \"([^\"]*)\"$")
    public void quando_estou_na_aba(String expectedTitle) throws Throwable {
        commonPage.getScreenTitle(expectedTitle);
    }

    @Então("^preencho o formulário de Vehicle Data$")
    public void preencho_o_formulário_de_Vehicle_Data() throws Throwable {
        vehiclePage.fillVehicleForm();
    }

    @Quando("^clico em next para Insurant Data$")
    public void clico_em_next() throws Throwable {
        vehiclePage.nextButtonInsurant();
    }

    @Então("^vejo que estou na aba \"([^\"]*)\"$")
    public void vejo_que_estou_na_aba(String expectedTitle) throws Throwable {
        commonPage.getScreenTitle(expectedTitle);
    }
}
