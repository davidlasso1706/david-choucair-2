package com.testautomation.orangehrm.definiciones.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import com.testautomation.orangehrm.definiciones.ui.Menu;

public class NavegarA implements Task {
    private final String seccion;

    public NavegarA(String seccion) {
        this.seccion = seccion;
    }

    public static NavegarA laSeccion(String seccion) {
        return new NavegarA(seccion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Menu.OPCION_MENU(seccion))
        );
    }
}