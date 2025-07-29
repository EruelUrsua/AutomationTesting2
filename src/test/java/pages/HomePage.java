package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;


public class HomePage extends BrowserDriver {
    public static String prod_heading_xpath = "//*[@id=\"item_4_title_link\"]/div";

    public static String visibility_products(){
       String actualproducts =  driver.findElement(By.xpath(prod_heading_xpath)).getText();
       return actualproducts;
    }
}
