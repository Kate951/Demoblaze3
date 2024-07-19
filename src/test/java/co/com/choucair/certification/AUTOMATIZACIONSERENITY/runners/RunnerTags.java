package co.com.choucair.certification.AUTOMATIZACIONSERENITY.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = {"@CreacionUsuario or @Compra"},
        //tags = {"@CreacionUsuario"},
        glue = "co.com.choucair.certification.AUTOMATIZACIONSERENITY.stepdefinitions",
        snippets =  SnippetType.CAMELCASE)
public class RunnerTags {

    @Before
    public void test() {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":

                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
            case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(RunnerTags.class);
    }
}
