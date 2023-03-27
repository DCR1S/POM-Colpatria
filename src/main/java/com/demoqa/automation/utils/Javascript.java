package com.demoqa.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;

public class Javascript {

    public static void clickJS(WebDriver driver, By by) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }



    public static void scrollDown(WebDriver driver, String pixelsToDown){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = MessageFormat.format("window.scrollBy(0, {0}.", pixelsToDown);
        script = script+')';
        js.executeScript(script);
    }

    public static String getTextByIDJS(WebDriver driver, String idElemento) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = MessageFormat.format("document.getElementById('", idElemento);
        script = script+"').value";
        String text = (String) js.executeScript(script);
        return text;
    }


}
