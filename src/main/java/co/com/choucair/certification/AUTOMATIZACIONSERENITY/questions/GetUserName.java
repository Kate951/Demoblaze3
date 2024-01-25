package co.com.choucair.certification.AUTOMATIZACIONSERENITY.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaPrincipal;

public class GetUserName implements Question<String> {

    private String userName;

    @Override
    public String answeredBy(Actor actor) {

        userName = PaginaPrincipal.USERNAME.resolveFor(actor).getText();
        System.out.println(userName);

        return userName;
    }

    public static GetUserName verified() {
        return new GetUserName();

    }
}
