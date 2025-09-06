package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class GoogleSearch {

    WebDriver driver;

    @Given("I open the Chrome browser")
    public void i_open_the_chrome_browser() {
        driver = new ChromeDriver();
    }

    @When("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver.get(url);
    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }
}
