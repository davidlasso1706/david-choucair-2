package com.testautomation.orangehrm.definiciones.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import com.testautomation.orangehrm.definiciones.ui.PaginaLogin;

public class RealizarLogin implements Task {
    private final String usuario;
    private final String contrasena;

    public RealizarLogin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public static RealizarLogin conCredenciales(String usuario, String contrasena) {
        return new RealizarLogin(usuario, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(PaginaLogin.CAMPO_USUARIO),
                Enter.theValue(contrasena).into(PaginaLogin.CAMPO_CONTRASENA),
                Click.on(PaginaLogin.BOTON_LOGIN)
        );
    }
}