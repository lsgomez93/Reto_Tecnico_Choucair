package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.certification.retotecnico.tasks.SingUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Leidy wants fill out form to Registre in the page Utest$")
    public void thanLeidyWantsFillOutFormToRegistreInThePageUtest() {
        OnStage.theActorCalled("Leidy").wasAbleTo(OpenUp.thePage(), (SingUp.onThePage()));

    }

    @When("^she enter the data of the New User$")
    public void sheEnterTheDataOfTheNewUser() {

    }

    @Then("^she gets the new user Registration$")
    public void sheGetsTheNewUserRegistration() {

    }

}
