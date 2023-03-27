package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.WebTablePageObject;
import com.demoqa.automation.utils.Excel;
import com.demoqa.automation.utils.SpecialMethods;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;
import org.apache.log4j.Logger;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class WebTableSteps {
     WebTablePageObject pageObject = new WebTablePageObject();
     DataInjection data = new DataInjection();
    Logger log = Logger.getLogger(WebTableSteps.class);


     @Step("Abrir navegador")
    public void abrirNavegador(){
         pageObject.open();
         SpecialMethods.takeScreenShotShortPage(pageObject.getDriver());
         log.info("SE ABRE EL NAVEGADOR");
     }

     @Step("Llenar todos los campos")
    public void llenarCamposDelFormulario() throws IOException, InterruptedException {
         pageObject.getDriver().findElement(pageObject.getBtnAddRegister()).click();
         pageObject.getDriver().findElement(pageObject.getTxtFirstName()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,0));

         pageObject.getDriver().findElement(pageObject.getTxtLastName()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,1));

         pageObject.getDriver().findElement(pageObject.getTxtEmail()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,2));

         pageObject.getDriver().findElement(pageObject.getTxtAge()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,3));
         pageObject.getDriver().findElement(pageObject.getTxtSalario()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,4));
         pageObject.getDriver().findElement(pageObject.getTxtDepartment()).sendKeys(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,5));
         Times.waitFor(2000);
         SpecialMethods.takeScreenShotShortPage(pageObject.getDriver());
         pageObject.getDriver().findElement(pageObject.getBtnRegister()).click();
         Times.waitFor(4000);
         log.info("SE LLENARON LOS CAMPOS");
     }

     @Step("Validar que el registro fui exitoso")
    public void validarRegistro() throws IOException {
         SpecialMethods.takeScreenShotShortPage(pageObject.getDriver());
         log.info("El email es: "+Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,2));
         assertThat(pageObject.getDriver().findElement(pageObject.getLblEmail()).getText(), Matchers.is(Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,2)));
         log.info("REGISTRO EXITOSO");

     }

     @Step("Eliminar datos de la tabla")
    public void eliminarDatosDeLaTabla() throws IOException, InterruptedException {
         Times.waitFor(2000);
         String xPathEliminar = ("//div[text()='nombre']//following-sibling::div[text()='apellido']//parent::div//span[@title='Delete']");
         String eliminar = xPathEliminar.replace("nombre", Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,0)).replace("apellido", Excel.getCellValue(data.getFilepath(),data.getSheetName(),1,1));
         By xPathEliminarRegistro = By.xpath(eliminar);
         pageObject.getDriver().findElement(xPathEliminarRegistro).click();
         log.info("ELIMINACION EXITOSA");
         Times.waitFor(2000);
     }
}
