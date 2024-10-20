package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginForm {

    private WebDriver driver;
    private WebDriverWait wait;

   public LoginForm (WebDriver driver){
       this.driver = driver;
       wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='wpName1']")
    WebElement name;

    @FindBy(xpath = "//input[@id='wpPassword1']")
    WebElement password;

    @FindBy(xpath = "//*[@id='wpLoginAttempt']")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id='Ласкаво_просимо_до_Вікіпедії,']")
    WebElement waiting;


        public void name(){
        name.sendKeys("Джигурдаа");
        }

        public void password(){
        password.sendKeys("андрійович");
        }

        public void loginButton(){
        loginButton.click();
        }

        public void waiting(){
        wait.until(ExpectedConditions.visibilityOf(waiting));
        }
}
