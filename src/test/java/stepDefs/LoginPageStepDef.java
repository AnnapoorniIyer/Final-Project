package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageStepDef {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp() {
       
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        driver.get("https://conduit-realworld-example-app.fly.dev/");
        loginPage = new LoginPage(driver);
        loginPage.ClickLogIn();
    }

    @When("User provide the {string} and {string}")
    public void user_provide_the_and(String username, String password) {
        loginPage.ValidLogin(username, password, driver);
    }

    @Then("user should be on home page")
    public void user_should_be_on_home_page() {
        // Add assertions to verify that the user is on the home page
    }

  
   
    }

