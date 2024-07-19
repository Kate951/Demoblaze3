package co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.nio.file.Path;

public class Cart extends PageObject {

    public static final Target ADDTOCART = Target.the("addToCart").located(By.xpath("//div[@id=\"tbodyid\"]/div[2]/div/a"));
    public static final Target NAME = Target.the("name").located(By.id("name"));
    public static final Target COUNTRY = Target.the("country").located(By.id("country"));
    public static final Target CITY = Target.the("city").located(By.id("city"));
    public static final Target CREDITCARD = Target.the("creditCard").located(By.id("card"));
    public static final Target MONTH = Target.the("month").located(By.id("month"));
    public static final Target YEAR = Target.the("year").located(By.id("year"));
    public static final Target PLACEORDER = Target.the("placeOrder").located(By.xpath("//button[contains(text(),\"Place Order\")]"));
    public static final Target PURCHASE = Target.the("purchase").located(By.xpath("//button[contains(text(),\"Purchase\")]"));
    public static final Target MESSAGE = Target.the("message").located(By.xpath("/html/body/div[10]/h2"));


}
