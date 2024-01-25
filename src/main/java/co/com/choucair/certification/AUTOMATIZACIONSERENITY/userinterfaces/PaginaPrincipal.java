package co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal extends PageObject {

    public static final Target USERNAME = Target.the("userName")
            .located(By.xpath("//body[1]/form[1]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[4]/table[1]/tbody[1]/tr[1]/td[1]"));
}
