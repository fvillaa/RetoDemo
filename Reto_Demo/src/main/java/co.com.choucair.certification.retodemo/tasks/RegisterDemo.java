package co.com.choucair.certification.retodemo.tasks;

import co.com.choucair.certification.retodemo.userinterface.RegisterDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.junit.rules.Timeout;

public class RegisterDemo implements Task {
    public static RegisterDemo onThePage() {
        return Tasks.instrumented(RegisterDemo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterDemoPage.INPUT_FIRSTNAME),
                Enter.theValue("Fernando").into(RegisterDemoPage.INPUT_FIRSTNAME),
                Enter.theValue("Villa Alvarez").into(RegisterDemoPage.INPUT_LASTNAME),
                Enter.theValue("Mz 11 Casa 1 Las Brisas-Pereira").into(RegisterDemoPage.INPUT_ADDRESS),
                Enter.theValue("fvilla.82@hotmail.com").into(RegisterDemoPage.INPUT_EMAIL_ADDRESS),
                Enter.theValue("3124335093").into(RegisterDemoPage.INPUT_PHONE),
                Click.on(RegisterDemoPage.INDICATE_GENDER),
                Click.on(RegisterDemoPage.INDICATE_HOBBIES),
                Click.on(RegisterDemoPage.LANGUAGE),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE2),
                Click.on(RegisterDemoPage.CHOSEN_LANGUAGE3),
                Click.on(RegisterDemoPage.INDICATE_SKILLS)
                //SelectFromOptions.byVisibleText("Android").from(RegisterDemoPage.INDICATE_SKILLS)



        );


    }
}
