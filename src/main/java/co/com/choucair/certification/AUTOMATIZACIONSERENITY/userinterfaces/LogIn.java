package co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LogIn {

    public static final Target USERFIELD = Target.the("userField").located(By.id("loginusername"));
    public static final Target PASSWORDFIELD = Target.the("passwordField").located(By.id("loginpassword"));
    public static final Target BTNLOGIN = Target.the("logIn").located(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));

}
