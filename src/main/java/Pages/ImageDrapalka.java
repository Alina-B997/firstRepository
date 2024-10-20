package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ImageDrapalka {

    private WebDriver driver;
    private WebDriverWait wait;

    public ImageDrapalka(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@src='https://images.prom." +
            "ua/840151037_w296_h200_trixie-tx-4303-drapak-gojdalka.jpg']" )
    WebElement imageClick;

    @FindBy(xpath = "//*[@class='b-sundry']")
    WebElement text;

    public void clickE() {
        imageClick.click();
    }

    public void waitIng(){
       }


}
