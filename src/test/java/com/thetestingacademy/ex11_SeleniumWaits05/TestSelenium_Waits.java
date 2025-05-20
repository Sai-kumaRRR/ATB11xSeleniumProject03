package com.thetestingacademy.ex11_SeleniumWaits05;


import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium_Waits {
    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price() {

        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://app.vwo.com");


    }
}
