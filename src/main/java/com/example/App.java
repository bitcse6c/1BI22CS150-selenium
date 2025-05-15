package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args) 
    {
       

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();

        
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        WebElement username = driver.findElement(By.id("login_field"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("SHASHANK9060");
        password.sendKeys("sHashank#123");

        driver.findElement(By.name("commit")).click();

       
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.quit();
    }
}

