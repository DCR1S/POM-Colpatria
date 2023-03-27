package com.demoqa.automation.steps;

import com.demoqa.automation.pageobjects.AlertsFramesAndWindowsPageObject;
import com.demoqa.automation.utils.SpecialMethods;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlertsFramesAndWindowsSteps {
      AlertsFramesAndWindowsPageObject pageObject = new AlertsFramesAndWindowsPageObject();
    Logger log = Logger.getLogger(AlertsFramesAndWindowsSteps.class);
    @Step("Abrir navegador")
    public void abrirNavegador(){
        pageObject.open();
        SpecialMethods.takeScreenShotShortPage(pageObject.getDriver());
        log.info("SE ABRE EL NAVEGADOR");
    }

    @Step("Abrir alert")
    public void abrirPrimerAlert(){
       pageObject.getDriver().findElement(pageObject.getBtnPrimerAlert()).click();
        try {
            Times.waitFor(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Cerrar alert")
    public void cerrarPrimerAlert(){
        if(existDialog()){
            pageObject.getDriver().switchTo().alert().accept();
        }

    }

    public boolean existDialog() {
        boolean existeAlerta = true;
        try {
            pageObject.getDriver().switchTo().alert(); // SE GENERA EXCEPCI�N SI NO HAY ALERTA
        } catch (NoAlertPresentException e) {
            existeAlerta = false;
        }
        return existeAlerta;
    }

    public void waitDialog(int secondsWait, WebDriver driver) {
        int maximoEspera = secondsWait;
        if (secondsWait <= 0)
            maximoEspera = 10;

        WebDriverWait wait = new WebDriverWait(driver, maximoEspera);
        // Wait for the alert to be displayed and store it in a variable
        wait.until(ExpectedConditions.alertIsPresent());
    }

    @Step("Abrir 2do alert")
    public void abrirSegundoAlert(){
        pageObject.getDriver().findElement(pageObject.getBtnSegundoAlert()).click();
        try {
            Times.waitFor(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Cerrar 2do alert")
    public void cerrarSegundoAlert(){
        waitDialog(5, pageObject.getDriver());
        if(existDialog()){
            pageObject.getDriver().switchTo().alert().accept();
        }
    }

    @Step("Abrir 3er alert")
    public void abrirTercerAlert(){
        pageObject.getDriver().findElement(pageObject.getBtnTercerAlert()).click();
        try {
            Times.waitFor(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Cerrar 3er alert")
    public void cerrarTercerAlert(){

        if(existDialog()){
            pageObject.getDriver().switchTo().alert().accept();
        }
    }


    @Step("Abrir 4to alert")
    public void abrirCuartoAlert(){
        pageObject.getDriver().findElement(pageObject.getBtnTercerAlert()).click();
        try {
            Times.waitFor(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("Cerrar 4to alert")
    public void cerrarCuartoAlert(){

        if(existDialog()){
            pageObject.getDriver().switchTo().alert().accept();
        }
    }

    @Step("Validar que no hayan alertas")
    public void validarQueNoHayanAvisos(){
        assertFalse("Existen alertas", existDialog());
    }
}
