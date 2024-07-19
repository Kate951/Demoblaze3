package co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.util.HighLight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.requirements.reports.FileSystemRequirmentsOutcomeFactory;
import org.openqa.selenium.WebDriver;

import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaPrincipal.CATEGORY;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaPrincipal.PRODUCT;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.SignUp.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProducto implements Task {
    private String category;
    private String product;

    HighLight highLight;

    public SeleccionarProducto(String category, String product) {
        this.category = category;
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATEGORY.of(category)),
                Click.on(PRODUCT.of(product)));

        System.out.println("Hola Kate1");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static SeleccionarProducto withTheData(String category, String product) {
        return instrumented(SeleccionarProducto.class, category, product);

    }
}

