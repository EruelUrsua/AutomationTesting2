package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class BasePage extends BrowserDriver {

    public static String sl_title_xpath = "//*[@id=\"root\"]/div/div[1]";

    public static String visibility_title() throws InterruptedException{
        Thread.sleep(2000);
        String swag =  driver.findElement(By.xpath(sl_title_xpath)).getText();
        return swag;
    }

}
