package com.thetestingacademy.ex16_Select_Static;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium_Select_Static {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();


        WebElement element_select = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_select);
//        Select.selectByIndex(1);
//        select.selectByVisibleText("Option 1");
        select.selectByValue("2");

    }
}