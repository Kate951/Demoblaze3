package co.com.choucair.certification.AUTOMATIZACIONSERENITY.stepdefinitions;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.exception.WrongSelection;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.questions.GetUserName;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.DiligenciarLogueo;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.OpenTheBrowser;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.UrlPagina;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.StringContains.containsString;
import static co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.PaginaPrincipal.USERNAME;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.util.HighLight;

public class Mydefinition {

    UrlPagina urlPagina;
    private Actor user = Actor.named("Juan Diego");

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Desktop\\co.com.choucair.certification.AUTOMATIZACIONSERENITY\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        user.can(BrowseTheWeb.with(driver));
    }


    @Given("^Deseo loggearme en maxtime$")
    public void deseo_loggearme_en_maxtime() throws Exception {
        user.wasAbleTo(OpenTheBrowser.on(urlPagina));
    }

    @When("^Ingreso las credenciales (.*) y (.*)")
    public void ingreso_las_credenciales_y(String userL,  String password) throws Exception {
        user.attemptsTo(DiligenciarLogueo.withTheData(userL, password));
        Thread.sleep(5000);
    }


    @Then("^Visualizo los detalles de la cuenta (.*)$")
    public void visualizo_los_detalles_de_la_cuenta(String userL) throws Exception {
        System.out.println(userL);
        user.should(seeThat(GetUserName.verified(), containsString(userL.trim())).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
    }
}
