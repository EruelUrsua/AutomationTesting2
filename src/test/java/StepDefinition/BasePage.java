package StepDefinition;

import io.cucumber.java.en.Given;

import static org.junit.Assert.assertEquals;
import static pages.BasePage.*;

public class BasePage {

    @Given("User is in the Login page")
    public void user_is_in_the_Login_page() throws InterruptedException{
        String swag = visibility_title();
        assertEquals(swag, "Swag Labs");
    }

}
