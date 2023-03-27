package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/webtables")
public class WebTablePageObject extends PageObject {

    By btnAddRegister = By.id("addNewRecordButton");
    By txtFirstName = By.id("firstName");
    By txtLastName = By.id("lastName");
    By txtEmail = By.id("userEmail");
    By txtAge = By.id("age");
    By txtSalario = By.id("salary");
    By txtDepartment = By.id("department");
    By btnRegister = By.id("submit");
    By lblEmail = By.xpath("//div[@class=\"rt-tbody\"]/div[4]//div[4]");


    public By getBtnAddRegister() {
        return btnAddRegister;
    }

    public By getTxtFirstName() {
        return txtFirstName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtAge() {
        return txtAge;
    }

    public By getTxtSalario() {
        return txtSalario;
    }

    public By getTxtDepartment() {
        return txtDepartment;
    }

    public By getBtnRegister() {
        return btnRegister;
    }

    public By getLblEmail() {
        return lblEmail;
    }
}
