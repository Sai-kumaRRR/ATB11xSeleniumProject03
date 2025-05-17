package com.thetestingacademy.ex03_Selenium_MiniProject01;


import org.openqa.selenium.WebDriver;



public class CommonToAll {

    public void openBrowser(WebDriver driver,String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver){
        driver.quit();
    }
}

