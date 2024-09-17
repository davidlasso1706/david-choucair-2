package com.testautomation.orangehrm.definiciones;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import com.testautomation.orangehrm.definiciones.tareas.RealizarLogin;
import com.testautomation.orangehrm.definiciones.tareas.NavegarA;
import com.testautomation.orangehrm.definiciones.tareas.AgregarCandidato;
import com.testautomation.orangehrm.definiciones.preguntas.DetallesDelCandidato;
import com.testautomation.orangehrm.definiciones.utilidades.ConfigWebDriver;
import static com.testautomation.orangehrm.definiciones.utilidades.CustomAssertions.verifierQue;

public class DefinicionDePasos {

    private Actor actor = Actor.named("Usuario");

    @Dado("que el usuario ha iniciado sesión en OrangeHRM")
    public void usuarioHaIniciadoSesion() {
        actor.can(BrowseTheWeb.with(ConfigWebDriver.getDriver()));
        actor.attemptsTo(
                RealizarLogin.conCredenciales("Admin", "admin123")
        );
    }

    @Cuando("el usuario navega a la sección de {string}")
    public void usuarioNavegaASeccion(String seccion) {
        actor.attemptsTo(NavegarA.laSeccion(seccion));
    }

    @Cuando("añade un nuevo candidato")
    public void anadeNuevoCandidate() {
        actor.attemptsTo(AgregarCandidato.conDatos("John", "Doe", "john.doe@example.com"));
    }

    @Entonces("los datos del candidato deben corresponder a los ingresados")
    public void verificarDatosCandidate() {
        actor.should(
                verifierQue(DetallesDelCandidato.nombre()).esIgualA("John"),
                verifierQue(DetallesDelCandidato.apellido()).esIgualA("Doe"),
                verifierQue(DetallesDelCandidato.email()).esIgualA("john.doe@example.com"),
                verifierQue(DetallesDelCandidato.estado()).esIgualA("Contratado")
        );
    }
}