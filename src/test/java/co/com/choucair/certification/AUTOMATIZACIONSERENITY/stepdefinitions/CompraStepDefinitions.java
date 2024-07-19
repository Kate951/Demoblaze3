package co.com.choucair.certification.AUTOMATIZACIONSERENITY.stepdefinitions;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.exception.WrongSelection;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.questions.GetMessage;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.AddToCart;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.OpenTheBrowser;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.PlaceOrder;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.SeleccionarProducto;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces.UrlPagina;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

public class CompraStepDefinitions {
    UrlPagina urlPagina;
    private Actor user = Actor.named("Katerinne");
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
    }

    @Given("^Deseo realizar una compra en la pagina de product store$")
    public void deseo_realizar_una_compra_en_la_pagina_de_product_store(){
        WebDriver driver = new FirefoxDriver();
        user.can(BrowseTheWeb.with(driver));
        user.wasAbleTo(OpenTheBrowser.on(urlPagina));
    }

    @When("^Selecciono la (.*) y el (.*) deseado$")
    public void selecciono_la_categoria_deseada_Phones(String categories, String product){
        user.attemptsTo(SeleccionarProducto.withTheData(categories, product));
    }

    @When("^Agrego el producto al cart$")
    public void agrego_el_producto_al_cart(){
        user.attemptsTo(AddToCart.on(urlPagina.getDriver()));
    }

    @When("^Continuo con la compra y diligencio mi informacion (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void continuo_con_la_compra_y_diligencio_mi_informacion_Katerinne_Colombia_Medallo_city(String name, String country, String city, String creditCard, String month, String year){
        user.attemptsTo(PlaceOrder.withTheData(name, country, city, creditCard, month, year));
    }

    @Then("^Visualizo el popup de compra exitosa (.*)$")
    public void visualizo_el_popup_de_compra_exitosa_Thank_you_for_your_purchase(String message){
        user.should(seeThat(GetMessage.verified(), is(message.trim())).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
    }


}
