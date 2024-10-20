import Pages.AddPlusAndCart;
import Pages.ChoosePlant;
import Pages.MainPage;
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
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest {

    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    ChoosePlant choosePlant;
    AddPlusAndCart addPlusAndCart;

    @BeforeTest

    public void setupDriver(){
     System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://amelia-flowers.com/");
     wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     mainPage = new MainPage(driver);
     choosePlant = new ChoosePlant(driver);
     addPlusAndCart = new AddPlusAndCart(driver);
     PageFactory.initElements(driver, this);
    }

    @Test

    public void testPlant(){

        mainPage.setSearchField();
        mainPage.setSearchButton();
        mainPage.waiter();
        choosePlant.imageClick();
        addPlusAndCart.addPlus();
        addPlusAndCart.addCart();
        addPlusAndCart.clickBears();
        WebElement answer = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(answer.getText(), "Ведмедики ");

    }

    @AfterTest

    public void closeDriver(){
    driver.quit();
    }

}
