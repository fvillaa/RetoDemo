package co.com.choucair.certification.retodemo.stepdefinitions;

import co.com.choucair.certification.retodemo.tasks.OpenUp;
import co.com.choucair.certification.retodemo.tasks.RegisterDemo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class demoStepdefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Fernando wants to create users on the demo page$")
    public void fernandoWantsToCreateUsersOnTheDemoPage() {
        OnStage.theActorCalled("Fernando").wasAbleTo(OpenUp.thePage(),(RegisterDemo.onThePage()));

    }


    @When("^Entering the registration tab of the page http://demo\\.automationtesting\\.in/Register\\.html$")
    public void enteringTheRegistrationTabOfThePageHttpDemoAutomationtestingInRegisterHtml() {

    }

    @Then("^correctly register your data$")
    public void correctlyRegisterYourData() {

    }

}
