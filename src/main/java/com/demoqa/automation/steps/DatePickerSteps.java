package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.DatePickerPageObject;
import com.demoqa.automation.utils.Excel;
import com.demoqa.automation.utils.Javascript;
import com.demoqa.automation.utils.SpecialMethods;
import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class DatePickerSteps {

    DatePickerPageObject pageObject = new DatePickerPageObject();
    DataInjection data = new DataInjection();
    Logger log = Logger.getLogger(WebTableSteps.class);


    @Step("Abrir navegador")
    public void abrirNavegador(){
        pageObject.open();
        SpecialMethods.takeScreenShotShortPage(pageObject.getDriver());
        log.info("SE ABRE EL NAVEGADOR");
    }

    @Step("LLenar campos de fecha y hora")
    public void llenarCamposFechaHora() throws IOException {
        pageObject.vaciarCamposDate();

        pageObject.getDriver().findElement(pageObject.getTxtDate()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,6));
        pageObject.getDriver().findElement(pageObject.getTxtDate()).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pageObject.vaciarCamposDateAndTime();
        pageObject.getDriver().findElement(pageObject.getTxtDateAndTime()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,7));
        pageObject.getDriver().findElement(pageObject.getTxtDateAndTime()).sendKeys(Keys.ENTER);

        Javascript.scrollDown(pageObject.getDriver(),"100");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Step("valido que esten las fechas en los input")
    public void validarQueEstenLasfechasEnLosCampos() throws IOException {
        assertThat(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,6), Matchers.is(pageObject.getDriver().findElement(pageObject.getTxtDate()).getAttribute("value")));
    }
}
