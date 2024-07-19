package co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal extends PageObject {
 public static final Target SIGNUP = Target.the("signUp").located(By.id("signin2"));
 public static final Target LOGIN = Target.the("logIn").located(By.id("login2"));
 public static final Target USERNAME = Target.the("userName").located(By.id("nameofuser"));
 public static final Target CATEGORY = Target.the("category").locatedBy("//*[@id=\"itemc\" and contains(text(),\"{0}\")]");
 public static final Target PRODUCT = Target.the("product").locatedBy("//a[contains(text(),\"{0}\")]");
 public static final Target CART = Target.the("cart").located(By.id("cartur"));
 }





