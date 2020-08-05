package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    // stored variable
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browserName");
    String username = loadProp.getProperty("sauce_username");
    String accessKey = loadProp.getProperty("sauce_accessKey");
    String URL = "https://"+loadProp.getProperty("sauce_username")+":"+loadProp.getProperty("sauce_accessKey")+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    boolean sauceLab = true;
    public void setBrowser() {
        // if condition is true..............................

        if (sauceLab) {
            System.out.println("Running in sauceLab  with browser "+ browserName);
            if (browserName.equalsIgnoreCase("firefox"))
            {
                DesiredCapabilities caps = DesiredCapabilities.firefox();
                caps.setCapability("platform","windows 7");
                caps.setCapability("version","56");

                try{
                    driver = new RemoteWebDriver(new URL(URL),caps);
                }catch (MalformedURLException e){
                    e.printStackTrace();
                }
            } else if (browserName.equalsIgnoreCase("chrome")) {

                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform","windows 7");
                caps.setCapability("version","67.0");

                try{
                    driver = new RemoteWebDriver(new URL(URL),caps);
                }catch (MalformedURLException e){
                    e.printStackTrace();
                }
            } else if (browserName.equalsIgnoreCase("ie")) {

                DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
                caps.setCapability("platform","windows 10");
                caps.setCapability("version","11");

                try{
                    driver = new RemoteWebDriver(new URL(URL),caps);
                }catch (MalformedURLException e){
                    e.printStackTrace();
                }
            }
            else if (browserName.equalsIgnoreCase("Safari")){

                DesiredCapabilities caps = DesiredCapabilities.safari();
                caps.setCapability("platform","oS x 10.10");
                caps.setCapability("version","8.0");

                try{
                    driver = new RemoteWebDriver(new URL(URL),caps);
                }catch (MalformedURLException e){
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("BrowserName is not correct or empty " + browserName);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
            driver.get("https://opensource-demo.orangehrmlive.com/");
        } else {
            if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else {
                System.out.println("BrowserName is not correct or empty " + browserName);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }

    }

}












      /*  if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else {
            System.out.println("BrowserName is not correct or empty " +browserName);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }*/

