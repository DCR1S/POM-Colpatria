package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("https://demoqa.com/date-picker")
public class DatePickerPageObject extends PageObject {

  By txtDate = By.id("datePickerMonthYearInput");
  By txtDateAndTime = By.id("dateAndTimePickerInput");
  By divDatePicker = By.id("datePickerContainer");

    public By getTxtDate() {
        return txtDate;
    }

    public By getTxtDateAndTime() {
        return txtDateAndTime;
    }

    public By getDivDatePicker() {
        return divDatePicker;
    }

    public void vaciarCamposDate(){
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDate()).sendKeys(Keys.BACK_SPACE);
    }


    public void vaciarCamposDateAndTime(){
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);
        getDriver().findElement(getTxtDateAndTime()).sendKeys(Keys.BACK_SPACE);

    }
}
