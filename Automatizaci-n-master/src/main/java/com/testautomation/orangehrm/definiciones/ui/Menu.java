package com.testautomation.orangehrm.definiciones.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Menu {
    public static Target OPCION_MENU(String nombreOpcion) {
        return Target.the("opción de menú " + nombreOpcion)
                .located(By.xpath("//span[contains(text(),'" + nombreOpcion + "')]"));
    }
}