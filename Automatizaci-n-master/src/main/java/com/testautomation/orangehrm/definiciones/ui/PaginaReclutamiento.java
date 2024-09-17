package com.testautomation.orangehrm.definiciones.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaReclutamiento {
    public static final Target BOTON_AGREGAR = Target.the("botón de agregar")
            .located(By.xpath("//button[contains(@class, 'oxd-button--secondary')]"));
    public static final Target CAMPO_NOMBRE = Target.the("campo de nombre")
            .located(By.name("firstName"));
    public static final Target CAMPO_APELLIDO = Target.the("campo de apellido")
            .located(By.name("lastName"));
    public static final Target CAMPO_EMAIL = Target.the("campo de email")
            .located(By.xpath("//input[@placeholder='Type here']"));
    public static final Target CAMPO_ESTADO = Target.the("campo de estado")
            .located(By.xpath("//label[contains(text(),'Status')]/../following-sibling::div//div[contains(@class, 'oxd-select-text-input')]"));
    public static final Target BOTON_GUARDAR = Target.the("botón de guardar")
            .located(By.xpath("//button[contains(@class, 'oxd-button--secondary')]"));
}