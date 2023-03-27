package com.demoqa.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/CaracteristicasGenerales.feature",
        glue = "com.demoqa.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@RegistroYEliminacion or @DatePicker or @AlertsFramesAndWindows ")
public class DemoQARunner {
}
