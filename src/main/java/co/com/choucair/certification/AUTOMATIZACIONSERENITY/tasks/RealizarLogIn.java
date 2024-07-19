package co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaPrincipal.LOGIN;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.LogIn.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RealizarLogIn implements Task {
    private String user;
    private String password;

    public RealizarLogIn(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN),
                Enter.theValue(user).into(USERFIELD),
                Enter.theValue(password).into(PASSWORDFIELD),
                Click.on(BTNLOGIN));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static RealizarLogIn withTheData(String user, String password) {
        return instrumented(RealizarLogIn.class, user, password);

    }
}
