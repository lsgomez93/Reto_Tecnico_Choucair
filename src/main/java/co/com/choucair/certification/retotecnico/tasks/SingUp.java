package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UTestSingUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class SingUp implements Task {

    private String strFirsName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private String strMobil;
    private String strVersionMobil;
    private String strOsMobil;
    private String strPassword;
    private String strConfirmPassword;

    public SingUp(String strFirsName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strMobil, String strVersionMobil, String strOsMobil, String strPassword, String strConfirmPassword) {
        this.strFirsName = strFirsName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.strMobil = strMobil;
        this.strVersionMobil = strVersionMobil;
        this.strOsMobil = strOsMobil;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static SingUp onThePage(String strFirsName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, String strMobil, String strVersionMobil, String strOsMobil, String strPassword, String strConfirmPassword) {

        return Tasks.instrumented(SingUp.class, strFirsName, strLastName, strEmail, strMonth, strDay, strYear, strMobil, strVersionMobil, strOsMobil,  strPassword,  strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UTestSingUpPage.SING_UP_BUTTON),
                Enter.theValue(strFirsName).into(UTestSingUpPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestSingUpPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestSingUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestSingUpPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDay).from(UTestSingUpPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(strYear).from(UTestSingUpPage.SELECT_YEAR),

                Click.on(UTestSingUpPage.BUTTON_NEXT_LOCATION),
                Click.on(UTestSingUpPage.BUTTON_NEXT_DEVICES),

                Click.on(UTestSingUpPage.SELECT_MOBIL),
                Enter.theValue(strMobil).into(UTestSingUpPage.INPUT_MOBIL),
                Click.on(UTestSingUpPage.OPTION_MOBIL),

                Click.on(UTestSingUpPage.SELECT_MODEL_MOBIL),
                Enter.theValue(strVersionMobil).into(UTestSingUpPage.INPUT_MODEL_MOBIL),
                Click.on(UTestSingUpPage.OPTION_MODEL_MOBIL),

                Click.on(UTestSingUpPage.SELECT_MOBIL_OS),
                Enter.theValue(strOsMobil).into(UTestSingUpPage.INPUT_MOBIL_OS),
                Click.on(UTestSingUpPage.OPTION_MOBIL_OS),

                Click.on(UTestSingUpPage.BUTTON_LAST_STEP),

                Enter.theValue(strPassword).into(UTestSingUpPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UTestSingUpPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UTestSingUpPage.CHECKBOX_OPTIONAL),
                Click.on(UTestSingUpPage.CHECKBOX_TERMS_USE),
                Click.on(UTestSingUpPage.CHECKBOX_PRIVACY),

                Click.on(UTestSingUpPage.BUTTON_COMPLETE)
        );

    }
}
