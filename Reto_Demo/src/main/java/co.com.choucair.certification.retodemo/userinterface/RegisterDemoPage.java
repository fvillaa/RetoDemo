package co.com.choucair.certification.retodemo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterDemoPage  extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("enter first name").
            located(By.xpath("//input[@ng-model= 'FirstName']"));
    public static final Target INPUT_LASTNAME = Target.the("enter last name").
            located(By.xpath("//input[@ng-model= 'LastName']"));
    public static final Target INPUT_ADDRESS = Target.the("enter address").
            located(By.xpath("//textarea[@ng-model= 'Adress']"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("Input Email").
            located(By.xpath("//input[@ng-model= 'EmailAdress']"));
    public static final Target INPUT_PHONE = Target.the("Input phone").
            located(By.xpath("//input[@ng-model= 'Phone']"));
    public static final Target INDICATE_GENDER = Target.the("Indicate Gender").
            located(By.xpath("//input[@value= 'Male']"));
    public static final Target INDICATE_HOBBIES = Target.the("Indicate hobbies").
            located(By.id("checkbox2"));
    public static final Target LANGUAGE = Target.the("click language").
            located(By.xpath("//div[@class= 'ui-autocomplete-multiselect ui-state-default ui-widget']"));
    public static final Target CHOSEN_LANGUAGE = Target.the("click language").
           located(By.xpath("//a[text()= 'Spanish']"));
    public static final Target CHOSEN_LANGUAGE2 = Target.the("click language 2").
            located(By.xpath("//a[text()= 'Swedish']"));
    public static final Target CHOSEN_LANGUAGE3 = Target.the("click language 3 ").
            located(By.xpath("//a[text()= 'Turkish']"));
    public static final Target INDICATE_SKILLS = Target.the("indicate skills").
            located(By.xpath("//option[text()= 'Android']"));
    public static final Target INDICATE_COUNTRY = Target.the("indicate COUNTRY").
            located(By.id("countries"));
    public static final Target INDICATE_SELECT_COUNTRY = Target.the("indicate SELECT COUNTRY").
            located(By.xpath("//option[text()= 'United States of America']"));
    public static final Target SELECT_YEAR = Target.the("select year").
            located(By.id("yearbox"));
    public static final Target SELECT_MONTH = Target.the("select the month").
            located(By.xpath("//select[@placeholder= 'Month']"));
    public static final Target SELECT_DAY = Target.the("select day").
            located(By.id("daybox"));
    public static final Target INPUT_CREATE_PASSWORD = Target.the("write password to create")
            .located(By.id("firstpassword"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("write password to confirm")
            .located(By.id("secondpassword"));
    public static final Target CLICK_BUTTON_SUBMIT = Target.the("click button submit")
            .located(By.id("submitbtn"));
    public static final Target REGISTER_DATA = Target.the("Register data user").
            located(By.xpath("//h2[text()= 'Register']"));

}
