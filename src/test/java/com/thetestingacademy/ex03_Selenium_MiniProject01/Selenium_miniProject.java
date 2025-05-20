package com.thetestingacademy.ex03_Selenium_MiniProject01;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_miniProject extends CommonToAll {
    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new EdgeDriver();
        openBrowser(driver, "https://katalon-demo-cura.herokuapp.com");

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("Testcase Passed!");
            Assert.assertTrue(true);
        } else {
            Assert.fail("CURA Healthcare Service text is not visible");
            //throw new Exception("CURA Healthcare Service text is not visible");
        }

        closeBrowser(driver);


    }

}




