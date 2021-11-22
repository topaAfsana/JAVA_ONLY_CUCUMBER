package QA.Stepdefs;

import QA.Pages.BasePage;
import io.cucumber.java.en.Given;

public class stepdef2 extends BasePage {
    @Given("User go to Facebook")
    public void user_go_to_facebook() {
        initializeBrowser();
//    driver.get("https:www.facebook.com");
        driver.get(prop.getProperty("url"));

        System.out.println(driver.getTitle());
        tearDown();
    }
}
