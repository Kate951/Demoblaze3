package co.com.choucair.certification.AUTOMATIZACIONSERENITY.stepdefinitions;

import co.com.choucair.certification.AUTOMATIZACIONSERENITY.exception.WrongSelection;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.questions.GetUserName;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.OpenTheBrowser;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.RealizarLogIn;
import co.com.choucair.certification.AUTOMATIZACIONSERENITY.tasks.RealizarSignUp;
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
import static org.hamcrest.core.StringContains.containsString;

public class CrearUsuarioStepDefinitions {

    UrlPagina urlPagina;
    private Actor user = Actor.named("Katerinne");
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
    }

    @Given("^Deseo realizar el registro de un usuario en la pagina de product store$")
    public void deseo_realizar_el_registro_de_un_usuario_en_la_pagina_de_product_store(){
        WebDriver driver = new FirefoxDriver();
        user.can(BrowseTheWeb.with(driver));
        user.wasAbleTo(OpenTheBrowser.on(urlPagina));
    }

    @When("^Realizo registro de usuario con (.*) y (.*)$")
    public void realizo_registro_de_usuario_con_Kate_y_Kate(String userS,  String password){
        user.attemptsTo(RealizarSignUp.withTheData(userS, password, urlPagina.getDriver()));
    }

    @When("^Realizo logueo de usuario con (.*) y (.*)$")
    public void realizo_logueo_de_usuario_con_Kate_y_Kate(String userL, String password){
        user.attemptsTo(RealizarLogIn.withTheData(userL, password));
    }

    @Then("^Visualizo el nombre de usuario (.*)$")
    public void visualizo_el_nombre_de_usuario_Kate(String userL){
       user.should(seeThat(GetUserName.verified(), containsString(userL.trim())).orComplainWith(WrongSelection.class, WrongSelection.WRONG_SELECTION));
    }


}
