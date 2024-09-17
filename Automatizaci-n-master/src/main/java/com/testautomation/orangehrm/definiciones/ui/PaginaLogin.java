package com.testautomation.orangehrm.definiciones.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {
    public static final Target CAMPO_USUARIO = Target.the("campo de usuario")
            .located(By.name("username"));
    public static final Target CAMPO_CONTRASENA = Target.the("campo de contraseña")
            .located(By.name("password"));
    public static final Target BOTON_LOGIN = Target.the("botón de login")
            .located(By.xpath("//button[@type='submit']"));
}