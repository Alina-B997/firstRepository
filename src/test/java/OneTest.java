import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OneTest {


        WebDriver driver;

        @BeforeTest
        public void setupDriver () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
    }

        @Test
        public void myTest () {

     WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
     firstname.sendKeys("Ritalinia");

     WebElement lastname = driver.findElement(By.xpath("//input[@id='surname']"));
     lastname.sendKeys("Pavlenkovalozhechkina");

     WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
     age.sendKeys("27");

     WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
     country.sendKeys("Ukraine");

     WebElement notes = driver.findElement(By.xpath("//textarea[@id='notes']"));
    notes.sendKeys("This All about Rita");

    WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
    button.click();

     WebElement answer = driver.findElement(By.xpath("//li[@id='valid-input-value']"));

     Assert.assertEquals(answer.getText(), "Your Input passed validation");

        }


    @AfterTest
        public void closeDriver () {
        driver.quit();
    }

}

