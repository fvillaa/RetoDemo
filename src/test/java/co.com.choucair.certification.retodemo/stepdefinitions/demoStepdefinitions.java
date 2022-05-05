package co.com.choucair.certification.retodemo.stepdefinitions;

import co.com.choucair.certification.retodemo.model.DemoDataRegister;
import co.com.choucair.certification.retodemo.questions.Answer;
import co.com.choucair.certification.retodemo.taks.OpenUp;
import co.com.choucair.certification.retodemo.taks.RegisterDemo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class demoStepdefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Fernando wants to create users on the demo page$")
    public void fernandoWantsToCreateUsersOnTheDemoPage() {
        OnStage.theActorCalled("Fernando").wasAbleTo(OpenUp.thePage());

    }


    @When("^Entering the register tab of the automation demo site$")
    public void enteringTheRegisterTabOfTheAutomationDemoSite(List<DemoDataRegister>demoDataRegister) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterDemo.the(demoDataRegister.get(0)));

    }

    @Then("^correctly (.*) your data$")
    public void correctlyRegisterYourData(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
