package co.com.choucair.certification.retotecnico.questions;

import co.com.choucair.certification.retotecnico.userinterface.UTestSingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String mensajeBienvenida = Text.of(UTestSingUpPage.WELCOME).viewedBy(actor).asString();

        if (question.equals(mensajeBienvenida)) {
            result = true;
            System.out.println("Welcome! to UTest");
        } else {
            result = false;
            System.out.println("You must register in www.utest.com/signup/personal");
        }
        return result;

    }
}