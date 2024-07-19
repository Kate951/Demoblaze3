package co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.util.HighLight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaPrincipal.CART;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.Cart.ADDTOCART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddToCart implements Task{

    private WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADDTOCART));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.switchTo().alert().accept();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on(CART));


    }
    public static AddToCart on(WebDriver driver) {
        return instrumented(AddToCart.class, driver);
    }
}
