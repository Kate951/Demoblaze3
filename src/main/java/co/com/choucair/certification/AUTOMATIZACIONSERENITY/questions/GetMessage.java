package co.com.choucair.certification.AUTOMATIZACIONSERENITY.questions;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.Cart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetMessage implements Question<String> {


    private String message;

    @Override
    public String answeredBy(Actor actor) {

        message = Cart.MESSAGE.resolveFor(actor).getText();
        System.out.println("PAGINA:"+message);

        return message;
    }

    public static GetMessage verified() {
        return new GetMessage();
    }
}
