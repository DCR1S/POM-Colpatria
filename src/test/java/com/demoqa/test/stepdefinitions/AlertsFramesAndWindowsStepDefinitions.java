package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.AlertsFramesAndWindowsSteps;
import com.demoqa.automation.steps.DatePickerSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AlertsFramesAndWindowsStepDefinitions {
    @Steps
    AlertsFramesAndWindowsSteps steps;

    @Dado("^que estoy en la pagina de demoqa Alerts, Frames y Windows$")
    public void queEstoyEnLaPaginaDeDemoqaAlertsFramesYWindows() {
             steps.abrirNavegador();
    }


    @Cuando("^active las alertas y las cierre$")
    public void activeLasAlertasYLasCierre() {
        steps.abrirPrimerAlert();
        steps.cerrarPrimerAlert();

        steps.abrirSegundoAlert();
        steps.cerrarSegundoAlert();

        steps.abrirTercerAlert();
        steps.cerrarTercerAlert();

        steps.abrirCuartoAlert();
        steps.cerrarCuartoAlert();
    }

    @Entonces("^visualizo que no haya ningun aviso y/o alerta presentes$")
    public void visualizoQueNoHayaNingunAvisoYOAlertaPresentes() {
       steps.validarQueNoHayanAvisos();
    }
}
