package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


public class AuthPage extends BrowserDriver {

    public static String username_tb_xpath = "//*[@id=\"user-name\"]";
    public static String password_tb_xpath = "//*[@id=\"password\"]";
    public static String login_btn_xpath = "//*[@id=\"login-button\"]";


    public static void sendkeys_username_tb(){

        driver.findElement(By.xpath(username_tb_xpath)).sendKeys("standard_user");

    }

    public static void sendkeys_password_tb(){

        driver.findElement(By.xpath(password_tb_xpath)).sendKeys("secret_sauce");

    }

    public static void click_login_btn() {
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
}
