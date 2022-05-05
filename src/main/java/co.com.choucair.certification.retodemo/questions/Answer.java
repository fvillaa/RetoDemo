package co.com.choucair.certification.retodemo.questions;

import co.com.choucair.certification.retodemo.userinterface.RegisterDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer (String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String registerData= Text.of(RegisterDemoPage.REGISTER_DATA).viewedBy(actor).asString();
        if (registerData.equals(question)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}


