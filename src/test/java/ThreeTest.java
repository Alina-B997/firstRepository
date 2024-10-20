import Pages.AndBack;
import Pages.PageAllForCats;
import Pages.ImageDrapalka;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.time.Duration;

public class ThreeTest {

  WebDriver driver;
  WebDriverWait wait;
  PageAllForCats pageAllForCats;
  ImageDrapalka imageDrapalka;
  AndBack andBack;

  @BeforeTest

  public void setupDriver() {
  System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://shinshilka.ua/ua/g1357806-tovary-dlya-koshek");
  wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  pageAllForCats = new PageAllForCats(driver);
  imageDrapalka = new ImageDrapalka(driver);
  andBack = new AndBack(driver);
  PageFactory.initElements(driver, this);
    }

    @Test

    public void myTest (){

    pageAllForCats.selectLocation();
    pageAllForCats.clickSearch();
    imageDrapalka.clickE();
    imageDrapalka.waitIng();
    andBack.backForPage();
    WebElement answer = driver.findElement(By.xpath("//h1"));
      Assert.assertEquals(answer.getText(), "Когтеточка - килимок");
    }

   @AfterTest
  public void closeDriver () {
  driver.quit();
   }

}