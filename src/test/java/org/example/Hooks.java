package org.example;
import cucumber.api.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Util{
    BrowserManager browserManager = new BrowserManager();

    @Before
    public void setBrowser() {
        browserManager.setBrowser();
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
            System.out.println("Test Case Failed");
        }
        driver.close();
    }

}
