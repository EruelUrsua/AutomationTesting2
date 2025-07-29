package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Scenario_1 {
    public static void scenario1(){

        System.setProperty("webdriver.chrome.driver", "D:\\Notes\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        prefs.put("profile.credentials_enable_service", false);


        options.setExperimentalOption("prefs",prefs);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");
        //driver.manage().window().maximize();
        driver.manage().window().setPosition(new Point(490, 0));



        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login-button")));

        // Scenario 1

        System.out.println("Scenario 1");

        //1. log in using standard user

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //2. verify that user is able to navigate to home

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"inventory_container\"]")));

        boolean container_inventory = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]")).isDisplayed();

        if(!container_inventory) {
            System.out.println("user failed to navigate to home");
        }

        else
        {
            System.out.println("user was able to navigate to home");
            System.out.println("login");
        }

        //3. log out

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
        driver.findElement(By.id("react-burger-menu-btn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu_button_container\"]/div/div[2]/div[1]/nav")));

        driver.findElement(By.id("logout_sidebar_link")).click();


        //4. verify that user is navigated to login page

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login-button")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login_container")));

        boolean container_login = driver.findElement(By.className("login_container")).isDisplayed();

        if(!container_login) {
            System.out.println("user failed to navigate to login page");
        }

        else
        {
            System.out.println("user was able to navigate to login page");

            System.out.println("logout");

        }


    }
}
