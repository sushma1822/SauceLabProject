package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Util {
    LoadProp loadProp = new LoadProp();
    private By _EnterUserName = By.xpath("//input[@name=\"txtUsername\"]");
    private By _EnterPassword = By.xpath("//input[@name=\"txtPassword\"]");
    private By _LoinButton  = By.xpath("//input[@name=\"Submit\"]");
    private By _ErrorMassage = By.xpath("//span[@id=\"spanMessage\"]");
    public void  verifyUrl(){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://opensource-demo.orangehrmlive.com/");
    }
    public  void  userShouldEnterUsername(){
        typeText(_EnterUserName,loadProp.getProperty("username"),20);
    }
    public void  userShouldEnterPassword(){
        typeText(_EnterPassword,loadProp.getProperty("password"),20);
    }
    public  void  userShouldClickOnButton(){
        clickOnElement(_LoinButton,20);
    }
    public void userShouldVerifyTextOnWelcomePage(){
        String expectedTitle ="Welcome Admin";
        String actualText1 = getTextFromElement(By.xpath("//a[@id=\"welcome\"]"));
    }


    public void userEnterUsername(String username) {
        typeText(_EnterUserName,username,20);
    }

    public void userEnterPassword(String password) {
        typeText(_EnterPassword,password,20);
    }

    public void userShouldSeeVerifyMassage(String massage) {
     getTextFromElement(_ErrorMassage);
     String expectedErrorMassageText = getTextFromElement(_ErrorMassage);
     System.out.println(expectedErrorMassageText);
        Assert.assertEquals(expectedErrorMassageText,getTextFromElement(_ErrorMassage));
    }
}
