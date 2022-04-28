package co.com.choucair.certification.retodemo.tasks;

import co.com.choucair.certification.retodemo.model.DemoDataRegister;
import co.com.choucair.certification.retodemo.userinterface.RegisterDemoPage;
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
        actor.attemptsTo(Click.on(RegisterDemoPage.INPUT_FIRSTNAME),
                Enter.theValue(demoDataRegister.getFirstname()).into(RegisterDemoPage.INPUT_FIRSTNAME),
                Enter.theValue(demoDataRegister.getLastname()).into(RegisterDemoPage.INPUT_LASTNAME),
                Enter.theValue(demoDataRegister.getAddress()).into(RegisterDemoPage.INPUT_ADDRESS),
                Enter.theValue(demoDataRegister.getEmail()).into(RegisterDemoPage.INPUT_EMAIL_ADDRESS),
                Enter.theValue(demoDataRegister.getPhone()).into(RegisterDemoPage.INPUT_PHONE),
                Click.on(RegisterDemoPage.INDICATE_GENDER),
                Click.on(RegisterDemoPage.INDICATE_HOBBIES),
                Click.on(RegisterDemoPage.LANGUAGE),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE2),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE3),
                Click.on(RegisterDemoPage.INDICATE_SKILLS),
                Click.on(RegisterDemoPage.INDICATE_COUNTRY),
                Click.on(RegisterDemoPage.INDICATE_SELECT_COUNTRY),
                SelectFromOptions.byVisibleText(demoDataRegister.getYear()).from(RegisterDemoPage.SELECT_YEAR),
                SelectFromOptions.byVisibleText(demoDataRegister.getMonth()).from(RegisterDemoPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(demoDataRegister.getDay()).from(RegisterDemoPage.SELECT_DAY),
                Enter.theValue(demoDataRegister.getPassword1()).into(RegisterDemoPage.INPUT_CREATE_PASSWORD),
                Enter.theValue(demoDataRegister.getPassword2()).into(RegisterDemoPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterDemoPage.CLICK_BUTTON_SUBMIT),
                Click.on(RegisterDemoPage.REGISTER_DATA)

        );



    }
}
