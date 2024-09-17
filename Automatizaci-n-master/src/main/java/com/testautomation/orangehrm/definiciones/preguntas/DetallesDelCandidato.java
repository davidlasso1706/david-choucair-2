package com.testautomation.orangehrm.definiciones.preguntas;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import com.testautomation.orangehrm.definiciones.ui.PaginaReclutamiento;

public class DetallesDelCandidato {
    public static Question<String> nombre() {
        return actor -> Text.of(PaginaReclutamiento.CAMPO_NOMBRE).answeredBy(actor);
    }

    public static Question<String> apellido() {
        return actor -> Text.of(PaginaReclutamiento.CAMPO_APELLIDO).answeredBy(actor);
    }

    public static Question<String> email() {
        return actor -> Text.of(PaginaReclutamiento.CAMPO_EMAIL).answeredBy(actor);
    }

    public static Question<String> estado() {
        return actor -> Text.of(PaginaReclutamiento.CAMPO_ESTADO).answeredBy(actor);
    }
}