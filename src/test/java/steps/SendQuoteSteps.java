package steps;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.SendQuotePage;
import runner.RunCucumberTest;


public class SendQuoteSteps extends RunCucumberTest {

    SendQuotePage quotePage = new SendQuotePage(driver);


    @Então("^preencho o formulário de Send Qoute$")
    public void preencho_o_formulário_de_Send_Qoute() throws Throwable {
        quotePage.fillQuoteForm();
    }

    @Quando("^clico em send$")
    public void clico_em_send() throws Throwable {
        quotePage.sendButton();
    }

    @Então("^vejo mensagem de sucesso \"([^\"]*)\"$")
    public void vejo_mensagem_de_sucesso(String message) throws Throwable {
        quotePage.quoteSentSuccessfuly(message);
    }
}
