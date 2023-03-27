package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.DatePickerSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class DatePickerStepDefinitions {
    @Steps
    DatePickerSteps steps;
    // Para DatePicker

    @Dado("^que estoy en la pagina de demoqa datepicker$")
    public void queEstoyEnLaPaginaDeDemoqaDatepicker() {
       steps.abrirNavegador();
    }


    @Cuando("^llene todos los campos requeridos para fecha y hora$")
    public void lleneTodosLosCamposRequeridosParaFechaYHora() throws IOException {
         steps.llenarCamposFechaHora();
    }

    @Entonces("^visualizo la fecha o hora en el input$")
    public void visualizoLaFechaOHoraEnElInput() throws IOException {
   steps.validarQueEstenLasfechasEnLosCampos();
    }
}
