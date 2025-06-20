package com.thetestingacademy.ex02_Selenium_Basics;

public class TestSelenium06_SystemGetPro_Selenium03 {

    public static void main(String[] args) {


        // If you are using selenium 3.14


        // Firefox
        System.setProperty("webDriver.gecko.driver", "path/to/geckodriver.exe");
        // Chrome
        System.setProperty("webDriver.chrome.driver", "path/to/chromedriver.exe");
        // IE
        System.setProperty("webDriver.ie.driver", "path/to/IEDriverServer.exe");
        // Safari
        System.setProperty("webDriver.safari.driver", "path/to/safariDriver");


        // Selenium 4.x - Selenium Manager - will automatically download the Drivers all

        // when needed when you start the Selenium server.


    }
}

