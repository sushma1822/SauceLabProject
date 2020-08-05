package org.example;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Util extends BasePage {
    //reusable method to clickOnElement
    public static void clickOnElement(By by, int time) {
        driver.findElement(by).click();
    }

    //method for type text
    public static void typeText(By by, String text, int time) {
        driver.findElement(by).sendKeys(text);
    }

    // reusable method to get text from elements
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // method for times stamp
    public static long timestamp() {
        return (System.currentTimeMillis());
    }

    //method for select from drop down  by visible text
    public static void selectFromDropDownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    // method for select drop down by value
    public static void selectFromDropDownByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.deselectByValue(value);
    }

    // method for drop down by index
    public static void selectFromDropDownByIndex(By by, int n) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(n);
    }
    public static String getUrl(){
        return driver.getCurrentUrl();
    }


    public void takeScreenShort(String ScreenShortName) {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with test method name
        try {
            //  String Screenshotname = new String();
            FileUtils.copyFile(scrFile, new File(("src\\ScreenShot" + ScreenShortName + ".png")));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
