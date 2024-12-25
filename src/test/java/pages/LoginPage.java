package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage {
    // Pagefactory Pattern 

    @FindBy(css = "i.ion-log-in")
    WebElement login;

    @FindBy(css = "input[name='email']")
    WebElement email;

    @FindBy(css = "input[name='password']")
    WebElement password;

    @FindBy(css = ".btn.btn-lg.btn-primary.pull-xs-right") // Corrected selector
    WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void ClickLogIn() {
        login.click();
    }

    public void ValidLogin(String strUser, String strPwd, WebDriver driver) {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for elements to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(email)).sendKeys(strUser);
        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(strPwd);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    @Test
    public void f() {
        // Test implementation here
    }
}
