package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSingUpPage  {

    public static final Target SING_UP_BUTTON = Target.the("button that shows us the form to sing up")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the first last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the address")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where the month of birth is selected ")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where the day of birth is selected")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where the year of birth is selected")
            .located(By.id("birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("button go to the location form")
            .located(By.xpath("//a[@aria-label='Next step - define your location']"));
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("where do we write the postal code")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("where the pais of birth is selected")
            .located(By.xpath("//a[@aria-label='Select a country']"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("button go to the devices form")
            .located(By.xpath("//a[@aria-label='Next step - select your devices']"));
    public static final Target SELECT_COMPUTER_SO = Target.the("where the operativo system is selected")
            .located(By.xpath("//span[contains(text),'Select OS']"));
    public static final Target SELECT_VERSION_SO = Target.the("where the version operativo system is selected")
            .located(By.xpath("//span[contains(text),'Select a Version']"));
    public static final Target SELECT_LANGUAGE_SO = Target.the("where the language operativo system is selected")
            .located(By.xpath("//span[contains(text),'Select OS language']"));

    public static final Target SELECT_MOBIL = Target.the("where your mobil is selected")
            .located(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle[aria-label='Select Brand']"));
    public static final Target OPTION_MOBIL = Target.the("where your mobil is selected")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//span[contains(text(), 'Alcatel')]"));
    public static final Target INPUT_MOBIL = Target.the("where your mobil is selected")
            .located(By.xpath("//input[@placeholder='Select Brand']"));

    public static final Target SELECT_MODEL_MOBIL = Target.the("where your mobil is selected")
            .located(By.cssSelector(".btn.btn-default.form-control.ui-select-toggle[aria-label='Select a Model']"));
    public static final Target OPTION_MODEL_MOBIL = Target.the("where your mobil is selected")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//span[contains(text(), 'One Touch Idol')]"));
    public static final Target INPUT_MODEL_MOBIL = Target.the("where your mobil is selected")
            .located(By.xpath("//input[@placeholder='Select a Model']"));

    public static final Target SELECT_MOBIL_OS= Target.the("where your mobil is selected")
            .located(By.cssSelector("#mobile-device .btn.ui-select-toggle[aria-label='Select OS']"));
    public static final Target OPTION_MOBIL_OS = Target.the("where your mobil is selected")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//span[contains(text(), 'Android 5.1.1')]"));
    public static final Target INPUT_MOBIL_OS= Target.the("where your mobil is selected")
            .located(By.cssSelector("#mobile-device input[placeholder='Select OS']"));

    public static final Target BUTTON_LAST_STEP = Target.the("button go to the devices form")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the confirm password")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_OPTIONAL = Target.the("where do we ckeckbox the optional information,where do we acept optional information")
            .located(By.xpath("//input[@name='newsletterOptIn']"));
    public static final Target CHECKBOX_TERMS_USE = Target.the("where do we ckeckbox the terms of use")
            .located(By.xpath("//input[@name='termOfUse']"));
    public static final Target CHECKBOX_PRIVACY = Target.the("where do we acept privacy y security policy")
            .located(By.xpath("//input[@id='privacySetting']"));
    public static final Target BUTTON_COMPLETE = Target.the("button to complete form")
            .located(By.id("laddaBtn"));
    public static final Target BUTTON_BACK = Target.the("button go to back")
            .located(By.xpath("//a[@class='btn btn-grey btn-rounded pull-left']//span[contains(text(),'Back')]"));

}
