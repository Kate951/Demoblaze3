package co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SignUp  extends PageObject {
    public static final Target USERFIELD = Target.the("userField").located(By.id("sign-username"));
    public static final Target PASSWORDFIELD = Target.the("passwordField").located(By.id("sign-password"));
    public static final Target BTNSIGNUP = Target.the("btnSignUp").located(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
}
