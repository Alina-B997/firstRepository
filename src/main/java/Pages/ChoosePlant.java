package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChoosePlant {
    private WebDriver driver;
    private WebDriverWait wait;

    public ChoosePlant (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@src='/images/stories/shop/product/resized/aphelandra_200x200.jpg']")
    WebElement imgClick;


        public void imageClick(){
        imgClick.click();
        }
}
