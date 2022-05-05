package co.com.choucair.certification.retodemo.tasks;

import co.com.choucair.certification.retodemo.model.DemoDataRegister;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class RegisterDemo implements Task {
    private DemoDataRegister demoDataRegister;
    public RegisterDemo(DemoDataRegister demoDataRegister){this.demoDataRegister = demoDataRegister; }


    public static RegisterDemo the(DemoDataRegister demoDataRegister) {
        return Tasks.instrumented(RegisterDemo.class,demoDataRegister);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterDemoPage.INPUT_FIRSTNAME);
        actor.attemptsTo(Enter.theValue(demoDataRegister.getFirstname()).into(RegisterDemoPage.INPUT_FIRSTNAME));
        actor.attemptsTo(Enter.theValue(demoDataRegister.getLastname()).into(RegisterDemoPage.INPUT_LASTNAME));
        actor.attemptsTo(Enter.theValue(demoDataRegister.getAddress()).into(RegisterDemoPage.INPUT_ADDRESS));
        actor.attemptsTo(Enter.theValue(demoDataRegister.getEmail()).into(RegisterDemoPage.INPUT_EMAIL_ADDRESS));
        actor.attemptsTo(Enter.theValue(demoDataRegister.getPhone()).into(RegisterDemoPage.INPUT_PHONE));
        if (demoDataRegister.getGender().equals("FeMale")) {
            actor.attemptsTo(Click.on(RegisterDemoPage.INDICATE_GENDER_FEMALE));
        } else {
            actor.attemptsTo(Click.on(RegisterDemoPage.INDICATE_GENDER_MALE));
        }


        if (demoDataRegister.getHobbies().contains("Cricket")) {
            actor.attemptsTo(Click.on(RegisterDemoPage.HOBBIES_CRICKET));
        }
        if (demoDataRegister.getHobbies().contains("Movies")) {
            actor.attemptsTo(Click.on(RegisterDemoPage.HOBBIES_MOVIES));
        }
        if (demoDataRegister.getHobbies().contains("Hockey")) {
            actor.attemptsTo(Click.on(RegisterDemoPage.HOBBIES_HOCKEY));
        }

                actor.attemptsTo(Click.on(RegisterDemoPage.LANGUAGE));
                actor.attemptsTo(Click.on(RegisterDemoPage.CHOSEN_LANGUAGE));
                actor.attemptsTo(Click.on(RegisterDemoPage.CHOSEN_LANGUAGE2));
                actor.attemptsTo(Click.on(RegisterDemoPage.CHOSEN_LANGUAGE3));
                actor.attemptsTo(Click.on(RegisterDemoPage.INDICATE_SKILLS));
                actor.attemptsTo(Click.on(RegisterDemoPage.INDICATE_COUNTRY));
                actor.attemptsTo(Click.on(RegisterDemoPage.INDICATE_SELECT_COUNTRY));
                actor.attemptsTo(SelectFromOptions.byVisibleText(demoDataRegister.getYear()).from(RegisterDemoPage.SELECT_YEAR));
                actor.attemptsTo(SelectFromOptions.byVisibleText(demoDataRegister.getMonth()).from(RegisterDemoPage.SELECT_MONTH));
                actor.attemptsTo(SelectFromOptions.byVisibleText(demoDataRegister.getDay()).from(RegisterDemoPage.SELECT_DAY));
                actor.attemptsTo(Enter.theValue(demoDataRegister.getPassword1()).into(RegisterDemoPage.INPUT_CREATE_PASSWORD));
                actor.attemptsTo(Enter.theValue(demoDataRegister.getPassword2()).into(RegisterDemoPage.INPUT_CONFIRM_PASSWORD));
                actor.attemptsTo(Click.on(RegisterDemoPage.CLICK_BUTTON_SUBMIT));
                actor.attemptsTo(Click.on(RegisterDemoPage.REGISTER_DATA));
    }
}


