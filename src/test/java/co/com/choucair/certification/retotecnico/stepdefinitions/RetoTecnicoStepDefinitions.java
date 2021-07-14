package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.UTestData;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.certification.retotecnico.tasks.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Leidy wants fill out form to Registre in the page Utest$")
    public void thanLeidyWantsFillOutFormToRegistreInThePageUtest() {
        OnStage.theActorCalled("Leidy").wasAbleTo(OpenUp.thePage());
    }

    @When("^she enter the data of the New User$")
    public void sheEnterTheDataOfTheNewUser(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(SingUp.onThePage(
                uTestData.get(0).getStrFirsName(),
                uTestData.get(0).getStrLastName(),
                uTestData.get(0).getStrEmail(),
                uTestData.get(0).getStrMonth(),
                uTestData.get(0).getStrDay(),
                uTestData.get(0).getStrYear(),
                uTestData.get(0).getStrMobil(),
                uTestData.get(0).getStrVersionMobil(),
                uTestData.get(0).getStrOsMobil(),
                uTestData.get(0).getStrPassword(),
                uTestData.get(0).getStrConfirmPassword()
        ));
    }

    @Then("^she gets the new user and show welcome page(.*)$")
    public void sheGetsTheNewUserRegistration(String titleWelcome) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(titleWelcome.trim())));
    }

}
