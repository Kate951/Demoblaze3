package co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.util.HighLight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaLogueo.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarLogueo implements Task {

    private String user;
    private String password;

    public DiligenciarLogueo(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(user).into(USERFIELD),
        Enter.theValue(password).into(PASSWORDFIELD),
        Click.on(LOGIN));
    }

    public static DiligenciarLogueo withTheData(String user, String password) {
        return instrumented(DiligenciarLogueo.class, user, password);

    }
}
