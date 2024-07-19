package co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.util.HighLight;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaPrincipal.SIGNUP;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.SignUp.*;


public class RealizarSignUp implements Task {
    private String user;
    private String password;
   private WebDriver driver;

    HighLight highLight;

    public RealizarSignUp(String user, String password, WebDriver driver) {
        this.user = user;
        this.password = password;
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SIGNUP),
                Enter.theValue(user).into(USERFIELD),
                Enter.theValue(password).into(PASSWORDFIELD),
                Click.on(BTNSIGNUP));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().accept();
    }

    public static RealizarSignUp withTheData(String user, String password, WebDriver driver) {
        return instrumented(RealizarSignUp.class, user, password, driver);

    }
}
