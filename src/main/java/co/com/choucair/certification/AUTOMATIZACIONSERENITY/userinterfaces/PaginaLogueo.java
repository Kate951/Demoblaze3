package co.com.choucair.certification.AUTOMATIZACIONSERENITY.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaLogueo extends PageObject {

    public static final Target USERFIELD = Target.the("userField").located(By.id("Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I"));
    public static final Target PASSWORDFIELD = Target.the("PasswordField").located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
    public static final Target LOGIN = Target.the("login").located(By.id("Logon_PopupActions_Menu_DXI0_"));

}
