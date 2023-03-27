package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.WebTableSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class WebTableStepDefinitions {

    @Steps
    WebTableSteps steps;


    //Para Registro
    @Dado("^que estoy en la pagina de demoqa web tables$")
    public void queEstoyEnLaPaginaDeDemoqaWebTables() {
        steps.abrirNavegador();
    }


    @Cuando("^llene todos los campos requeridos$")
    public void lleneTodosLosCamposRequeridos() throws IOException, InterruptedException {
       steps.llenarCamposDelFormulario();
    }

    @Entonces("^visualizo en la tabla el nuevo usuario$")
    public void visualizoEnLaTablaElNuevoUsuario() throws IOException {
         steps.validarRegistro();
    }

    @Entonces("^quiera eliminar un registro existente$")
    public void quieraEliminarUnRegistroExistente() throws IOException, InterruptedException {
         steps.eliminarDatosDeLaTabla();
    }


}
