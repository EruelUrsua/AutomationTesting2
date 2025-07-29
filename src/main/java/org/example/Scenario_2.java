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
public class Scenario_2 {
    public static void scenario2() {
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



        // Scenario 2

        System.out.println("Scenario 2");

        //1.  log in using locked out user

        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //2. verify error message

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-button")));

        boolean button_error = driver.findElement(By.className("error-button")).isDisplayed();

        if (button_error == false)

        {
            System.out.println("user did not receive an error message");
        }

        else {

            System.out.println("user has received the error message");

            //driver.findElement(By.className("error-button")).click();
        }





    }

    }


