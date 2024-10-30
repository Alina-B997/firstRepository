import Pages.JgAccount;
import Pages.LoginForm;
import Pages.WikiMain;
import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners({AllureTestNg.class})
public class ThirdTest {

    WebDriver driver;
    WebDriverWait wait;
    WikiMain wikiMain;
    LoginForm loginForm;
    JgAccount jgAccount;

    @BeforeTest

    public void onDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://uk.wikipedia.org/wiki/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wikiMain = new WikiMain(driver);
        loginForm = new LoginForm(driver);
        jgAccount = new JgAccount(driver);
        PageFactory.initElements(driver, this);
    }


    @Test

    public void testLogin(){

        wikiMain.loginClick();
        loginForm.name();
        loginForm.password();
        loginForm.loginButton();
        loginForm.waiting();
        jgAccount.comWiki();
        jgAccount.link();
        WebElement answerAssert = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(answerAssert.getText(), "Українська мова");
    }

    @AfterTest

    public void offDriver(){
        driver.quit();
    }
}
