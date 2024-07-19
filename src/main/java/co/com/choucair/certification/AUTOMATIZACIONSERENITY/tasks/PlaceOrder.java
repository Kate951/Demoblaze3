package co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.util.HighLight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.Cart.*;

public class PlaceOrder implements Task{
    private String name;
    private String country;
    private String city;
    private String creditCard;
    private String month;
    private String year;

    public PlaceOrder(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard = creditCard;
        this.month = month;
        this.year = year;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PLACEORDER),
                Enter.theValue(name).into(NAME),
                Enter.theValue(country).into(COUNTRY),
                Enter.theValue(city).into(CITY),
                Enter.theValue(creditCard).into(CREDITCARD),
                Enter.theValue(month).into(MONTH),
                Enter.theValue(year).into(YEAR),
                Click.on(PURCHASE));
    }

    public static PlaceOrder withTheData(String name, String country, String city, String creditCard, String month, String year) {
        return instrumented(PlaceOrder.class, name, country, city, creditCard, month, year);

    }
}
