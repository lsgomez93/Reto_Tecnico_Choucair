package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UTestPage;
import co.com.choucair.certification.retotecnico.userinterface.UTestSingUpPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class SingUp implements Task {

    public static SingUp onThePage() {
        return Tasks.instrumented(SingUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(Click.on(UTestSingUpPage.SING_UP_BUTTON),
            Enter.theValue("Leidy").into(UTestSingUpPage.INPUT_FIRST_NAME),
            Enter.theValue("Gomez").into(UTestSingUpPage.INPUT_LAST_NAME),
            Enter.theValue("qso87676@cuoly.com").into(UTestSingUpPage.INPUT_EMAIL),
            SelectFromOptions.byVisibleText("March").from(UTestSingUpPage.SELECT_MONTH),
            SelectFromOptions.byVisibleText("5").from(UTestSingUpPage.SELECT_DAY),
            SelectFromOptions.byVisibleText("1998").from(UTestSingUpPage.SELECT_YEAR),
            Click.on(UTestSingUpPage.BUTTON_NEXT_LOCATION),
            Click.on(UTestSingUpPage.BUTTON_NEXT_DEVICES),

            Click.on(UTestSingUpPage.SELECT_MOBIL),
            Enter.theValue("Alcatel").into(UTestSingUpPage.INPUT_MOBIL),
            Click.on(UTestSingUpPage.OPTION_MOBIL),

            Click.on(UTestSingUpPage.SELECT_MODEL_MOBIL),
            Enter.theValue("One Touch Idol").into(UTestSingUpPage.INPUT_MODEL_MOBIL),
            Click.on(UTestSingUpPage.OPTION_MODEL_MOBIL),

            Click.on(UTestSingUpPage.SELECT_MOBIL_OS),
            Enter.theValue("Android 5.1.1").into(UTestSingUpPage.INPUT_MOBIL_OS),
            Click.on(UTestSingUpPage.OPTION_MOBIL_OS),

            Click.on(UTestSingUpPage.BUTTON_LAST_STEP),

            Enter.theValue("12X2Os09h6qMmx2").into(UTestSingUpPage.INPUT_PASSWORD),
            Enter.theValue("12X2Os09h6qMmx2").into(UTestSingUpPage.INPUT_CONFIRM_PASSWORD),
            Click.on(UTestSingUpPage.CHECKBOX_OPTIONAL),
            Click.on(UTestSingUpPage.CHECKBOX_TERMS_USE),
            Click.on(UTestSingUpPage.CHECKBOX_PRIVACY),

            Click.on(UTestSingUpPage.BUTTON_COMPLETE)
            );

    }
}
