package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("https://demoqa.com/alerts")
public class AlertsFramesAndWindowsPageObject extends PageObject {

    By btnPrimerAlert = By.id("alertButton");
    By btnSegundoAlert = By.id("timerAlertButton");
    By btnTercerAlert = By.id("confirmButton");
    By btnCuartoAlert = By.id("promtButton");

    public By getBtnPrimerAlert() {
        return btnPrimerAlert;
    }

    public By getBtnSegundoAlert() {
        return btnSegundoAlert;
    }

    public By getBtnTercerAlert() {
        return btnTercerAlert;
    }

    public By getBtnCuartoAlert() {
        return btnCuartoAlert;
    }
}
