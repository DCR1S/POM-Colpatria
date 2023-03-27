package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("es-ES"));

    private String filepath, sheetName;

    public DataInjection(){
        this.filepath = "resources/datosPrueba.xlsx";
        this.sheetName = "data";
    }

    public String getFilepath() {
        return filepath;
    }

    public String getSheetName() {
        return sheetName;
    }
}
