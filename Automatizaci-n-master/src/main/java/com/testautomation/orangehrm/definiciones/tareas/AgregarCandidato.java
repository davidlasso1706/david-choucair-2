package com.testautomation.orangehrm.definiciones.tareas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.testautomation.orangehrm.definiciones.ui.PaginaReclutamiento;

public class AgregarCandidato implements Task {
    private final String nombre;
    private final String apellido;
    private final String email;

    public AgregarCandidato(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public static AgregarCandidato conDatos(String nombre, String apellido, String email) {
        return new AgregarCandidato(nombre, apellido, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaReclutamiento.BOTON_AGREGAR),
                Enter.theValue(nombre).into(PaginaReclutamiento.CAMPO_NOMBRE),
                Enter.theValue(apellido).into(PaginaReclutamiento.CAMPO_APELLIDO),
                Enter.theValue(email).into(PaginaReclutamiento.CAMPO_EMAIL),
                Click.on(PaginaReclutamiento.BOTON_GUARDAR)
        );
    }
}