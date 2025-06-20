package com.thetestingacademy.ex06_Selenium_Mini_Project02;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Add_Extension {

    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex06_miniProject02/Adblock.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");


        driver.manage().deleteAllCookies();
        driver.quit();


    }


}


