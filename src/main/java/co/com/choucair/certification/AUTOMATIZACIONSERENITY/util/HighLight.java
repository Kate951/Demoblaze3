package co.com.choucair.certification.AUTOMATIZACIONSERENITY.util;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLight {


    WebDriver driver;

    public HighLight(WebDriver driver) {
        this.driver = driver;
    }

    public void HighlightElemnt(Target target) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='8px solid green'", target);

    }
}


