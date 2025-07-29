package StepDefinition;


import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static pages.HomePage.*;

public class HomePage {

    @Then("^User should be able to view the home page")
    public void product_validation() {
       String actualproducts = visibility_products();
       assertEquals(actualproducts, "Sauce Labs Backpack");

    }
}
